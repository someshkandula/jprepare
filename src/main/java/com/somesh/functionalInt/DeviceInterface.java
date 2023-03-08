package com.functionalInt;

@FunctionalInterface
public interface DeviceInterface {

    void process();

    default void defMethod1(){
        System.out.println ("Default method 1 ");
    }

    default void defMethod2(){
        System.out.println ("Default method 2 ");
    }

    default void defMethod3(){
        System.out.println ("Default method 3 ");
    }
}
