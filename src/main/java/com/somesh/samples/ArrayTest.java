package com.somesh.samples;

public class ArrayTest {


    public static int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];

        for(int i =0; i < nums.length; i++) {

            for (int j=i+1; j< nums.length; j++) {

                if( target == (nums[i] + nums[j]) ){
                    arr[0] = i;
                    arr[1] = j;
                }
            }

        }
        return arr;
    }

    public static void main(String args[]){

        int[] test = new int[]{2,4,6,9};


        int[] test1 = twoSum(test, 11);

        for (int t : test1) {
            System.out.print (" "+t+", ");

        }
    }
}
