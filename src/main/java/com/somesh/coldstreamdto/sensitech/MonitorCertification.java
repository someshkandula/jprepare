package com.coldstream.sensitech;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class MonitorCertification{
    @JsonProperty("Sensor1DateValidated")
    public Date sensor1DateValidated;
    @JsonProperty("Sensor1Passed") 
    public boolean sensor1Passed;
    @JsonProperty("Enabled") 
    public boolean enabled;
    @JsonProperty("Sensor1TesterName") 
    public String sensor1TesterName;
    @JsonProperty("Sensor1NistDataName") 
    public String sensor1NistDataName;
    @JsonProperty("Sensor2DateValidated") 
    public Object sensor2DateValidated;
    @JsonProperty("Sensor2Passed") 
    public Object sensor2Passed;
    @JsonProperty("Sensor2TesterName") 
    public Object sensor2TesterName;
    @JsonProperty("Sensor2NistDataName") 
    public Object sensor2NistDataName;
    @JsonProperty("Sensor1Point1StandardReading") 
    public double sensor1Point1StandardReading;
    @JsonProperty("Sensor1Point2StandardReading") 
    public double sensor1Point2StandardReading;
    @JsonProperty("Sensor1Point3StandardReading") 
    public double sensor1Point3StandardReading;
    @JsonProperty("Sensor1Point1Tolerance") 
    public double sensor1Point1Tolerance;
    @JsonProperty("Sensor1Point2Tolerance") 
    public double sensor1Point2Tolerance;
    @JsonProperty("Sensor1Point3Tolerance") 
    public double sensor1Point3Tolerance;
    @JsonProperty("Sensor2Point1StandardReading") 
    public Object sensor2Point1StandardReading;
    @JsonProperty("Sensor2Point2StandardReading") 
    public Object sensor2Point2StandardReading;
    @JsonProperty("Sensor2Point3StandardReading") 
    public Object sensor2Point3StandardReading;
    @JsonProperty("Sensor1Point1Reading") 
    public double sensor1Point1Reading;
    @JsonProperty("Sensor1Point2Reading") 
    public double sensor1Point2Reading;
    @JsonProperty("Sensor1Point3Reading") 
    public double sensor1Point3Reading;
    @JsonProperty("Sensor1Point1Variance") 
    public double sensor1Point1Variance;
    @JsonProperty("Sensor1Point2Variance") 
    public double sensor1Point2Variance;
    @JsonProperty("Sensor1Point3Variance") 
    public double sensor1Point3Variance;
    @JsonProperty("Sensor2Point1Reading") 
    public Object sensor2Point1Reading;
    @JsonProperty("Sensor2Point2Reading") 
    public Object sensor2Point2Reading;
    @JsonProperty("Sensor2Point3Reading") 
    public Object sensor2Point3Reading;
    @JsonProperty("Sensor2Point1Variance") 
    public Object sensor2Point1Variance;
    @JsonProperty("Sensor2Point2Variance") 
    public Object sensor2Point2Variance;
    @JsonProperty("Sensor2Point3Variance") 
    public Object sensor2Point3Variance;
    @JsonProperty("Sensor2Point1Tolerance") 
    public Object sensor2Point1Tolerance;
    @JsonProperty("Sensor2Point2Tolerance") 
    public Object sensor2Point2Tolerance;
    @JsonProperty("Sensor2Point3Tolerance") 
    public Object sensor2Point3Tolerance;
}
