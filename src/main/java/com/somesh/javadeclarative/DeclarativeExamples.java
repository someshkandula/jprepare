package javadeclarative;

import java.util.stream.IntStream;

public class DeclarativeExamples {

    public static void main(String[] args) {
        System.out.println (" Hello world !, Welcome to Declarative programing - java 8,9,10,11,12 & 13");

        IntStream sum = IntStream.of(1,2,3,4,5);
        sum.forEach (System.out::println);
    }
}
