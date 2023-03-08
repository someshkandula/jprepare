package org.somesh.core;

public class A {
    public static void main(String[] args) {
        //Declaring a variable
        int number = 2;
        //Switch expressionA
        switch (number) {
            //Case statements
            case 1: case 2:
                System.out.println("Value 1");
                System.out.println("Value 2");
                break;
            case 3:
                System.out.println("Value 3");
                break;
                //Default case statement
            default:
                System.out.println("Not in 1, 2 or 3");
        }
    }
}