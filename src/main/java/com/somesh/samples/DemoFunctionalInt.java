package com;


interface one {
        <T> T call() throws Exception;

        default void handleException(Exception e, int retryCount){
        }
}
public class DemoFunctionalInt {



}
