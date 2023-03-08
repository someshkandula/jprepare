package com.somesh.algorithms;

public class PrimeNumbers {

    public static void main(String args[]){

        System.out.println("Prime Numbers ");


        boolean isPrime = false;
        for(int i=2;i<15;i++){
            isPrime = false;
            System.out.println ("i ===> "+i+"isPrime "+isPrime);
            for(int j=1;j<i;j=j++){
                System.out.println("i "+i+" J===> "+j+" i%j "+i%j);
                if(i%j == 0){

                    isPrime = true;
                    System.out.println("isPrime"+isPrime);
                    break;
                }
            }
            if(isPrime) System.out.println ("Prime number "+i+", ");
        }
    }


}
