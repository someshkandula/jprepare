
package com.somesh.coldstreamselect;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties
public class CompressedDatapoint {
    @JsonProperty("SensorID")
    private String sensorID;
    @JsonProperty("DataPoints")
    private byte[] dataPoints;
    @JsonProperty("FirstDataPointTime")
    private String firstDataPointTime;
    @JsonProperty("MarkedPoints")
    private byte[] markedPoints;
    @JsonProperty("Interval")
    private byte[] interval;
    @JsonProperty("NumberOfPoints")
    private Integer numberOfPoints;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SensorID")
    public String getSensorID() {
        return sensorID;
    }

    @JsonProperty("SensorID")
    public void setSensorID(String sensorID) {
        this.sensorID = sensorID;
    }

    @JsonProperty("DataPoints")
    public byte[] getDataPoints() {
        return dataPoints;
    }

    @JsonProperty("DataPoints")
    public void setDataPoints(byte[] dataPoints) {
        this.dataPoints = dataPoints;
    }

    @JsonProperty("FirstDataPointTime")
    public String getFirstDataPointTime() {
        return firstDataPointTime;
    }

    @JsonProperty("FirstDataPointTime")
    public void setFirstDataPointTime(String firstDataPointTime) {
        this.firstDataPointTime = firstDataPointTime;
    }

    @JsonProperty("MarkedPoints")
    public byte[] getMarkedPoints() {
        return markedPoints;
    }

    @JsonProperty("MarkedPoints")
    public void setMarkedPoints(byte[] markedPoints) {
        this.markedPoints = markedPoints;
    }

    @JsonProperty("Interval")
    public byte[] getInterval() {
        return interval;
    }

    @JsonProperty("Interval")
    public void setInterval(byte[] interval) {
        this.interval = interval;
    }

    @JsonProperty("NumberOfPoints")
    public Integer getNumberOfPoints() {
        return numberOfPoints;
    }

    @JsonProperty("NumberOfPoints")
    public void setNumberOfPoints(Integer numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
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
