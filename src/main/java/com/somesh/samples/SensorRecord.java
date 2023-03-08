package com.somesh.samples;

import java.util.Map;

public class SensorRecord {
  public String getSensorId() {
    return sensorId;
  }

  public void setSensorId(String sensorId) {
    this.sensorId = sensorId;
  }

  public Map<String, CarrierEvent> getSensorValues() {
    return sensorValues;
  }

  public void setSensorValues(Map<String, CarrierEvent> sensorValues) {
    this.sensorValues = sensorValues;
  }

  private String sensorId;
  private Map<String, CarrierEvent> sensorValues;
}