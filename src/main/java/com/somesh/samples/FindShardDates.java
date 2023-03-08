package com.somesh.samples;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FindShardDates {

    public static void main(String args[]){

        Instant instant = Instant.now ();
        System.out.println ("Current time ===> "+instant);
        System.out.println ("Current time ===> "+Date.from (instant));
        List<PullActiveSensorEntity> list = populateData();
        PullActiveSensorEntity pullActiveSensorEntity = new PullActiveSensorEntity ();
        pullActiveSensorEntity.setRequest_id ("200");
        pullActiveSensorEntity.setShard_notifytime (Date.from (instant.minusSeconds (200)));

        PullActiveSensorEntity pullActiveSensorEntity1 = new PullActiveSensorEntity ();
        pullActiveSensorEntity1.setRequest_id ("201");
        pullActiveSensorEntity1.setShard_notifytime (Date.from (instant.minusSeconds (400)));

        PullActiveSensorEntity pullActiveSensorEntity2 = new PullActiveSensorEntity ();
        pullActiveSensorEntity2.setRequest_id ("202");
        pullActiveSensorEntity2.setShard_notifytime (Date.from (instant.minusSeconds (600)));

        list.add (pullActiveSensorEntity);
        list.add (pullActiveSensorEntity1);
        list.add (pullActiveSensorEntity2);
        System.out.println (list.size ());
        //list.stream().sorted ();
        System.out.println (list);

        List<PullActiveSensorEntity> finalList = list.stream ().filter ( k -> k.getShard_notifytime ().after (Date.from(instant))).collect(Collectors.toList());
        System.out.println (finalList.size ());
        //list.stream().sorted ();
        System.out.println (finalList);
    }

    private static List<PullActiveSensorEntity> populateData(){
        List<PullActiveSensorEntity> list = new ArrayList<> ();

        int sec = 1;
        for (int i = 100; i < 120; i=i+10) {
            sec = sec * i * 2;
            list.add (getPullActiveSensorEntity (String.valueOf (i), sec));
        }
        return list;
    }

    private static PullActiveSensorEntity getPullActiveSensorEntity(String id, int sec) {
        PullActiveSensorEntity pullActiveSensorEntity = new PullActiveSensorEntity () ;
        pullActiveSensorEntity.setRequest_id (id);
        pullActiveSensorEntity.setShard_notifytime (Date.from (Instant.now ().plusSeconds (sec)));
        return pullActiveSensorEntity;
    }
}

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class PullActiveSensorEntity {
    protected Date shard_notifytime;
    protected String request_id;

    @Override
    public String toString() {
        return "PullActiveSensorEntity{" +
                "shard_notifytime=" + shard_notifytime +
                ", request_id='" + request_id + '\'' +
                '}';
    }
}