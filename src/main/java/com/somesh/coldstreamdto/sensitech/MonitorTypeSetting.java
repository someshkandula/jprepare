package com.coldstream.sensitech;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class MonitorTypeSetting{
    @JsonProperty("MonitorTypeSettingId")
    public String monitorTypeSettingId;
    @JsonProperty("MonitorTypeName") 
    public String monitorTypeName;
    @JsonProperty("MonitorTypeId") 
    public String monitorTypeId;
    @JsonProperty("DownloadedMonitorTypeId") 
    public String downloadedMonitorTypeId;
    @JsonProperty("BaseMonitorTypeSettingId") 
    public Object baseMonitorTypeSettingId;
    @JsonProperty("MaxNumOfPoints") 
    public Object maxNumOfPoints;
    @JsonProperty("SettingValue") 
    public String settingValue;
    @JsonProperty("ParentMonitorTypes") 
    public ArrayList<Object> parentMonitorTypes;
}
