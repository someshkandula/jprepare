package com.coldstream.sensitech;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.somesh.coldstreamselect.ColdStreamResponse;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

;

public class ColdStreamSelectGetByTSR {

    public static void main(String[] args) throws IOException {

        SensitechResponse sr = getGetByTSRResponse ("KAC2F00WA1", 3199);

        System.out.println ("csr.getSensorCollection () size --> "+sr.sensorCollection.size ());

        sr.sensorCollection.stream ().forEach (
                k -> {
                    //byte[] decodedString = new byte[0];
                    //decodedString = Base64.decodeBase64((k.compressedDatapoint.dataPoints).getBytes("UTF-8"));

                    byte[] decodedBytes = k.compressedDatapoint.dataPoints.getBytes(StandardCharsets.UTF_8);

                    System.out.println("===> "+decodedBytes);

                }

        );



    }

    public static SensitechResponse getGetByTSRResponse(String serialNumber, int resetCount) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        ObjectMapper objMapper;
        SensitechResponse resp = null;

        try {

            HttpGet request = new HttpGet("https://api.coldstreamselect.com/APIGateway_v22/api/GetByTSR?" +
                    "TripNumber=0" +
                    "&SerialNumber="+serialNumber +
                    "&ResetCount="+resetCount);

            // add request headers
            request.addHeader("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkY2OUJGMEQyNEM3QUQ4NUI4Q0NCMEE0MEVFQkMzQTA3NTgzMTQ2RDciLCJ0eXAiOiJKV1QiLCJ4NXQiOiI5cHZ3MGt4NjJGdU15d3BBN3J3NkIxZ3hSdGMifQ.eyJuYmYiOjE2NTg0NjQ5MTUsImV4cCI6MTY1ODQ5NDkxNSwiaXNzIjoiaHR0cHM6Ly9zc28uY29sZHN0cmVhbXNlbGVjdC5jb206NDQzIiwiYXVkIjpbImh0dHBzOi8vc3NvLmNvbGRzdHJlYW1zZWxlY3QuY29tOjQ0My9yZXNvdXJjZXMiLCJjc3dlYiIsImNzd2ViLmFwaSJdLCJjbGllbnRfaWQiOiJDb2xkU3RyZWFtIiwic3ViIjoicGFya291cmFwaX5wYXJrb3VyIiwiYXV0aF90aW1lIjoiNjM3OTQwNjE3MTU3Mjg5MzI2IiwiaWRwIjoiaWRwIiwibmFtZSI6InBhcmtvdXJhcGl-cGFya291ciIsIk9yZ2FuaXphdGlvbk5hbWUiOiJwYXJrb3VyIiwiQ29tcGFueSI6InBhcmtvdXIiLCJOYW1lc3BhY2VOYW1lIjoiSFEiLCJOYW1lc3BhY2VJRCI6IjEwMTQ1IiwiT3JnYW5pemF0aW9uSUQiOiIxMDE0NSIsIlBlcm1pc3Npb25Hcm91cE5hbWUiOiJQYXJrb3VyQVBJIiwiVXNlcklEIjoiMyIsIlJvbGVJRCI6IjMiLCJHaXZlbk5hbWUiOiJEaW1pdHJpIiwiRmFtaWx5TmFtZSI6IlBhcGFqYW5pIiwicm9sZSI6WyJBZGQtTW9uaXRvcnMiLCJTZWFyY2gtQmFzaWMiXSwic2NvcGUiOlsib3BlbmlkIiwiY3N3ZWIiLCJjc3dlYi5hcGkiLCJvZmZsaW5lX2FjY2VzcyJdLCJhbXIiOlsicGFzc3dvcmQiXX0.SSZvXjw-ph15zX-IOo8iyIpgkTS8-WS1A7SGusC1cQL8Eewi1O36zQ8EB06FNobeM_Hie1uXJBmeFKKOGkj2pJE3tY2zjHWbDLIT7W6EUZIw-wOj6tRsPX1HoGCQgBJGM1kpLpibcw3I1V0wT2Wuz9aw_wygAuyLvM1g5fNFTZ9x_MYTDgrYSBJbciCyMGLKQ2Np_LeXroZkTMEsbJh-RsUKkXOCyCij-zCKFli5G0Hut0NH8wtBySBb_jjgtoS-VsyPpL_cAGaVlXSBFRuaWC1Te4uOIvcQNnGLpFhntqh8bziDEaTxLU-Lqvx_y6ivUzKozTGV_Gifq2J4abBSpw");

            CloseableHttpResponse response = httpClient.execute(request);

            try {

                // Get HttpResponse Status
                System.out.println(response.getProtocolVersion());              // HTTP/1.1
                System.out.println(response.getStatusLine().getStatusCode());   // 200
                System.out.println(response.getStatusLine().getReasonPhrase()); // OK
                System.out.println(response.getStatusLine().toString());        // HTTP/1.1 200 OK

                HttpEntity entity = response.getEntity();

               // Gson gson = new Gson();

                //get json object from the json string
                //JsonObject coderollsJsonObject = gson.fromJson(EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8), JsonObject.class);


                if (entity != null) {
                    // return it as a String

                    //objMapper = new ObjectMapper ();
                    ObjectMapper mapper = new ObjectMapper();
                    //mapper.setBase
                    //mapper.setBase64Variant(Base64Variants.MODIFIED_FOR_URL);
                    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                    //objMapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, true);
                   // mapper.configure (JsonParser.Feature.IGNORE_UNDEFINED, true);
                    resp =
                            mapper.readValue(
                                    EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8),
                                    SensitechResponse.class);
                    System.out.println (resp);
                }

            } finally {
                response.close();
            }
        } finally {
            httpClient.close();
        }
        return resp;
    }
}
