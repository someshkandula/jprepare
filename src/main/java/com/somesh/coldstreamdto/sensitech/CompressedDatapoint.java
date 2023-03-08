package com.coldstream.sensitech;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class CompressedDatapoint{
    @JsonProperty("SensorID")
    public String sensorID;
    @JsonProperty("DataPoints") 
    public String dataPoints;
    @JsonProperty("FirstDataPointTime") 
    public Date firstDataPointTime;
    @JsonProperty("MarkedPoints") 
    public String markedPoints;
    @JsonProperty("Interval") 
    public String interval;
    @JsonProperty("NumberOfPoints") 
    public int numberOfPoints;
}
