package com.somesh.streamexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectEx {

    public static void main(String args[]){

        List<Integer> list = new ArrayList<> ();

        for (int i=0;i<10;i++){
            list.add (i);
        }

        List<Integer> tempList = list.stream ()
                .filter (i -> i%2 == 0)
                .collect (Collectors.toList ());

        tempList.forEach (System.out::println);

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Shahrukh");
        memberNames.add(null);
        memberNames.add("Rahul");

        memberNames.add("Yana");
        memberNames.add("Salman");
        memberNames.add("Lokesh");

        System.out.println ("======================");
        list
                .stream ()
                //.sorted ((f1,f2) -> Integer.compare (f2,f1))
                .sorted (Comparator.reverseOrder ())
                .forEach (System.out::println);

        System.out.println ("======================");

        List<String>  sortedList = memberNames.stream()
                .filter (s1 -> s1!= null)
                .sorted ((r1,r2) -> String.CASE_INSENSITIVE_ORDER.compare (r2,r1))
                .collect (Collectors.toList ());

        sortedList.forEach (System.out::println);

        System.out.println ("======================");

        memberNames.stream ()
                .filter (s1 -> s1 != null)
                .sorted (Comparator.reverseOrder())
                .forEach (System.out::println);

        Long timestamp_Of_Sentry_Location = null;

        System.out.println (timestamp_Of_Sentry_Location);


        String tags = "a1;b2;c3;d4;c3;d4;e5;f6;t5;p8;y6;u8;i9";

        Arrays.stream (tags.split (";")).limit (10).forEach ( i ->
                {
                        System.out.println ("Limited to 10 numbers"+i);

                }

        );




    }
}
