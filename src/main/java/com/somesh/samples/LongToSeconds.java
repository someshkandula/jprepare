package com.somesh.samples;

import java.time.Instant;
import java.util.Calendar;

public class LongToSeconds {

    public static void main(String args[]){

        Instant vendorStartTime =
                Instant.ofEpochMilli(
                        Long.parseLong("1642677901000"));
        System.out.println (vendorStartTime.toEpochMilli());

        System.out.println(Calendar.getInstance().getTimeInMillis());
        System.out.println(Instant.now ().toEpochMilli ());
        long startDate = 1642677901000L;

        long startDateSec = startDate/1000;

        System.out.println (startDateSec);

    }
}
