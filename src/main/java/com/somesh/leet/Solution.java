package com.leet;

import java.util.Arrays;

class Solution {
    public static void main(String args[]){
        int[] val = new int[]{1,2,1,2,4};
        System.out.println(singleNumber(val));
    }
    public static int singleNumber(int[] nums) {
        int retVal = 1;
        int c = 0;
        int n = 0;
        
        Arrays.sort(nums);
        Arrays.stream (nums).forEach (p -> System.out.println (p));
        for(int i=0;i<nums.length;i++){
            if(i==0){
            c = c+1;
            n = nums[i];
            } else if(nums[i] == n){
                c = c++;
            } else {
                n = nums[i];
                if(c ==0){
                    retVal = nums[i];
                }
                
            }
            
            
        }
        return retVal;
        
    }

}