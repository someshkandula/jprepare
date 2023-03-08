package com.coldstream.sensitech;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;

@ToString
public class SensitechResponse {

    @JsonProperty("SensorCollection")
    public ArrayList<SensorCollection> sensorCollection;

    @JsonProperty("TripNumber") 
    public String tripNumber;
    @JsonProperty("SerialNumber") 
    public String serialNumber;
    @JsonProperty("ResetCount")
    public int resetCount;
    @JsonProperty("Interval")
    public int interval;

    @JsonProperty("NumberOfDataPoints")
    public int numberOfDataPoints;

    @JsonProperty("StartTime")
    public Date startTime;
    @JsonProperty("StopTime")
    public Date stopTime;
    @JsonProperty("DownloadDateTime") 
    public Date downloadDateTime;
    @JsonProperty("DownloadUser")
    public String downloadUser;

    @JsonProperty("RowLastModifiedOn")
    public Date rowLastModifiedOn;

    @JsonProperty("MonitorDataID") 
    public String monitorDataID;
    @JsonProperty("DownloadSource") 
    public String downloadSource;
}
