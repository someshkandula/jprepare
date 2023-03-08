package com.somesh.algorithms;


import java.util.Scanner;
public class UserNameValidation {

    public static void main(String[] args){
     //Scanner sc = new Scanner(System.in);
     String userName = "svenkata@parkoursc.com";  //sc.nextLine();
     //String regularExpression = "^[A-Za-z][A-Za-z0-9_]{7,29}$";

     String regularExpression = "^(?:[A-Z\\d][A-Z\\d_-]{5,10}|[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4})$";

     /*

      ^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$

      Username consists of alphanumeric characters (a-zA-Z0-9), lowercase, or uppercase.
      Username allowed of the dot (.), underscore (_), and hyphen (-).
      The dot (.), underscore (_), or hyphen (-) must not be the first or last character.
      The dot (.), underscore (_), or hyphen (-) does not appear consecutively, e.g., java..regex
      The number of characters must be between 5 to 20.

     */

        if (userName.matches(regularExpression)) {
        System.out.println("Valid");
    } else {
        System.out.println("Invalid");
    }         

    }
}