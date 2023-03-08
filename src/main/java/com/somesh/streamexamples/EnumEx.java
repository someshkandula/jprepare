package com.somesh.streamexamples;

public class EnumEx {

    enum SensorTypes {
        Sendum,
        Mobilogix,
        Biotempak
    }

    public static void main(String args[]){
        //System.out.println (SensorTypes.Sendum);

        for (SensorTypes sensor : SensorTypes.values ()
             ) {
            System.out.println (sensor);

            String query = "select * from event_profile where sensor_type='"+sensor+"'";
            System.out.println (query);
        }
    }
}
