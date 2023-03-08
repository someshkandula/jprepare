package com.somesh.coldstreamselect;

import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SensitechDecompressLogic {

    public static void main(String args[]) throws IOException {
        System.out.println (" Sensitech decompression logic begins ");
        ColdStreamSelectGetByTSR cssTSR = new ColdStreamSelectGetByTSR ();
        ColdStreamResponse csr = cssTSR.getGetByTSRResponse ("KAC2F00XS1", 3199);
        if(csr != null){
            System.out.println (csr);
        }

        System.out.println ("csr.getSensorCollection () size --> "+csr.getSensorCollection ().size ());
                csr.getSensorCollection ().forEach (d -> {
                    List<DataPoint> l = Decompress(d.getCompressedDatapoint());
                    //l.forEach (System.out::println);
                    System.out.println ("size::: "+l.size());
                });

    }

    public static List<DataPoint> Decompress(CompressedDatapoint compressedDataPointRecord)
    {
        List<DataPoint> retVal = new ArrayList<DataPoint>();
        int pointNumber = 1;
        int interval = ConvertBytesToInt(compressedDataPointRecord.getInterval (), 4);
        //int interval=21;
        int dataPointLength = compressedDataPointRecord.getDataPoints ().length;


        byte[] singlePointByteArray = new byte[2];
        DataPoint dataPoint;
        double actualValueFromJson;
        double convertedFValue;
        for (int i = 0; i < dataPointLength; i += 2)
        {
            dataPoint = new DataPoint();
            dataPoint.PointNumber = pointNumber;
            dataPoint.Time = addSeconds(convertStringDate(compressedDataPointRecord.getFirstDataPointTime ()), interval * (pointNumber - 1));
            actualValueFromJson = ConvertBytesToShort(compressedDataPointRecord.getDataPoints (), i) / 10;
            dataPoint.FValue = fahrenheitToCelsius(actualValueFromJson);

            convertedFValue = celsiusToFahrenheit (dataPoint.FValue);
            System.out.println ("PointNumber"+dataPoint.PointNumber+" , Time "+dataPoint.Time+" , FValue: "+dataPoint.FValue +", actualValueFromJson "+actualValueFromJson+" , convertedFValue "+convertedFValue);
            retVal.add(dataPoint);
            pointNumber++;
            //System.out.println ("============================");
        }
        System.out.println ("dataPointLength: "+dataPointLength+", Interval: "+interval+" compressedDataPointRecord.getFirstDataPointTime: "+compressedDataPointRecord.getFirstDataPointTime());
        DataPoint pointToMark;
        int markedPointLength = compressedDataPointRecord.getMarkedPoints ().length;
        for (int i = 0; i < markedPointLength; i += 4)
        {
            int markedId = ConvertBytesToInt(compressedDataPointRecord.getMarkedPoints (), i);
            pointToMark = retVal.get(markedId);
            pointToMark.IsMarked = true;
        }
        return retVal;
    }


    public static double celsiusToFahrenheit(double celsius)
    {
        // initialising
        double fahrenheit = 0.0;

        // formula for conversion
        fahrenheit = (celsius * 1.8) + 32.0;

        return (double) Math.round(fahrenheit * 10d) / 10d;
    }

    public static double fahrenheitToCelsius(double fahrenheit)
    {
        double celsius;
        celsius  = ((fahrenheit-32.0)*5.0)/9.0;
        return   (double) Math.round(celsius * 1000d) / 1000d;
    }

    private static Date convertStringDate(String firstDataPointTime) {
        Date postFirstParseTime = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
            postFirstParseTime = sdf.parse (firstDataPointTime);

        } catch (ParseException e) {
            System.out.println ("Error "+e.getMessage ());
            e.printStackTrace ();
        }
        return postFirstParseTime;
    }

    public static Date addSeconds(Date date, long seconds) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.SECOND, (int)seconds);
        return cal.getTime();
    }

    private static double ConvertBytesToShort(byte[] byteArray, int startIndex)
    {
        return  (short)((byteArray[startIndex] & 0xFF) << 8 | (byteArray[startIndex + 1] & 0xFF));
    }
    private static int ConvertBytesToInt(byte[] byteArray, int startIndex)
    {
        return ((byteArray[startIndex] << 24 | byteArray[startIndex + 1] << 16) | byteArray[startIndex + 2] << 8) |
                byteArray[startIndex + 3];
    }
}
