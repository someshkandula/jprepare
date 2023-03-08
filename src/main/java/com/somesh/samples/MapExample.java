package com.somesh.samples;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.*;

public class MapExample {

    public static void main(String[] args){

        Map<String, String> waterMark = populateWaterMark();


        waterMark
                .entrySet()
                .forEach(
                        k -> {
                           System.out.println (k.getKey () +" --- "+ k.getValue ());
                        });


        Map.Entry<String, String> lastSnapShotTime = waterMark
                .entrySet().stream ().findFirst ().get ();

        System.out.println (lastSnapShotTime.getKey () +" ====  "+ lastSnapShotTime.getValue ());

        List<PullActiveSensor> pullActiveSensorList = getPullActiveSensor();

        pullActiveSensorList.sort ((PullActiveSensor p1, PullActiveSensor p2) -> (int) (p2.getShard_notifytime ().getTime () - p1.getShard_notifytime ().getTime ()));

        System.out.println("test"+pullActiveSensorList);

        Optional<PullActiveSensor> firstElement = pullActiveSensorList.stream ().findFirst ();

        System.out.println("firstElement   "+firstElement);
    }



    private static Map<String, String> populateWaterMark() {

        Map<String, String> waterMark = new HashMap<> ();
        waterMark.put ("A","2021-21-01 11:20:01");
        waterMark.put ("B","2021-21-01 12:20:01");
        waterMark.put ("C","2021-21-01 03:20:01");
        waterMark.put ("D","2021-21-01 16:20:01");

        return  waterMark;
    }

    private static List<PullActiveSensor> getPullActiveSensor(){

        List<PullActiveSensor> list =new ArrayList<> ();
        PullActiveSensor pullActiveSensor;
        int j ;
        for(int i=0;i<3;i++) {
            pullActiveSensor = new PullActiveSensor ();
            pullActiveSensor.setId ("100"+i);
            j = i*i+1;
            System.out.println (j);
            pullActiveSensor.setShard_notifytime (Date.from (Instant.now ().minus (j, ChronoUnit.DAYS)));
            list.add (pullActiveSensor);
        }

        return list;
    }


}


class PullActiveSensor {
    String id;
    Date shard_notifytime;

    @Override
    public String toString() {
        return "PullActiveSensor{" +
                "id='" + id + '\'' +
                ", shard_notifytime=" + shard_notifytime +
                '}';
    }

    public Date getShard_notifytime() {
        return shard_notifytime;
    }

    public void setShard_notifytime(Date shard_notifytime) {
        this.shard_notifytime = shard_notifytime;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}