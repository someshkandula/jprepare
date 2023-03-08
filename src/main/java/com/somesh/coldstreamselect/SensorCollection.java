
package com.somesh.coldstreamselect;

import com.fasterxml.jackson.annotation.*;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SensorCollection {

    @JsonProperty("CompressedDatapoint")
    private CompressedDatapoint compressedDatapoint;
    @JsonProperty("DataPoints")
    private Object dataPoints;
    @JsonProperty("SensorId")
    private String sensorId;
    @JsonProperty("DataType")
    private String dataType;
    @JsonProperty("SensorNumber")
    private Integer sensorNumber;
    @JsonProperty("SensorType")
    private String sensorType;
    @JsonProperty("MaxNumOfPoints")
    private Integer maxNumOfPoints;
    @JsonProperty("CurrentNumOfPoints")
    private Integer currentNumOfPoints;
    @JsonProperty("MonitorDataId")
    private String monitorDataId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CompressedDatapoint")
    public CompressedDatapoint getCompressedDatapoint() {
        return compressedDatapoint;
    }

    @JsonProperty("CompressedDatapoint")
    public void setCompressedDatapoint(CompressedDatapoint compressedDatapoint) {
        this.compressedDatapoint = compressedDatapoint;
    }

    @JsonProperty("DataPoints")
    public Object getDataPoints() {
        return dataPoints;
    }

    @JsonProperty("DataPoints")
    public void setDataPoints(Object dataPoints) {
        this.dataPoints = dataPoints;
    }

    @JsonProperty("SensorId")
    public String getSensorId() {
        return sensorId;
    }

    @JsonProperty("SensorId")
    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    @JsonProperty("DataType")
    public String getDataType() {
        return dataType;
    }

    @JsonProperty("DataType")
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @JsonProperty("SensorNumber")
    public Integer getSensorNumber() {
        return sensorNumber;
    }

    @JsonProperty("SensorNumber")
    public void setSensorNumber(Integer sensorNumber) {
        this.sensorNumber = sensorNumber;
    }

    @JsonProperty("SensorType")
    public String getSensorType() {
        return sensorType;
    }

    @JsonProperty("SensorType")
    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    @JsonProperty("MaxNumOfPoints")
    public Integer getMaxNumOfPoints() {
        return maxNumOfPoints;
    }

    @JsonProperty("MaxNumOfPoints")
    public void setMaxNumOfPoints(Integer maxNumOfPoints) {
        this.maxNumOfPoints = maxNumOfPoints;
    }

    @JsonProperty("CurrentNumOfPoints")
    public Integer getCurrentNumOfPoints() {
        return currentNumOfPoints;
    }

    @JsonProperty("CurrentNumOfPoints")
    public void setCurrentNumOfPoints(Integer currentNumOfPoints) {
        this.currentNumOfPoints = currentNumOfPoints;
    }

    @JsonProperty("MonitorDataId")
    public String getMonitorDataId() {
        return monitorDataId;
    }

    @JsonProperty("MonitorDataId")
    public void setMonitorDataId(String monitorDataId) {
        this.monitorDataId = monitorDataId;
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
