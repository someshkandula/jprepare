package com.functionalInt;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        //DeviceInterface di = () -> System.out.println ("Inside process method ");

        DeviceInterface di = Test :: testSample;

        di.process ();
        di.defMethod1 ();
        di.defMethod2 ();
        di.defMethod3 ();


    }
}
