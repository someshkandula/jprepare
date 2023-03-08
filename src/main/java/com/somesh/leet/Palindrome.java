package com.somesh.leet;

public class Palindrome {

    public static void main(String args[]){
        int val = 10;
        System.out.println(isPalindrome(val));
    }

    private static boolean isPalindrome(int val) {
        if(val < 0){
            return false;
        }
        boolean flag = false;
        int temp = val;
        int rev=0, rem;
        while(temp != 0){
            rem = temp%10;
            rev = rev*10 + rem;
            temp = temp/10;
        }
        if(val == rev){
            flag = true;
        }
        return flag;
    }
}
