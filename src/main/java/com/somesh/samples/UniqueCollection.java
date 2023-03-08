package com.somesh.samples;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

public class UniqueCollection {

    public static void main(String args[]){

        List<SensorTagEntity> sensorTagsToSave = populateSensorTags();
        List<SensorTagEntity> uniqueSensorTagsToSave =
                sensorTagsToSave.stream ()
                        .collect (
                                collectingAndThen (
                                        toCollection (() -> new TreeSet<> (comparing (SensorTagEntity::getSensor_id))),
                                        ArrayList<SensorTagEntity>::new));

        System.out.println (" uniqueSensorTagsToSave "+uniqueSensorTagsToSave.size ());
        System.out.println ("uniqueSensorTagsToSave "+uniqueSensorTagsToSave);

    }

    private static List<SensorTagEntity> populateSensorTags() {

        List<SensorTagEntity> list = new ArrayList<> ();
        SensorTagEntity se = new SensorTagEntity ();
        se.setSensor_id ("1000");
        se.setSensor_type ("Sendum1");
        list.add (se);

        SensorTagEntity se1 = new SensorTagEntity ();
        se1.setSensor_id ("1000");
        se1.setSensor_type ("Sendum2");
        list.add (se1);

        SensorTagEntity se2 = new SensorTagEntity ();
        se2.setSensor_id ("2000");
        se2.setSensor_type ("Sendum");
        list.add (se2);

        SensorTagEntity se3 = new SensorTagEntity ();
        se3.setSensor_id ("1000");
        se3.setSensor_type ("Sendum3");
        list.add (se3);


        return list;
    }
}

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class SensorTagEntity{
    private String sensor_id;
    private String sensor_type;
}
