package org.somesh.core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

    public static void main(String args[]){
        long t = 0;
        try{
         t = getDateFromString("2021-07-05T10:11:18Z", "shipToDate");
        } catch (Exception ex) {
            System.out.println(""+ex.getMessage());
        }
        System.out.println("Time "+t);
        //getDateFromString("2021-07-05T10:11:18");
        //getDateFromString("2021-07-05T10:11:18Z");

    }

    public static Long getDateFromString(String sDate, String dataField) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        Date date = null;
        try {
            date = formatter.parse(sDate);
        } catch (ParseException e) {
           // log.info(">> getDateFromString , ParseException exception={}, sDate={} ", e.getMessage(), sDate);
            throw new Exception("Invalid Date Format "+dataField);
        }
        return date.getTime();
    }
}
