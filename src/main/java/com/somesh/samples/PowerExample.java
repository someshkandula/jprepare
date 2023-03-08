package com.somesh;

public class PowerExample {

    public static void main(String args[]) {
        System.out.println(power (2, 3));
    }


    public static int power(int a, double b) {
        if (b < 2) {
            return a;
        }
        double mid = Math.ceil(b / 2)-1;
        int result = power (a, mid);

        System.out.println ("result" + result);
        return result * result;
    }
}