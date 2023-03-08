
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
    "Sensor1DateValidated",
    "Sensor1Passed",
    "Enabled",
    "Sensor1TesterName",
    "Sensor1NistDataName",
    "Sensor2DateValidated",
    "Sensor2Passed",
    "Sensor2TesterName",
    "Sensor2NistDataName",
    "Sensor1Point1StandardReading",
    "Sensor1Point2StandardReading",
    "Sensor1Point3StandardReading",
    "Sensor1Point1Tolerance",
    "Sensor1Point2Tolerance",
    "Sensor1Point3Tolerance",
    "Sensor2Point1StandardReading",
    "Sensor2Point2StandardReading",
    "Sensor2Point3StandardReading",
    "Sensor1Point1Reading",
    "Sensor1Point2Reading",
    "Sensor1Point3Reading",
    "Sensor1Point1Variance",
    "Sensor1Point2Variance",
    "Sensor1Point3Variance",
    "Sensor2Point1Reading",
    "Sensor2Point2Reading",
    "Sensor2Point3Reading",
    "Sensor2Point1Variance",
    "Sensor2Point2Variance",
    "Sensor2Point3Variance",
    "Sensor2Point1Tolerance",
    "Sensor2Point2Tolerance",
    "Sensor2Point3Tolerance"
})
@Generated("jsonschema2pojo")
public class MonitorCertification {

    @JsonProperty("Sensor1DateValidated")
    private String sensor1DateValidated;
    @JsonProperty("Sensor1Passed")
    private Object sensor1Passed;
    @JsonProperty("Enabled")
    private Boolean enabled;
    @JsonProperty("Sensor1TesterName")
    private Object sensor1TesterName;
    @JsonProperty("Sensor1NistDataName")
    private String sensor1NistDataName;
    @JsonProperty("Sensor2DateValidated")
    private Object sensor2DateValidated;
    @JsonProperty("Sensor2Passed")
    private Object sensor2Passed;
    @JsonProperty("Sensor2TesterName")
    private Object sensor2TesterName;
    @JsonProperty("Sensor2NistDataName")
    private Object sensor2NistDataName;
    @JsonProperty("Sensor1Point1StandardReading")
    private Object sensor1Point1StandardReading;
    @JsonProperty("Sensor1Point2StandardReading")
    private Object sensor1Point2StandardReading;
    @JsonProperty("Sensor1Point3StandardReading")
    private Object sensor1Point3StandardReading;
    @JsonProperty("Sensor1Point1Tolerance")
    private Object sensor1Point1Tolerance;
    @JsonProperty("Sensor1Point2Tolerance")
    private Object sensor1Point2Tolerance;
    @JsonProperty("Sensor1Point3Tolerance")
    private Object sensor1Point3Tolerance;
    @JsonProperty("Sensor2Point1StandardReading")
    private Object sensor2Point1StandardReading;
    @JsonProperty("Sensor2Point2StandardReading")
    private Object sensor2Point2StandardReading;
    @JsonProperty("Sensor2Point3StandardReading")
    private Object sensor2Point3StandardReading;
    @JsonProperty("Sensor1Point1Reading")
    private Object sensor1Point1Reading;
    @JsonProperty("Sensor1Point2Reading")
    private Object sensor1Point2Reading;
    @JsonProperty("Sensor1Point3Reading")
    private Object sensor1Point3Reading;
    @JsonProperty("Sensor1Point1Variance")
    private Object sensor1Point1Variance;
    @JsonProperty("Sensor1Point2Variance")
    private Object sensor1Point2Variance;
    @JsonProperty("Sensor1Point3Variance")
    private Object sensor1Point3Variance;
    @JsonProperty("Sensor2Point1Reading")
    private Object sensor2Point1Reading;
    @JsonProperty("Sensor2Point2Reading")
    private Object sensor2Point2Reading;
    @JsonProperty("Sensor2Point3Reading")
    private Object sensor2Point3Reading;
    @JsonProperty("Sensor2Point1Variance")
    private Object sensor2Point1Variance;
    @JsonProperty("Sensor2Point2Variance")
    private Object sensor2Point2Variance;
    @JsonProperty("Sensor2Point3Variance")
    private Object sensor2Point3Variance;
    @JsonProperty("Sensor2Point1Tolerance")
    private Object sensor2Point1Tolerance;
    @JsonProperty("Sensor2Point2Tolerance")
    private Object sensor2Point2Tolerance;
    @JsonProperty("Sensor2Point3Tolerance")
    private Object sensor2Point3Tolerance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Sensor1DateValidated")
    public String getSensor1DateValidated() {
        return sensor1DateValidated;
    }

    @JsonProperty("Sensor1DateValidated")
    public void setSensor1DateValidated(String sensor1DateValidated) {
        this.sensor1DateValidated = sensor1DateValidated;
    }

    @JsonProperty("Sensor1Passed")
    public Object getSensor1Passed() {
        return sensor1Passed;
    }

    @JsonProperty("Sensor1Passed")
    public void setSensor1Passed(Object sensor1Passed) {
        this.sensor1Passed = sensor1Passed;
    }

    @JsonProperty("Enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("Enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @JsonProperty("Sensor1TesterName")
    public Object getSensor1TesterName() {
        return sensor1TesterName;
    }

    @JsonProperty("Sensor1TesterName")
    public void setSensor1TesterName(Object sensor1TesterName) {
        this.sensor1TesterName = sensor1TesterName;
    }

    @JsonProperty("Sensor1NistDataName")
    public String getSensor1NistDataName() {
        return sensor1NistDataName;
    }

    @JsonProperty("Sensor1NistDataName")
    public void setSensor1NistDataName(String sensor1NistDataName) {
        this.sensor1NistDataName = sensor1NistDataName;
    }

    @JsonProperty("Sensor2DateValidated")
    public Object getSensor2DateValidated() {
        return sensor2DateValidated;
    }

    @JsonProperty("Sensor2DateValidated")
    public void setSensor2DateValidated(Object sensor2DateValidated) {
        this.sensor2DateValidated = sensor2DateValidated;
    }

    @JsonProperty("Sensor2Passed")
    public Object getSensor2Passed() {
        return sensor2Passed;
    }

    @JsonProperty("Sensor2Passed")
    public void setSensor2Passed(Object sensor2Passed) {
        this.sensor2Passed = sensor2Passed;
    }

    @JsonProperty("Sensor2TesterName")
    public Object getSensor2TesterName() {
        return sensor2TesterName;
    }

    @JsonProperty("Sensor2TesterName")
    public void setSensor2TesterName(Object sensor2TesterName) {
        this.sensor2TesterName = sensor2TesterName;
    }

    @JsonProperty("Sensor2NistDataName")
    public Object getSensor2NistDataName() {
        return sensor2NistDataName;
    }

    @JsonProperty("Sensor2NistDataName")
    public void setSensor2NistDataName(Object sensor2NistDataName) {
        this.sensor2NistDataName = sensor2NistDataName;
    }

    @JsonProperty("Sensor1Point1StandardReading")
    public Object getSensor1Point1StandardReading() {
        return sensor1Point1StandardReading;
    }

    @JsonProperty("Sensor1Point1StandardReading")
    public void setSensor1Point1StandardReading(Object sensor1Point1StandardReading) {
        this.sensor1Point1StandardReading = sensor1Point1StandardReading;
    }

    @JsonProperty("Sensor1Point2StandardReading")
    public Object getSensor1Point2StandardReading() {
        return sensor1Point2StandardReading;
    }

    @JsonProperty("Sensor1Point2StandardReading")
    public void setSensor1Point2StandardReading(Object sensor1Point2StandardReading) {
        this.sensor1Point2StandardReading = sensor1Point2StandardReading;
    }

    @JsonProperty("Sensor1Point3StandardReading")
    public Object getSensor1Point3StandardReading() {
        return sensor1Point3StandardReading;
    }

    @JsonProperty("Sensor1Point3StandardReading")
    public void setSensor1Point3StandardReading(Object sensor1Point3StandardReading) {
        this.sensor1Point3StandardReading = sensor1Point3StandardReading;
    }

    @JsonProperty("Sensor1Point1Tolerance")
    public Object getSensor1Point1Tolerance() {
        return sensor1Point1Tolerance;
    }

    @JsonProperty("Sensor1Point1Tolerance")
    public void setSensor1Point1Tolerance(Object sensor1Point1Tolerance) {
        this.sensor1Point1Tolerance = sensor1Point1Tolerance;
    }

    @JsonProperty("Sensor1Point2Tolerance")
    public Object getSensor1Point2Tolerance() {
        return sensor1Point2Tolerance;
    }

    @JsonProperty("Sensor1Point2Tolerance")
    public void setSensor1Point2Tolerance(Object sensor1Point2Tolerance) {
        this.sensor1Point2Tolerance = sensor1Point2Tolerance;
    }

    @JsonProperty("Sensor1Point3Tolerance")
    public Object getSensor1Point3Tolerance() {
        return sensor1Point3Tolerance;
    }

    @JsonProperty("Sensor1Point3Tolerance")
    public void setSensor1Point3Tolerance(Object sensor1Point3Tolerance) {
        this.sensor1Point3Tolerance = sensor1Point3Tolerance;
    }

    @JsonProperty("Sensor2Point1StandardReading")
    public Object getSensor2Point1StandardReading() {
        return sensor2Point1StandardReading;
    }

    @JsonProperty("Sensor2Point1StandardReading")
    public void setSensor2Point1StandardReading(Object sensor2Point1StandardReading) {
        this.sensor2Point1StandardReading = sensor2Point1StandardReading;
    }

    @JsonProperty("Sensor2Point2StandardReading")
    public Object getSensor2Point2StandardReading() {
        return sensor2Point2StandardReading;
    }

    @JsonProperty("Sensor2Point2StandardReading")
    public void setSensor2Point2StandardReading(Object sensor2Point2StandardReading) {
        this.sensor2Point2StandardReading = sensor2Point2StandardReading;
    }

    @JsonProperty("Sensor2Point3StandardReading")
    public Object getSensor2Point3StandardReading() {
        return sensor2Point3StandardReading;
    }

    @JsonProperty("Sensor2Point3StandardReading")
    public void setSensor2Point3StandardReading(Object sensor2Point3StandardReading) {
        this.sensor2Point3StandardReading = sensor2Point3StandardReading;
    }

    @JsonProperty("Sensor1Point1Reading")
    public Object getSensor1Point1Reading() {
        return sensor1Point1Reading;
    }

    @JsonProperty("Sensor1Point1Reading")
    public void setSensor1Point1Reading(Object sensor1Point1Reading) {
        this.sensor1Point1Reading = sensor1Point1Reading;
    }

    @JsonProperty("Sensor1Point2Reading")
    public Object getSensor1Point2Reading() {
        return sensor1Point2Reading;
    }

    @JsonProperty("Sensor1Point2Reading")
    public void setSensor1Point2Reading(Object sensor1Point2Reading) {
        this.sensor1Point2Reading = sensor1Point2Reading;
    }

    @JsonProperty("Sensor1Point3Reading")
    public Object getSensor1Point3Reading() {
        return sensor1Point3Reading;
    }

    @JsonProperty("Sensor1Point3Reading")
    public void setSensor1Point3Reading(Object sensor1Point3Reading) {
        this.sensor1Point3Reading = sensor1Point3Reading;
    }

    @JsonProperty("Sensor1Point1Variance")
    public Object getSensor1Point1Variance() {
        return sensor1Point1Variance;
    }

    @JsonProperty("Sensor1Point1Variance")
    public void setSensor1Point1Variance(Object sensor1Point1Variance) {
        this.sensor1Point1Variance = sensor1Point1Variance;
    }

    @JsonProperty("Sensor1Point2Variance")
    public Object getSensor1Point2Variance() {
        return sensor1Point2Variance;
    }

    @JsonProperty("Sensor1Point2Variance")
    public void setSensor1Point2Variance(Object sensor1Point2Variance) {
        this.sensor1Point2Variance = sensor1Point2Variance;
    }

    @JsonProperty("Sensor1Point3Variance")
    public Object getSensor1Point3Variance() {
        return sensor1Point3Variance;
    }

    @JsonProperty("Sensor1Point3Variance")
    public void setSensor1Point3Variance(Object sensor1Point3Variance) {
        this.sensor1Point3Variance = sensor1Point3Variance;
    }

    @JsonProperty("Sensor2Point1Reading")
    public Object getSensor2Point1Reading() {
        return sensor2Point1Reading;
    }

    @JsonProperty("Sensor2Point1Reading")
    public void setSensor2Point1Reading(Object sensor2Point1Reading) {
        this.sensor2Point1Reading = sensor2Point1Reading;
    }

    @JsonProperty("Sensor2Point2Reading")
    public Object getSensor2Point2Reading() {
        return sensor2Point2Reading;
    }

    @JsonProperty("Sensor2Point2Reading")
    public void setSensor2Point2Reading(Object sensor2Point2Reading) {
        this.sensor2Point2Reading = sensor2Point2Reading;
    }

    @JsonProperty("Sensor2Point3Reading")
    public Object getSensor2Point3Reading() {
        return sensor2Point3Reading;
    }

    @JsonProperty("Sensor2Point3Reading")
    public void setSensor2Point3Reading(Object sensor2Point3Reading) {
        this.sensor2Point3Reading = sensor2Point3Reading;
    }

    @JsonProperty("Sensor2Point1Variance")
    public Object getSensor2Point1Variance() {
        return sensor2Point1Variance;
    }

    @JsonProperty("Sensor2Point1Variance")
    public void setSensor2Point1Variance(Object sensor2Point1Variance) {
        this.sensor2Point1Variance = sensor2Point1Variance;
    }

    @JsonProperty("Sensor2Point2Variance")
    public Object getSensor2Point2Variance() {
        return sensor2Point2Variance;
    }

    @JsonProperty("Sensor2Point2Variance")
    public void setSensor2Point2Variance(Object sensor2Point2Variance) {
        this.sensor2Point2Variance = sensor2Point2Variance;
    }

    @JsonProperty("Sensor2Point3Variance")
    public Object getSensor2Point3Variance() {
        return sensor2Point3Variance;
    }

    @JsonProperty("Sensor2Point3Variance")
    public void setSensor2Point3Variance(Object sensor2Point3Variance) {
        this.sensor2Point3Variance = sensor2Point3Variance;
    }

    @JsonProperty("Sensor2Point1Tolerance")
    public Object getSensor2Point1Tolerance() {
        return sensor2Point1Tolerance;
    }

    @JsonProperty("Sensor2Point1Tolerance")
    public void setSensor2Point1Tolerance(Object sensor2Point1Tolerance) {
        this.sensor2Point1Tolerance = sensor2Point1Tolerance;
    }

    @JsonProperty("Sensor2Point2Tolerance")
    public Object getSensor2Point2Tolerance() {
        return sensor2Point2Tolerance;
    }

    @JsonProperty("Sensor2Point2Tolerance")
    public void setSensor2Point2Tolerance(Object sensor2Point2Tolerance) {
        this.sensor2Point2Tolerance = sensor2Point2Tolerance;
    }

    @JsonProperty("Sensor2Point3Tolerance")
    public Object getSensor2Point3Tolerance() {
        return sensor2Point3Tolerance;
    }

    @JsonProperty("Sensor2Point3Tolerance")
    public void setSensor2Point3Tolerance(Object sensor2Point3Tolerance) {
        this.sensor2Point3Tolerance = sensor2Point3Tolerance;
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
