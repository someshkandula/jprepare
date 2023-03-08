package com.coldstream.sensitech;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AlarmRangeCollection{
    @JsonProperty("AlarmRangeID") 
    public String alarmRangeID;
    @JsonProperty("MDAlarmID") 
    public String mDAlarmID;
    @JsonProperty("HighRange") 
    public double highRange;
    @JsonProperty("LowRange") 
    public double lowRange;
    @JsonProperty("OriginalHighRange") 
    public double originalHighRange;
    @JsonProperty("OriginalLowRange") 
    public double originalLowRange;
    @JsonProperty("PreviousHighRange") 
    public double previousHighRange;
    @JsonProperty("PreviousLowRange") 
    public double previousLowRange;
    @JsonProperty("RangeNumber") 
    public int rangeNumber;
}
