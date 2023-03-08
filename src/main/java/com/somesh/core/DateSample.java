package org.somesh.core;

import java.time.Instant;

public class DateSample {

    public static void main(String args[]){

        Instant pastDate = Instant.parse ("2022-01-26T11:13:56.388Z");
        System.out.println(pastDate);
        System.out.println (pastDate.toEpochMilli ());
    }
}
