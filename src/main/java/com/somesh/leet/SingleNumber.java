package com.leet;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};

        System.out.println (" final vaule : "+singleNumber (nums));
    }
    public static int singleNumber(int[] nums) {
        int j = 1;
        int retVal = 0;
        Map<Integer, Integer> map = new HashMap<> ();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey (nums[i])) {
                map.put (nums[i], map.get (nums[i])+1);
            } else {
                map.put (nums[i], j);
            }
        }
        for (Map.Entry<Integer, Integer> a :map.entrySet ()) {
            System.out.println (a.getKey ()+", "+a.getValue ());

            if((Integer) a.getValue () ==  1){
                retVal = a.getKey ();
            }
        }
      return retVal;
    }
}
