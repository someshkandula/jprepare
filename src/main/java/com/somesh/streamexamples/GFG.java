package com.somesh.streamexamples;

import java.sql.Timestamp;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.Date;

public class GFG {
    public static void main(String[] args)
    {
  
        // create a Instant object
        Instant instant = Instant.now();
  
        // current Instant
        System.out.println("Current instant: "
                          + instant);

        System.out.println ("Shard           :" +Date.from(getShardNotifyTime(instant)));
    }

    public static Instant getShardNotifyTime(Instant instant) {
        int minute = instant.atZone (ZoneOffset.UTC).getMinute ();
        System.out.println (instant.atZone (ZoneOffset.UTC));
        System.out.println (minute);
        minute = 5 * (minute / 5 + 1);
        System.out.println (minute);
        instant = instant.truncatedTo(ChronoUnit.HOURS);
        instant = instant.plusSeconds(minute * 60).minusSeconds(1);
        return instant;
    }

}