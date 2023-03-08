package com.functionalInt;

import java.util.Date;

public class DataExample {

    public static void main(String[] args) {

        String date = "2022-09-21T12:15:03.000Z";

        Date d = new Date ("2022-09-21T12:15:03.000Z");

        System.out.println (d.getTime ());
    }
}
