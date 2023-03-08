package com.somesh.coldstreamselect;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ColdStreamSelectGetByTSR {

    public static void main(String[] args) throws IOException {

        ColdStreamResponse csr = getGetByTSRResponse ("KAC2F00WA1", 3198);
        if(csr != null){
            System.out.println (csr);
        }

    }

    public static ColdStreamResponse getGetByTSRResponse(String serialNumber, int resetCount) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        ObjectMapper objMapper;
        ColdStreamResponse resp = null;

        try {

            HttpGet request = new HttpGet("https://api.coldstreamselect.com/APIGateway_v22/api/GetByTSR?" +
                    "TripNumber=0" +
                    "&SerialNumber="+serialNumber +
                    "&ResetCount="+resetCount);

            // add request headers
            request.addHeader("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkY2OUJGMEQyNEM3QUQ4NUI4Q0NCMEE0MEVFQkMzQTA3NTgzMTQ2RDciLCJ0eXAiOiJKV1QiLCJ4NXQiOiI5cHZ3MGt4NjJGdU15d3BBN3J3NkIxZ3hSdGMifQ.eyJuYmYiOjE2NjI0NTgzOTIsImV4cCI6MTY2MjQ4ODM5MiwiaXNzIjoiaHR0cHM6Ly9zc28uY29sZHN0cmVhbXNlbGVjdC5jb206NDQzIiwiYXVkIjpbImh0dHBzOi8vc3NvLmNvbGRzdHJlYW1zZWxlY3QuY29tOjQ0My9yZXNvdXJjZXMiLCJjc3dlYiIsImNzd2ViLmFwaSJdLCJjbGllbnRfaWQiOiJDb2xkU3RyZWFtIiwic3ViIjoicGFya291cmFwaX5wYXJrb3VyIiwiYXV0aF90aW1lIjoiNjM3OTgwNTUxOTIyMjM1MjkyIiwiaWRwIjoiaWRwIiwibmFtZSI6InBhcmtvdXJhcGl-cGFya291ciIsIk9yZ2FuaXphdGlvbk5hbWUiOiJwYXJrb3VyIiwiQ29tcGFueSI6InBhcmtvdXIiLCJOYW1lc3BhY2VOYW1lIjoiSFEiLCJOYW1lc3BhY2VJRCI6IjEwMTQ1IiwiT3JnYW5pemF0aW9uSUQiOiIxMDE0NSIsIlBlcm1pc3Npb25Hcm91cE5hbWUiOiJQYXJrb3VyQVBJIiwiVXNlcklEIjoiMyIsIlJvbGVJRCI6IjMiLCJHaXZlbk5hbWUiOiJEaW1pdHJpIiwiRmFtaWx5TmFtZSI6IlBhcGFqYW5pIiwicm9sZSI6WyJBZGQtTW9uaXRvcnMiLCJTZWFyY2gtQmFzaWMiXSwic2NvcGUiOlsib3BlbmlkIiwiY3N3ZWIiLCJjc3dlYi5hcGkiLCJvZmZsaW5lX2FjY2VzcyJdLCJhbXIiOlsicGFzc3dvcmQiXX0.KbbIX4w-feC3yV3f4OFqMh0wC88GG2M2CMdBdjBaeq1QC0mu6toqcqBRHFPcE75DeChWx0gPHaG1fJp-WZgbW-Hhv_i2dtBgGrJUwiJ4KCEEBIHizdY2_YQB4p3krklP6F5KrqomuppB8HQ7WfT0PgvO0c4aucvbAc591692hZmTtKlw-fmWuWvDvymI1EUYEk97zG9sld-0g9f0eHQsiYAGkKj2GEzBYFOmzRpLGI23tqXq_dQ_Oa0Zbh0F0u8N6sS6XuKd2IWZ40TygwphC7FO8i4BySHvUX6oRK0Zs_hNNnB0wCDmkLIwpTUbYNeUtZXTauAHno8x35FSHoHT8Q");

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


                if (response.getStatusLine().getStatusCode() == 200 && entity != null) {
                    // return it as a String

                    //objMapper = new ObjectMapper ();
                    ObjectMapper mapper = new ObjectMapper();
                    //mapper.setBase
                    //mapper.setBase64Variant(Base64Variants.MODIFIED_FOR_URL);
                    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                    //objMapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, true);
                    //objMapper.configure (JsonParser.Feature.IGNORE_UNDEFINED, true);
                    resp =
                            mapper.readValue(
                                    EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8),
                                    ColdStreamResponse.class);
                } else {

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
