package org.somesh.core;

import org.apache.commons.beanutils.BaseDynaBeanMapDecorator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample1
{
    public static void main(String args[]){
        String additionalAttrFlag = "false";

        Map<String, String> inputPayload1 = getInput1("true");
        Map<String, String> inputPayload2 = getInput2("false");
        Map<String, String> inputPayload3 = getInput3("false");


        Map<String, String> output1 = getOutput1 ();
        Map<String, String> output2 = getOutput2 ();
        Map<String, String> output3 = getOutput3 ();

        Map<String, String> finalMap = getFinalMap (inputPayload1, output1);
        System.out.println ("finalMap"+finalMap);

        Map<String, String> finalMap2 = getFinalMap (inputPayload2, output2);
        System.out.println ("finalMap2"+finalMap2);

        Map<String, String> finalMap3 = getFinalMap (inputPayload3, output3);
        System.out.println ("finalMap3"+finalMap3);
    }

    private static Map<String, String>  getFinalMap(Map<String, String> inputPayload, Map<String, String> output) {
        Map<String, String> finalMap  = new HashMap<> ();
        if(inputPayload.get("additionaAttrFlag").equals ("true")) {
            List<String> filterList = Arrays.asList ("username","apikey","password","encrypted","token","apiKey");

            inputPayload.remove ("additionaAttrFlag");
            finalMap.putAll (output);
            finalMap.putAll (inputPayload);

            for (String data : output.keySet ()) {
                if(!filterList.contains (data)) {
                    if (!inputPayload.containsKey (data)) {
                        finalMap.remove (data);
                    }
                }
            }
        } else {
            finalMap.putAll (output);
        }
        return finalMap;
    }



    private static Map<String, String> getOutput1() {
        Map<String,String> output = new HashMap ();
        output.put ("encrypted","true");
        output.put ("nickname","Uma@OnAsset1");
        output.put ("username","ulankoti@cloudleaf.io");
        output.put ("password","ihf0gU/EVzi1+0iONVWVGg==");
        output.put ("token","");

        output.put ("key1","value1");
        output.put ("routeApiKey","test121");
        return output;
    }

    private static Map<String, String> getInput1(String additionalAttrFlag) {
        Map<String,String> inputPayload = new HashMap ();
        inputPayload.put("nickname","elproNickName1");
        inputPayload.put ("username","somesh@elpro1");
        inputPayload.put ("additionaAttrFlag", additionalAttrFlag);
        inputPayload.put ("routeApiKey","3fder42xw");
        inputPayload.put ("url","tcp//xyz.vendor");
        inputPayload.put ("port","23000");
        inputPayload.put ("qos","1");
        inputPayload.put ("topic","clfdevice1");
        inputPayload.put ("clientId","client1");

        return inputPayload;
    }

    private static Map<String, String> getInput2(String additionalAttrFlag) {
        Map<String,String> inputPayload = new HashMap ();
        inputPayload.put("password","elproupdatedpassword");
        inputPayload.put ("additionaAttrFlag", additionalAttrFlag);
        return inputPayload;
    }

    private static Map<String, String> getOutput2() {
        Map<String,String> output = new HashMap ();
        output.put ("encrypted","true");
        output.put ("nickname","Uma@OnAsset1");
        output.put ("username","ulankoti@cloudleaf.io");
        output.put ("password","ihf0gU/EVzi1+0iONVWVGg==");
        output.put ("token","");

        output.put ("routeApiKey","3fder42xw");
        output.put ("url","tcp//xyz.vendor");
        output.put ("port","23000");
        output.put ("qos","1");
        output.put ("topic","clfdevice1");
        output.put ("clientId","client1");
        return output;
    }


    private static Map<String, String> getInput3(String additionalAttrFlag) {
        Map<String,String> inputPayload = new HashMap ();
        inputPayload.put("apikey","elproNickName1");
        inputPayload.put("tokenCreatedAt","1675967400000");
        inputPayload.put("tokenExpiryTime","1675967400000");
        inputPayload.put ("additionaAttrFlag", additionalAttrFlag);
        return inputPayload;
    }

    private static Map<String, String> getOutput3() {
        Map<String,String> output = new HashMap ();
        output.put ("encrypted","true");
        output.put ("apikey","existingAPI11111");
        output.put ("token","");

        output.put ("routeApiKey","3fder42xw");
        output.put ("url","tcp//xyz.vendor");
        output.put ("port","23000");
        output.put ("qos","1");
        output.put ("topic","clfdevice1");
        output.put ("clientId","client1");
        return output;
    }

}
