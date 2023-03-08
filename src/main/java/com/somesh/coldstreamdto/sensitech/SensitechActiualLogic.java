package com.coldstream.sensitech;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SensitechActiualLogic {

    private static final String VENDORTOKEN = "eyJhbGciOiJSUzI1NiIsImtpZCI6IkY2OUJGMEQyNEM3QUQ4NUI4Q0NCMEE0MEVFQkMzQTA3NTgzMTQ2RDciLCJ0eXAiOiJKV1QiLCJ4NXQiOiI5cHZ3MGt4NjJGdU15d3BBN3J3NkIxZ3hSdGMifQ.eyJuYmYiOjE2NjMxNjk2NjgsImV4cCI6MTY2MzE5OTY2OCwiaXNzIjoiaHR0cHM6Ly9zc28uY29sZHN0cmVhbXNlbGVjdC5jb206NDQzIiwiYXVkIjpbImh0dHBzOi8vc3NvLmNvbGRzdHJlYW1zZWxlY3QuY29tOjQ0My9yZXNvdXJjZXMiLCJjc3dlYiIsImNzd2ViLmFwaSJdLCJjbGllbnRfaWQiOiJDb2xkU3RyZWFtIiwic3ViIjoicGFya291cmFwaX5wYXJrb3VyIiwiYXV0aF90aW1lIjoiNjM3OTg3NjY0Njg0NjY3MDQ5IiwiaWRwIjoiaWRwIiwibmFtZSI6InBhcmtvdXJhcGl-cGFya291ciIsIk9yZ2FuaXphdGlvbk5hbWUiOiJwYXJrb3VyIiwiQ29tcGFueSI6InBhcmtvdXIiLCJOYW1lc3BhY2VOYW1lIjoiSFEiLCJOYW1lc3BhY2VJRCI6IjEwMTQ1IiwiT3JnYW5pemF0aW9uSUQiOiIxMDE0NSIsIlBlcm1pc3Npb25Hcm91cE5hbWUiOiJQYXJrb3VyQVBJIiwiVXNlcklEIjoiMyIsIlJvbGVJRCI6IjMiLCJHaXZlbk5hbWUiOiJEaW1pdHJpIiwiRmFtaWx5TmFtZSI6IlBhcGFqYW5pIiwicm9sZSI6WyJBZGQtTW9uaXRvcnMiLCJTZWFyY2gtQmFzaWMiXSwic2NvcGUiOlsib3BlbmlkIiwiY3N3ZWIiLCJjc3dlYi5hcGkiLCJvZmZsaW5lX2FjY2VzcyJdLCJhbXIiOlsicGFzc3dvcmQiXX0.GsWyI2n7Q2M2Tjf_5N0zerNhX2z--HkVc347dLgP2rX-fYJ9JPHBIv8hs5XIwDB5fRzKCZHeX6epen1THmua07TCzsrlpK47C0W-OKyQ7cOnl4qlx_A2SzGrtQXnm835H_T_zt8RrfgXRqUm5lfxv9EVSw-JVuJeTAU1hR5sTke1Vqp9ehFC5ZF7AJr7uhJYixyIGaMVohOsh1KkXfOA1TRN_R6-hFf0EfTE4qOwB5wYo9RU5dngn2EfHxyHn_QDBzQU9-Aaf_gEW_f9R03f2J5Ge_He2yF4FDBHb_YxGBq5VBloMatpDmP79yCO_9FTM7cQZxbsbFsXaPpnzONXkQ";

    public static final String RESETCOUNT = "resetCount";
    public static final String TRIPNUMBER = "tripNumber";

    public static void main(String args[]) throws IOException {
        SensitechActiualLogic sl = new SensitechActiualLogic ();
        System.out.println (" Sensitech decompression logic begins ");
        //ColdStreamSelectGetByTSR cssTSR = new ColdStreamSelectGetByTSR ();
        ColdStreamSelect response = null;
        int resetCount = 3199, tripNumber = 0;
        PullActiveSensorEvent device = new PullActiveSensorEvent ();
        //device.setSensorId ("KAC2F00WA1");
        device.setSensorId ("KAC2F00WN1");
        //device.setSensorId ("ABC2D00EF1");
        boolean flag = true;
        Map<String, String> deviceProperties;

        while(flag) {

            deviceProperties = device.getProperties ();

            if(deviceProperties != null) {
                resetCount = Integer.parseInt (deviceProperties.get (RESETCOUNT));
                tripNumber = Integer.parseInt (deviceProperties.get (TRIPNUMBER));
            } else {
                resetCount = 3199;
                tripNumber = 0;
            }

            response = sl.getByTSRResponse (device.getSensorId (), resetCount, tripNumber, "ABCD123");

            flag = sl.validateResponse (device, response, "ABCD123");

            System.out.println (" Flag " + flag + " resetCount " + device.getProperties ());
        }

    }


    private boolean validateResponse(PullActiveSensorEvent device, ColdStreamSelect coldStreamSelect, String uuid) {
        boolean flag = true;
        ColdStreamSelectResp coldStreamSelectResp;
        Map<String, String> deviceProperties = device.getProperties();
        System.out.println("uuid {} validateResponse started "+ uuid);
        if (coldStreamSelect != null) {
            if (coldStreamSelect.getResponseCode() == 200) {
                coldStreamSelect.setResetCount(
                        coldStreamSelect.getResetCount() - 1); // Decrement the reset count by 1...
            } else {
                flag = false;
                if(coldStreamSelect.getResetCount () < PullSensorEventConstants.RESETCOUNT3199) {
                    coldStreamSelect.setResetCount (
                            coldStreamSelect.getResetCount () + 1);
                }
            }
            if (deviceProperties != null) {
                deviceProperties.put (RESETCOUNT, String.valueOf (coldStreamSelect.getResetCount ()));
                deviceProperties.put (TRIPNUMBER, String.valueOf (0));
                device.setProperties (deviceProperties);
            } else {
                deviceProperties = new HashMap<> ();
                deviceProperties.put (RESETCOUNT, String.valueOf (coldStreamSelect.getResetCount ()));
                deviceProperties.put (TRIPNUMBER, String.valueOf (0));
                device.setProperties (deviceProperties);
            }
        }
        return flag;
    }

    private String getGETByTSRURL(String serialNumber, int resetCount, int tripNumber) {
        String SENSITECH_ULTRA_BLE_USB_URL = "https://api.coldstreamselect.com";
        String GET_TSR_URL = "/APIGateway_v22/api/GetByTSR";
        return SENSITECH_ULTRA_BLE_USB_URL + GET_TSR_URL +
                "?TripNumber=" + tripNumber +
                "&SerialNumber=" + serialNumber +
                "&ResetCount=" + resetCount;
    }

    private void buildHeaders(HttpGet request) {
        request.addHeader("Accept", "application/json");
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Authorization", "Bearer " + VENDORTOKEN);
    }
    
    public ColdStreamSelect getByTSRResponse(String serialNumber, int resetCount, int tripNumber, String uuid) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        ColdStreamSelectResp resp;
        ColdStreamSelect coldStreamSelect = new ColdStreamSelect();
        try {

            String url = getGETByTSRURL(serialNumber, resetCount, tripNumber);
            System.out.println ("URL "+url);
            HttpGet request = new HttpGet(url);
            buildHeaders(request);

            try (CloseableHttpResponse response = httpClient.execute (request)) {
                HttpEntity entity = response.getEntity ();
                System.out.println ("response.getStatusLine ().getStatusCode () "+response.getStatusLine ().getStatusCode ());
                if (response.getStatusLine ().getStatusCode () == 200 && entity != null) {
                    ObjectMapper mapper = new ObjectMapper ();
                    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                    mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
                    resp =
                            mapper.readValue (
                                    EntityUtils.toString (response.getEntity (), StandardCharsets.UTF_8),
                                    ColdStreamSelectResp.class);
                    coldStreamSelect.setResponseCode (response.getStatusLine ().getStatusCode ());
                    coldStreamSelect.setResetCount (resetCount);
                    coldStreamSelect.setColdStreamResponse (resp);
                } else {

                    coldStreamSelect.setResponseCode (response.getStatusLine ().getStatusCode ());
                    coldStreamSelect.setResetCount (resetCount);
                    coldStreamSelect.setColdStreamResponse (null);
                    coldStreamSelect.setMessage ("Monitor is not found");
                }
                System.out.println ("coldStreamSelect "+coldStreamSelect.toString ());
            } catch (Exception e){
                System.out.println ("Exception "+e);
                e.printStackTrace ();
            }
        }
        finally {
            httpClient.close();
        }
        return coldStreamSelect;
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
