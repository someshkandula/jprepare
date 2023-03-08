package com.somesh.streamexamples;

import java.time.LocalDateTime;

public class EnumSample {

    public static void main(String args[]){

        int currentHour = LocalDateTime.now().getHour();
        System.out.println (currentHour);

        System.out.println (checkIfCurrentTimeIsInModeRange());

    }


    private static boolean checkIfCurrentTimeIsInModeRange() {

        int BATTERY_POLL_RATE_IN_HOURS = 4;
        int MINUTES_MOD_MIN = 54;
        int MINUTES_MOD_MAX = 60;

        int currentMinute = LocalDateTime.now().getMinute();
        int currentHour = LocalDateTime.now().getHour();

        return (currentHour % BATTERY_POLL_RATE_IN_HOURS == 0) // every 4 hours
                && (MINUTES_MOD_MIN < currentMinute)
                && (currentMinute < MINUTES_MOD_MAX);
    }

}
