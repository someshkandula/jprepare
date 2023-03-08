package com.functionalInt;

public interface RetryOperation {
    <T> T call()  throws Exception;
    default void handleException(Exception e,int retryCount) {
    }
}