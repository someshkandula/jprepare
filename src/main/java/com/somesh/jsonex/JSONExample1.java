package com.somesh.jsonex;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONExample1 {

    public static void main(String args[]) throws ParseException {
        System.out.println ("Inside main method JSON Example");

        String json = "[{\"id\":\"79900\",\"title\":\"temperature\",\"priority\":\"0\",\"color\":\"ae1b21\",\"measure_unit\":\"C\",\"probe\":{\"title\":\"C317\",\"imei\":\"C317\"},\"gps_unit_id\":155249954,\"data_list\":[{\"time\":1648557660,\"value\":10},{\"time\":1648557661,\"value\":20}]},{\"id\":\"79902\",\"title\":\"pressure\",\"priority\":\"0\",\"color\":\"4ca702\",\"measure_unit\":\"kPa\",\"probe\":{\"title\":\"C317\",\"imei\":\"C317\"},\"gps_unit_id\":155249954,\"data_list\":[{\"time\":1648557660,\"value\":70},{\"time\":1648557661,\"value\":80}]},{\"id\":\"79903\",\"title\":\"light\",\"priority\":\"0\",\"color\":\"e0ad11\",\"measure_unit\":\"%\",\"probe\":{\"title\":\"C317\",\"imei\":\"C317\"},\"gps_unit_id\":155249954,\"data_list\":[{\"time\":1648557660,\"value\":30},{\"time\":1648557661,\"value\":40}]},{\"id\":\"79905\",\"title\":\"humidity\",\"priority\":\"0\",\"color\":\"008dd2\",\"measure_unit\":\"%\",\"probe\":{\"title\":\"C317\",\"imei\":\"C317\"},\"gps_unit_id\":155249954,\"data_list\":[{\"time\":1648557660,\"value\":50},{\"time\":1648557661,\"value\":60}]}]";
        JSONParser parser = new JSONParser ();

        Object resultObject = parser.parse(json);
        JSONArray resultJsonObject = (JSONArray) resultObject;
        for (Object o : resultJsonObject) {
            JSONObject sevenpSolutionsObj = (JSONObject) o;
            System.out.println (" sevenpSolutionsObj  ID " + sevenpSolutionsObj.get ("id"));
            System.out.println (" sevenpSolutionsObj title "+sevenpSolutionsObj.get ("title"));
            System.out.println (" sevenpSolutionsObj priority "+sevenpSolutionsObj.get ("priority"));
            System.out.println (" sevenpSolutionsObj color "+sevenpSolutionsObj.get ("color"));
            System.out.println (" sevenpSolutionsObj measure_unit "+sevenpSolutionsObj.get ("measure_unit"));
            System.out.println (" sevenpSolutionsObj probe "+sevenpSolutionsObj.get ("probe"));
            System.out.println (" sevenpSolutionsObj data_list "+sevenpSolutionsObj.get ("data_list"));
            System.out.println (" sevenpSolutionsObj gps_unit_id "+sevenpSolutionsObj.get ("gps_unit_id"));

            JSONArray result = (JSONArray)sevenpSolutionsObj.get ("data_list");
            for (Object o1 : result) {
                JSONObject sevenpSolutionsObj1 = (JSONObject) o1;
                long timeInMillis= (long)sevenpSolutionsObj1.get ("time");
                String val = "" + sevenpSolutionsObj1.get ("value");
                System.out.println (timeInMillis*1000+" ---  "+val);
                System.out.println (sevenpSolutionsObj1.get ("time"));
                System.out.println (sevenpSolutionsObj1.get ("value"));
            }

            /*for(int i = 0;i< result.size ();i++){
                System.out.println (result.get (i));
                Object resultObject1 = parser.parse(result.get (i).toString ());
                JSONArray resultJsonObject1 = (JSONArray) resultObject1;
                for (Object o1 : resultJsonObject1) {
                    JSONObject sevenpSolutionsObj1 = (JSONObject) o1;
                    System.out.println (sevenpSolutionsObj1.get ("time"));
                    System.out.println (sevenpSolutionsObj1.get ("value"));

                }

            }*/
        }
    }
}
