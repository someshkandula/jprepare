package com.somesh.Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {

    public static void main(String args[]){

        System.out.println ("Hello world!");


        List<Integer> numbers = new ArrayList<> (Arrays.asList (8,1,6,2,5,3,7,4));

        Stream<Integer> data = numbers.stream ();

        Stream<Integer> sortedData = data.sorted ();

        Stream<Integer> filterData = sortedData.filter (integer -> integer % 2 == 1);

        Function func = new Function () {
            @Override
            public Integer apply(Object o) {
                return  (Integer)o *2;
            }


        };

        Stream<Integer> mapData = filterData.map (func);

        //Integer reducedData = mapData.reduce(0, ((c, d) -> c+d));

        //mapData.forEach (s -> System.out.println(s));

        Integer reducedData = mapData.reduce (0,Integer::sum);
        System.out.println (reducedData);





        /*int summ = numbers.parallelStream ().reduce (0, Integer::sum);
        System.out.println (" Summ "+summ);*/
    }
}
