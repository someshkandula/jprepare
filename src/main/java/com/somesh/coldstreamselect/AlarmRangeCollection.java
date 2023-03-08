
package com.somesh.coldstreamselect;

import java.util.HashMap;
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
    "AlarmRangeID",
    "MDAlarmID",
    "HighRange",
    "LowRange",
    "OriginalHighRange",
    "OriginalLowRange",
    "PreviousHighRange",
    "PreviousLowRange",
    "RangeNumber"
})
@Generated("jsonschema2pojo")
public class AlarmRangeCollection {

    @JsonProperty("AlarmRangeID")
    private String alarmRangeID;
    @JsonProperty("MDAlarmID")
    private String mDAlarmID;
    @JsonProperty("HighRange")
    private Double highRange;
    @JsonProperty("LowRange")
    private Object lowRange;
    @JsonProperty("OriginalHighRange")
    private Double originalHighRange;
    @JsonProperty("OriginalLowRange")
    private Object originalLowRange;
    @JsonProperty("PreviousHighRange")
    private Double previousHighRange;
    @JsonProperty("PreviousLowRange")
    private Object previousLowRange;
    @JsonProperty("RangeNumber")
    private Integer rangeNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AlarmRangeID")
    public String getAlarmRangeID() {
        return alarmRangeID;
    }

    @JsonProperty("AlarmRangeID")
    public void setAlarmRangeID(String alarmRangeID) {
        this.alarmRangeID = alarmRangeID;
    }

    @JsonProperty("MDAlarmID")
    public String getMDAlarmID() {
        return mDAlarmID;
    }

    @JsonProperty("MDAlarmID")
    public void setMDAlarmID(String mDAlarmID) {
        this.mDAlarmID = mDAlarmID;
    }

    @JsonProperty("HighRange")
    public Double getHighRange() {
        return highRange;
    }

    @JsonProperty("HighRange")
    public void setHighRange(Double highRange) {
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

    @JsonProperty("OriginalHighRange")
    public Double getOriginalHighRange() {
        return originalHighRange;
    }

    @JsonProperty("OriginalHighRange")
    public void setOriginalHighRange(Double originalHighRange) {
        this.originalHighRange = originalHighRange;
    }

    @JsonProperty("OriginalLowRange")
    public Object getOriginalLowRange() {
        return originalLowRange;
    }

    @JsonProperty("OriginalLowRange")
    public void setOriginalLowRange(Object originalLowRange) {
        this.originalLowRange = originalLowRange;
    }

    @JsonProperty("PreviousHighRange")
    public Double getPreviousHighRange() {
        return previousHighRange;
    }

    @JsonProperty("PreviousHighRange")
    public void setPreviousHighRange(Double previousHighRange) {
        this.previousHighRange = previousHighRange;
    }

    @JsonProperty("PreviousLowRange")
    public Object getPreviousLowRange() {
        return previousLowRange;
    }

    @JsonProperty("PreviousLowRange")
    public void setPreviousLowRange(Object previousLowRange) {
        this.previousLowRange = previousLowRange;
    }

    @JsonProperty("RangeNumber")
    public Integer getRangeNumber() {
        return rangeNumber;
    }

    @JsonProperty("RangeNumber")
    public void setRangeNumber(Integer rangeNumber) {
        this.rangeNumber = rangeNumber;
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
