package com.somesh.samples;

import java.util.HashSet;
import java.util.Set;

public class MainProgram {


    public static void main(String args[]){

        System.out.println(" Hello world!!!!");

        Set<SensorType> set = new HashSet<> ();
        set.add (new OnAssetSensorType());
        set.add (new SendumSensorType ());
        set.add (new BiotempakSensorType ());

        SignalFactory signalFactory = new SignalFactory (set);

        SensorType s1 = signalFactory.findSignal ("Sendum");

        System.out.println (s1);

    }


}
