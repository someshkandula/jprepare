package com.somesh;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class LambdaLogic1 {

    public static void main(String args[]){

        //String value = "YMin=0, rangedDefault=0, displayType=graph, isConditionDataPlot=true, is3Axes=false, isBinary=true, showIn=asset, groupBy=Environmental Conditions, title=Shock, addSpikes=true, order=9";

        String value = "rangedDefault=0, isBinary=false, showIn=asset, groupBy=Environmental Conditions, title=Shock, unitsfx=g, YMin=0, displayType=graph, isConditionDataPlot=true, is3Axes=false, dependencyMetric=[Shock:rxShockMagnitudeX,Shock:rxShockMagnitudeY,Shock:rxShockMagnitudeZ], addSpikes=true, order=4";


        System.out.println ("Value =====> "+value);
        HashMap<String, String> retMap =
                (HashMap<String, String>)
                        Arrays.asList(value.split(",")).stream()
                                .map(s -> s.split("="))
                                .collect(Collectors.toMap(e -> e[0], e -> e[1]));
        System.out.println ("retMap "+retMap);

    }
}
