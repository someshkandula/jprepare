package com.coldstream.sensitech;


import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SensitechDCLogic {

    public static void main(String args[]) throws IOException {
        System.out.println (" Sensitech decompression logic begins ");
        ColdStreamSelectGetByTSR cssTSR = new ColdStreamSelectGetByTSR ();
        SensitechResponse csr = cssTSR.getGetByTSRResponse ("KAC2F00WA1", 3199);

        System.out.println ("csr.getSensorCollection () size --> "+csr.sensorCollection.size ());
                csr.sensorCollection.forEach (d -> {
                    List<DataPoint> l = Decompress(d.compressedDatapoint);
                    //l.forEach (System.out::println);
                    System.out.println ("size::: "+l.size());
                });
    }

    public static List<DataPoint> Decompress(CompressedDatapoint compressedDataPointRecord)
    {
        List<DataPoint> retVal = new ArrayList<DataPoint>();
        int pointNumber = 1;
        int interval = ConvertBytesToInt(compressedDataPointRecord.interval.getBytes(StandardCharsets.UTF_8), 4);
        //int interval=21;
        byte[] dataPoints = compressedDataPointRecord.dataPoints.getBytes();
        int dataPointLength = dataPoints.length;


        byte[] singlePointByteArray = new byte[2];
        DataPoint dataPoint;
        for (int i = 0; i < dataPointLength; i += 2)
        {
            dataPoint = new DataPoint();
            dataPoint.PointNumber = pointNumber;

            //2022-04-26T05:20:21Z
            DateFormat dateFormat1 = new SimpleDateFormat("yyyy-mm-dd'T'hh:mm:ssz");

            String strDate = dateFormat1.format(compressedDataPointRecord.firstDataPointTime);

            //dataPoint.Time = addSeconds(convertStringDate(strDate), interval * (pointNumber - 1));
            dataPoint.FValue = ConvertBytesToShort(dataPoints, i) / 10;
            System.out.println ("PointNumber"+dataPoint.PointNumber+" , Time "+dataPoint.Time+" , FValue: "+dataPoint.FValue);
            retVal.add(dataPoint);
            pointNumber++;
        }
        System.out.println ("dataPointLength: "+dataPointLength+", Interval: "+interval+" compressedDataPointRecord.getFirstDataPointTime: "+compressedDataPointRecord.firstDataPointTime);
        //DataPoint pointToMark;
        /*int markedPointLength = compressedDataPointRecord.markedPoints.length;
        for (int i = 0; i < markedPointLength; i += 4)
        {
            int markedId = ConvertBytesToInt(compressedDataPointRecord.getMarkedPoints (), i);
            pointToMark = retVal.get(markedId);
            pointToMark.IsMarked = true;
        }*/
        return retVal;
    }

    private static Date convertStringDate(String firstDataPointTime) {
        Date postFirstParseTime = null;
        try {
            //2022-04-26T05:20:21Z
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'IST'");
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

    private static short ConvertBytesToShort(byte[] byteArray, int startIndex)
    {
        return (short)(byteArray[startIndex] << 8 | byteArray[startIndex + 1]);
    }
    private static int ConvertBytesToInt(byte[] byteArray, int startIndex)
    {
        return ((byteArray[startIndex] << 24 | byteArray[startIndex + 1] << 16) | byteArray[startIndex + 2] << 8) |
                byteArray[startIndex + 3];
    }
}
