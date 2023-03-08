package com.functionalInt;

public class RetryOperationUtil {
    public static <T> T retry(int maxAttempts, int delaySeconds, RetryOperation operation) throws Exception {
        for (int count = 0; count <= maxAttempts; count++) {
            try {
                return operation.call();
            } catch (Exception e) {
                if (count == maxAttempts) {
                    throw new Exception(e);
                } else {
                    operation.handleException(e,count);
                }
            }
            Thread.sleep(delaySeconds*(count+1)*1000);
        }
        return null;
    }
}