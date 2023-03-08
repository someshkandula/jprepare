
package com.somesh.coldstreamselect;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AlarmRangeCollection",
    "AlarmLimit",
    "AlarmType",
    "Threshold",
    "TimeTriggered",
    "IsTriggered",
    "AlarmFunction",
    "AlarmID",
    "AlarmNumber",
    "Enabled",
    "IsHighType",
    "HighRange",
    "LowRange",
    "AlarmDefinitionInfoId",
    "Sensor",
    "IsSoftwareAlarm"
})
@Generated("jsonschema2pojo")
public class MDAlarmCollection {

    @JsonProperty("AlarmRangeCollection")
    private List<AlarmRangeCollection> alarmRangeCollection = null;
    @JsonProperty("AlarmLimit")
    private Object alarmLimit;
    @JsonProperty("AlarmType")
    private String alarmType;
    @JsonProperty("Threshold")
    private Double threshold;
    @JsonProperty("TimeTriggered")
    private Object timeTriggered;
    @JsonProperty("IsTriggered")
    private Boolean isTriggered;
    @JsonProperty("AlarmFunction")
    private Integer alarmFunction;
    @JsonProperty("AlarmID")
    private String alarmID;
    @JsonProperty("AlarmNumber")
    private Integer alarmNumber;
    @JsonProperty("Enabled")
    private Boolean enabled;
    @JsonProperty("IsHighType")
    private Boolean isHighType;
    @JsonProperty("HighRange")
    private Object highRange;
    @JsonProperty("LowRange")
    private Object lowRange;
    @JsonProperty("AlarmDefinitionInfoId")
    private Object alarmDefinitionInfoId;
    @JsonProperty("Sensor")
    private Object sensor;
    @JsonProperty("IsSoftwareAlarm")
    private Boolean isSoftwareAlarm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AlarmRangeCollection")
    public List<AlarmRangeCollection> getAlarmRangeCollection() {
        return alarmRangeCollection;
    }

    @JsonProperty("AlarmRangeCollection")
    public void setAlarmRangeCollection(List<AlarmRangeCollection> alarmRangeCollection) {
        this.alarmRangeCollection = alarmRangeCollection;
    }

    @JsonProperty("AlarmLimit")
    public Object getAlarmLimit() {
        return alarmLimit;
    }

    @JsonProperty("AlarmLimit")
    public void setAlarmLimit(Object alarmLimit) {
        this.alarmLimit = alarmLimit;
    }

    @JsonProperty("AlarmType")
    public String getAlarmType() {
        return alarmType;
    }

    @JsonProperty("AlarmType")
    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    @JsonProperty("Threshold")
    public Double getThreshold() {
        return threshold;
    }

    @JsonProperty("Threshold")
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    @JsonProperty("TimeTriggered")
    public Object getTimeTriggered() {
        return timeTriggered;
    }

    @JsonProperty("TimeTriggered")
    public void setTimeTriggered(Object timeTriggered) {
        this.timeTriggered = timeTriggered;
    }

    @JsonProperty("IsTriggered")
    public Boolean getIsTriggered() {
        return isTriggered;
    }

    @JsonProperty("IsTriggered")
    public void setIsTriggered(Boolean isTriggered) {
        this.isTriggered = isTriggered;
    }

    @JsonProperty("AlarmFunction")
    public Integer getAlarmFunction() {
        return alarmFunction;
    }

    @JsonProperty("AlarmFunction")
    public void setAlarmFunction(Integer alarmFunction) {
        this.alarmFunction = alarmFunction;
    }

    @JsonProperty("AlarmID")
    public String getAlarmID() {
        return alarmID;
    }

    @JsonProperty("AlarmID")
    public void setAlarmID(String alarmID) {
        this.alarmID = alarmID;
    }

    @JsonProperty("AlarmNumber")
    public Integer getAlarmNumber() {
        return alarmNumber;
    }

    @JsonProperty("AlarmNumber")
    public void setAlarmNumber(Integer alarmNumber) {
        this.alarmNumber = alarmNumber;
    }

    @JsonProperty("Enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("Enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @JsonProperty("IsHighType")
    public Boolean getIsHighType() {
        return isHighType;
    }

    @JsonProperty("IsHighType")
    public void setIsHighType(Boolean isHighType) {
        this.isHighType = isHighType;
    }

    @JsonProperty("HighRange")
    public Object getHighRange() {
        return highRange;
    }

    @JsonProperty("HighRange")
    public void setHighRange(Object highRange) {
        this.highRange = highRange;
    }

    @JsonProperty("LowRange")
    public Object getLowRange() {
        return lowRange;
    }

    @JsonProperty("LowRange")
    public void setLowRange(Object lowRange) {
        this.lowRange = lowRange;
    }

    @JsonProperty("AlarmDefinitionInfoId")
    public Object getAlarmDefinitionInfoId() {
        return alarmDefinitionInfoId;
    }

    @JsonProperty("AlarmDefinitionInfoId")
    public void setAlarmDefinitionInfoId(Object alarmDefinitionInfoId) {
        this.alarmDefinitionInfoId = alarmDefinitionInfoId;
    }

    @JsonProperty("Sensor")
    public Object getSensor() {
        return sensor;
    }

    @JsonProperty("Sensor")
    public void setSensor(Object sensor) {
        this.sensor = sensor;
    }

    @JsonProperty("IsSoftwareAlarm")
    public Boolean getIsSoftwareAlarm() {
        return isSoftwareAlarm;
    }

    @JsonProperty("IsSoftwareAlarm")
    public void setIsSoftwareAlarm(Boolean isSoftwareAlarm) {
        this.isSoftwareAlarm = isSoftwareAlarm;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
