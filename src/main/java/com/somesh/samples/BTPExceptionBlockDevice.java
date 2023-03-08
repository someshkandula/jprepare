package com.somesh;

import java.util.UUID;

public class BTPExceptionBlockDevice {

    //HTTP-403 with error msg "Too frequently, temporarily blocked"

    public static void main(String args[] ){

        boolean status = true;
        try {
            String success = getDataFromBTP();
        } catch (Exception e) {
            e.printStackTrace ();
            System.out.println ("error "+e.getMessage ());
            String TEMPORARILY_BLOCK = "temporarily blocked";
            if(e.getMessage ().contains (TEMPORARILY_BLOCK)){
                status = false;
            }


        }

        System.out.println ("Status :: "+status);

        StringBuilder sb = new StringBuilder ();
        sb.append (UUID.randomUUID ().toString ());

        sb.append ("1111");
        String uuid = sb.toString ();


    }

    private static String getDataFromBTP() throws Exception {

        //throw new Exception ("Too frequently, temporarily blocked");
        throw new Exception ("Light API Error:: token is invalid");

    }


}
