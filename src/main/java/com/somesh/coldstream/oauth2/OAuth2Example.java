package com.somesh.coldstream.oauth2;

import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class OAuth2Example {
    public static void main(String[] args) {
        OAuth2Config config = new OAuth2Config ();
        config.setGrantType ("password");
        config.setAccessTokenUri ("https://sso.coldstreamselect.com/connect/token");
        config.setClientId ("ColdStream");
        config.setClientSecret ("CS.Web+Secret");
        config.setUsername ("parkourapi~parkour");
        config.setPassword ("9!g&lt^9mkRL");
        config.setScope ("csweb.api");


        HttpUriRequest req = buildRequest (config);
        try {
            CloseableHttpResponse response = doRequest (req);
            System.out.println (response);
            OAuth2Response  resp = execute (req);
            System.out.println (resp);
        } catch (Exception e) {
            System.out.println ("Exception eee"+e);
            e.printStackTrace ();
        }


    }

    private static HttpUriRequest buildRequest(OAuth2Config config) {
        List formData = new ArrayList<> ();
        formData.add(new BasicNameValuePair (Contants.grantType, config.getGrantType()));

        if (config.getScope() != null ) {
            formData.add(new BasicNameValuePair(Contants.scope, config.getScope()));
        }

        if (Contants.CLIENT_CREDENTIALS_GRANT.equals(config.getGrantType())) {
            formData.add(new BasicNameValuePair(Contants.clientId, config.getClientId()));
            formData.add(new BasicNameValuePair(Contants.clientSecret, config.getClientSecret()));
        }

        if (Contants.RESOURCE_OWNER_GRANT.equals(config.getGrantType())) {
            formData.add(new BasicNameValuePair(Contants.username, config.getUsername()));
            formData.add(new BasicNameValuePair(Contants.password, config.getPassword()));
        }

        return RequestBuilder.create(HttpPost.METHOD_NAME)
                .setUri(config.getAccessTokenUri())
                .setEntity(new UrlEncodedFormEntity (formData, StandardCharsets.UTF_8))
                .build();
    }

    static CloseableHttpResponse doRequest(HttpUriRequest request) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            return httpClient.execute(request);
        } catch (IOException e) {
            throw new Exception("An error occurred executing the request.", e);
        }
    }
    static OAuth2Response execute(HttpUriRequest request) throws Exception {
        CloseableHttpResponse httpResponse = doRequest(request);
        HttpEntity httpEntity              = httpResponse.getEntity();
        int statusCode                     = httpResponse.getStatusLine()
                .getStatusCode();
        if (statusCode >= 400) {
            throw new Exception("Failed "+statusCode);
        }
        return new OAuth2Response(httpEntity);
    }

}
class OAuth2Response {
    HttpEntity httpEntity;

    public OAuth2Response(HttpEntity httpEntity) {
        this.httpEntity = httpEntity;
    }
}