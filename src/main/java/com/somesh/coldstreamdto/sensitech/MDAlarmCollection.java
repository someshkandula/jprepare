package com.coldstream.sensitech;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;

public class MDAlarmCollection{
    @JsonProperty("AlarmRangeCollection") 
    public ArrayList<AlarmRangeCollection> alarmRangeCollection;
    @JsonProperty("AlarmLimit")
    public Object alarmLimit;
    @JsonProperty("AlarmType") 
    public String alarmType;
    @JsonProperty("Threshold") 
    public double threshold;
    @JsonProperty("TimeTriggered") 
    public Date timeTriggered;
    @JsonProperty("IsTriggered") 
    public boolean isTriggered;
    @JsonProperty("AlarmFunction") 
    public int alarmFunction;
    @JsonProperty("AlarmID") 
    public String alarmID;
    @JsonProperty("AlarmNumber") 
    public int alarmNumber;
    @JsonProperty("Enabled") 
    public boolean enabled;
    @JsonProperty("IsHighType") 
    public boolean isHighType;
    @JsonProperty("HighRange") 
    public Object highRange;
    @JsonProperty("LowRange") 
    public Object lowRange;
    @JsonProperty("AlarmDefinitionInfoId") 
    public Object alarmDefinitionInfoId;
    @JsonProperty("Sensor") 
    public Object sensor;
    @JsonProperty("IsSoftwareAlarm") 
    public boolean isSoftwareAlarm;
}
