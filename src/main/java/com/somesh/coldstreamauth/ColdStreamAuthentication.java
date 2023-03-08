package com.somesh.coldstreamauth;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class ColdStreamAuthentication {

    /*

        curl --location --request POST 'https://sso.coldstreamselect.com/connect/token' \
        --header 'Authorization: Basic Q29sZFN0cmVhbTpDUy5XZWIrU2VjcmV0' \
        --form 'grant_type="password"' \
        --form 'username="parkourapi~parkour"' \
        --form 'password="Uvq4B6aD#Q%"'

     */

    public static void main(String[] args) {

        ObjectMapper objMapper;
        SensitechAuthResponse resp = null;
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost request = new HttpPost("https://sso.coldstreamselect.com/connect/token");
        List<NameValuePair> nameValueParams = new ArrayList<> ();

        //client_credentials - Didn't work
        /*nameValueParams.add(new BasicNameValuePair("grant_type", "client_credentials"));
        nameValueParams.add(new BasicNameValuePair("client_id", "ColdStream"));
        nameValueParams.add(new BasicNameValuePair("client_secret", "CS.Web+Secret"));*/

        //password
        nameValueParams.add(new BasicNameValuePair ("grant_type", "password"));
        //svenkata
        //nameValueParams.add(new BasicNameValuePair("username", "svenkata~parkour"));
        //nameValueParams.add(new BasicNameValuePair("password", "9!g&lt^9mkRL"));

        //parkour
        nameValueParams.add(new BasicNameValuePair("username", "parkourapi~parkour"));
        nameValueParams.add(new BasicNameValuePair("password", "Uvq4B6aD#Q%"));

        // Header
        //request.setHeader(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
        //request.setHeader(HttpHeaders.ACCEPT, "application/json");
        request.setHeader (HttpHeaders.AUTHORIZATION, getBasicAuthenticationHeader ("ColdStream","CS.Web+Secret"));
        // Body
        request.setEntity(new UrlEncodedFormEntity (nameValueParams, StandardCharsets.UTF_8));

        CloseableHttpResponse response = null;
        try {
            response = client.execute(request);

            if(response != null){
                System.out.println (response);
            }
            objMapper = new ObjectMapper ();
            objMapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, true);
            objMapper.configure (JsonParser.Feature.IGNORE_UNDEFINED, true);
            resp =
                    objMapper.readValue(
                            EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8),
                            SensitechAuthResponse.class);
            client.close();
        } catch (Exception e) {
            e.printStackTrace ();
        }
        if(resp != null ){
            System.out.println ("Sensitech token from API Call");
            System.out.println ("Access Token "+ resp.getAccess_token());
            System.out.println ("Token_type"+ resp.getToken_type ());
            System.out.println ("Refresh_token"+ resp.getRefresh_token ());
            System.out.println ("Expires_in"+ resp.getExpires_in ());
            System.out.println ("Error"+ resp.getError ());
            System.out.println (resp);
        }
    }

    private static final String getBasicAuthenticationHeader(String username, String password) {
        String valueToEncode = username + ":" + password;
        return "Basic " + Base64.getEncoder().encodeToString(valueToEncode.getBytes());
    }

}
