package com.somesh.samples;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtil {


    public static void main(String args[]) throws IOException, ParseException {

        String d = "{\"startTime\":\"2022-01-19T09:11:46.789Z\"}";

        System.out.println(" d "+d);

        ObjectMapper objectMapper = new ObjectMapper ();
        //objectMapper.disable (DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);
        PullActiveSensorDto dto = objectMapper.readValue (d, PullActiveSensorDto.class);

        System.out.println ("====> "+dto.getStartTime ());

        System.out.println (String.valueOf (dto.getStartTime ().getTime ()));

        Instant instant = Instant.now();
        System.out.println("Instant    : " + instant);

        long epochSecond = instant.getEpochSecond();
        System.out.println("EpochSecond: " + epochSecond);

        long epochMilliSecond = instant.toEpochMilli ();
        System.out.println("EpochMilliSecond: " + epochMilliSecond);



        Instant I1 = Instant.ofEpochMilli(Long.valueOf("1642151564000"));

         System.out.println("000000 "+I1.toEpochMilli());


        /*String DATE_FORMAT_I = "yyyy-MM-dd'T'HH:mm:ss";
        String DATE_FORMAT_O = "yyyy-MM-dd";


        SimpleDateFormat formatInput = new SimpleDateFormat(DATE_FORMAT_I);
        SimpleDateFormat formatOutput = new SimpleDateFormat(DATE_FORMAT_O);

        Date date = formatInput.parse(String.valueOf (dto.getStartTime ()));
        String dateString = formatOutput.format(date);*/

    }
}

class PullActiveSensorDto {

    Date startTime;

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}