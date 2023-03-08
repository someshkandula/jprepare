package com.somesh.samples;

import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class SensorRecordData {

    public static void main(String args[]){
        SensorRecord sensorRecord = new SensorRecord ();
        CarrierEvent carrierEvent = new CarrierEvent ();
        carrierEvent.setValue ("100-001");
        carrierEvent.setEventTime (1641644410000L);

        CarrierEvent carrierEvent2 = new CarrierEvent ();
        carrierEvent2.setValue ("100-002");
        carrierEvent2.setEventTime (1641645010000L);

        CarrierEvent carrierEvent3 = new CarrierEvent ();
        carrierEvent3.setValue ("100-003");
        carrierEvent3.setEventTime (1741645561000L);

        CarrierEvent carrierEvent4 = new CarrierEvent ();
        carrierEvent4.setValue ("100-004");
        carrierEvent4.setEventTime (1841645608000L);

        CarrierEvent carrierEvent5 = new CarrierEvent ();
        carrierEvent5.setValue ("100-004");
        carrierEvent5.setEventTime (1641647962000L);



        Map<String, CarrierEvent> carrierEventMap = new HashMap<> ();
        carrierEventMap.put ("0", carrierEvent);
        Map<String, CarrierEvent> carrierEventMap2= new HashMap<> ();
        carrierEventMap2.put ("2", carrierEvent2);
        Map<String, CarrierEvent> carrierEventMap3 = new HashMap<> ();
        carrierEventMap3.put ("3", carrierEvent3);
        Map<String, CarrierEvent> carrierEventMap4 = new HashMap<> ();
        carrierEventMap4.put ("4", carrierEvent4);
        Map<String, CarrierEvent> carrierEventMap5 = new HashMap<> ();
        carrierEventMap5.put ("5", carrierEvent5);


        sensorRecord.setSensorId ("100");
        sensorRecord.setSensorValues (carrierEventMap);

        SensorRecord sensorRecord2 = new SensorRecord ();
        sensorRecord2.setSensorId ("200");
        sensorRecord2.setSensorValues (carrierEventMap2);

        SensorRecord sensorRecord3 = new SensorRecord ();
        sensorRecord3.setSensorId ("300");
        sensorRecord3.setSensorValues (carrierEventMap3);

        SensorRecord sensorRecord4 = new SensorRecord ();
        sensorRecord4.setSensorId ("400");
        sensorRecord4.setSensorValues (carrierEventMap4);

        SensorRecord sensorRecord5 = new SensorRecord ();
        sensorRecord5.setSensorId ("500");
        sensorRecord5.setSensorValues (carrierEventMap5);


        List<SensorRecord> list = new ArrayList<> ();

        list.add (sensorRecord);
        list.add (sensorRecord2);
        list.add (sensorRecord3);
        list.add (sensorRecord4);
        list.add (sensorRecord5);


        long maxEventTime = getEventTimeFromVendorData (list);
        System.out.println (maxEventTime);



    }

    private static long getEventTimeFromVendorData(List<SensorRecord> sensoryRecords) {
        List<Long> carrierEventTime = new ArrayList<> ();
        for (SensorRecord sensorRecord : sensoryRecords) {
            Map<String, CarrierEvent> c = sensorRecord.getSensorValues ();
            for (Map.Entry<String, CarrierEvent> carrierEntity: c.entrySet ()) {
                carrierEventTime.add(Instant.ofEpochMilli(carrierEntity.getValue().getEventTime()).plusSeconds (1)
                        .toEpochMilli());
                //carrierEventTime.add(carrierEntity.getValue ().getEventTime ());
            }
        }
        return Collections.max(carrierEventTime);
    }
}
