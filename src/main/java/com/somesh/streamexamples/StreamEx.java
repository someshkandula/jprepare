package com.somesh.streamexamples;

import java.util.*;
import java.util.stream.Stream;

public class StreamEx {

    public static void main(String args[]){
        System.out.println ("Stream Main method =====>>>>");

        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");
        Iterator<String> itr = myList.iterator();
        while ( itr.hasNext () ){
            String ch = itr.next ();

            if(ch.startsWith ("c")){
                System.out.println (ch.toUpperCase(Locale.ROOT));

            }

        }

        System.out.println ("==========================");

        myList
                .stream ()
                .filter (e -> e.startsWith ("c"))
                .map (String::toUpperCase)
                .sorted ()
                .forEach (System.out::println);

        System.out.println ("==========================");

        Stream.of("a1", "a2", "a3")
                .findFirst ()
                .ifPresent (System.out::println);

        System.out.println ("==========================");

        Stream.of("a1", "a2", "a3")
                .findFirst ()
                .ifPresent (System.out::println);

        System.out.println ("==========================");

        Stream<Integer> randomNumbers = Stream
                .generate(() -> (new Random ()).nextInt(100));

        randomNumbers.limit(4)
                .sorted ()
                .forEach(System.out::println);

        System.out.println ("==========================");


    }
}
