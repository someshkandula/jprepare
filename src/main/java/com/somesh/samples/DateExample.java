package com.somesh.samples;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.UUID;

public class DateExample {


    public static void main(String args[]) throws ParseException {
        /*String epoch = "1640598889000";

        String requestId = UUID.randomUUID().toString();
        System.out.println("requestId:  "+ requestId);
        Instant i = Instant.ofEpochMilli (Long.valueOf (epoch));

        Instant instant = Instant.now ();

        long l = instant.toEpochMilli ();

        String dateInString = "2021-12-23 10:10:34 909";
        Date date = DateUtils.parseDate(dateInString,
                new String[] { "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss SSS" });
        System.out.println(" =============+> "+date);*/

        //System.out.println (i.toEpochMilli ());
        /*SimpleDateFormat df = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss.SSS zzz");
        Date date = df.parse(date1);
        long epoch = date.getTime();
        */

        //System.out.println ("getNextNotifyTime  "+getNextNotifyTime(10));
        System.out.println ("getShardNotifyTime  =======> "+getShardNotifyTime(20));


    }

    /*
     Instant instant = Instant.now().plusSeconds(reportingInterval * 60);

    int minute = instant.atZone(ZoneOffset.UTC).getMinute();
    minute = 5 * (minute / 5 + 1);
    instant = instant.truncatedTo(ChronoUnit.HOURS);
    instant = instant.plusSeconds(minute * 60L).minusSeconds(1);
    return Date.from(instant);
     */

    private static Instant getNextNotifyTime(int reportingInterval) {
        return Instant.now().plusSeconds(reportingInterval * 60L);
    }

    public static Instant getShardNotifyTime( int reportingInterval) {

        //2022-01-13T02:14:59Z  ---> 1642040099000
        //2022-01-13T02:24:59Z

        //Instant in = Instant.ofEpochMilli (Long.parseLong ("1642040099000"));
        Instant in = Instant.parse("2022-01-13T02:15:02Z");
        System.out.println ("Current Time "+in);
        Instant instant = in.minusSeconds (4);
        System.out.println ("Current Time modified "+instant);

        instant = instant.plusSeconds(reportingInterval * 60);
        System.out.println ("Current Time after adding reporting interval "+instant);
        int minute = instant.atZone(ZoneOffset.UTC).getMinute();
        System.out.println ("Only minutes "+minute);
            minute = 5 * (minute / 5 + 1);
        System.out.println ("after rounded minutes "+minute);
        instant = instant.truncatedTo(ChronoUnit.HOURS);
        System.out.println(" Only hours "+instant);
        instant = instant.plusSeconds(minute * 60L).minusSeconds(1);
        System.out.println (" After rounding "+instant);
        return instant;
    }
}
