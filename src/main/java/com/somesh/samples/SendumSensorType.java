package com.somesh.samples;

import java.util.ArrayList;
import java.util.List;

public class SendumSensorType implements SensorType {

    @Override
    public List<String> getSensorEvents() {
        List<String> list = new ArrayList<> ();
        return list;
    }

    @Override
    public String getSignalType() {
        return "Sendum";
    }
}
