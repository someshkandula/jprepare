package com.somesh.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListEx {

    public static void main(String[] args) {
        List<String> list = new ArrayList<> ();
        for(int i=0;i<3;i++) {
            list.addAll (getList (i));
        }
        System.out.println (list.size ());
        Chunk c = new Chunk (list, 1000);
        System.out.println (c.size ());
        for(int z=0;z<c.size ();z++){
            System.out.println (c.get (z).size ());
        }
    }

    private static List<String> getList(int i) {
        List<String> returnList = new ArrayList<> ();
        if(i==0) {
            for(int z=0;z<16000;z++) {
                returnList.add ("Test"+z);
            }
        } else if(i==1){
            returnList.add ("Best");
            returnList.add ("Best1");
        } else if(i==2){
            returnList.add ("");
        }
        return returnList;
    }
}
