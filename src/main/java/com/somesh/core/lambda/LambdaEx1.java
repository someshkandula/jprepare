package org.somesh.core.lambda;

import java.util.stream.IntStream;

public class LambdaEx1 {

    public static void main(String args[]){
        // for integers IntStream
        //IntStream.of(10,2,8,40,32,66).min().ifPresent(System.out::println);

        int[] number = {10,3,5,7,81,23,76,32,4,78,13,45};

        IntStream.of(number).distinct().sorted().limit(3).forEach(System.out::println);

    }
}
