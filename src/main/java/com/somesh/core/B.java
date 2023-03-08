package org.somesh.core;

public class B {
    public static void main(String[] args) {
        //Declaring a variable
        String number = "temp";

        //Switch expressionA
        switch (number) {
            //Case statements
            case "temp":
            case "test":
                System.out.println("Value 1");
                System.out.println("Value 2");
                break;
            case "rest":
                System.out.println("Value 3");
                break;
                //Default case statement
            default:
                System.out.println("Not in 1, 2 or 3");
        }
    }
}