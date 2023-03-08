
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
    "TagInstanceChangeRecords",
    "Location",
    "CreationTime",
    "LocationID",
    "EventTime",
    "Type",
    "EntityType",
    "ID",
    "MDVersionID",
    "Creator",
    "RecordTime",
    "MDTripNumber",
    "MDSerialNumber",
    "MDResetCount",
    "EntityID",
    "RootEntityID"
})
@Generated("jsonschema2pojo")
public class Event {

    @JsonProperty("TagInstanceChangeRecords")
    private List<Object> tagInstanceChangeRecords = null;
    @JsonProperty("Location")
    private Object location;
    @JsonProperty("CreationTime")
    private String creationTime;
    @JsonProperty("LocationID")
    private Object locationID;
    @JsonProperty("EventTime")
    private String eventTime;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonProperty("ID")
    private String id;
    @JsonProperty("MDVersionID")
    private Object mDVersionID;
    @JsonProperty("Creator")
    private String creator;
    @JsonProperty("RecordTime")
    private String recordTime;
    @JsonProperty("MDTripNumber")
    private Object mDTripNumber;
    @JsonProperty("MDSerialNumber")
    private Object mDSerialNumber;
    @JsonProperty("MDResetCount")
    private Object mDResetCount;
    @JsonProperty("EntityID")
    private Object entityID;
    @JsonProperty("RootEntityID")
    private Object rootEntityID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TagInstanceChangeRecords")
    public List<Object> getTagInstanceChangeRecords() {
        return tagInstanceChangeRecords;
    }

    @JsonProperty("TagInstanceChangeRecords")
    public void setTagInstanceChangeRecords(List<Object> tagInstanceChangeRecords) {
        this.tagInstanceChangeRecords = tagInstanceChangeRecords;
    }

    @JsonProperty("Location")
    public Object getLocation() {
        return location;
    }

    @JsonProperty("Location")
    public void setLocation(Object location) {
        this.location = location;
    }

    @JsonProperty("CreationTime")
    public String getCreationTime() {
        return creationTime;
    }

    @JsonProperty("CreationTime")
    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    @JsonProperty("LocationID")
    public Object getLocationID() {
        return locationID;
    }

    @JsonProperty("LocationID")
    public void setLocationID(Object locationID) {
        this.locationID = locationID;
    }

    @JsonProperty("EventTime")
    public String getEventTime() {
        return eventTime;
    }

    @JsonProperty("EventTime")
    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("EntityType")
    public String getEntityType() {
        return entityType;
    }

    @JsonProperty("EntityType")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("MDVersionID")
    public Object getMDVersionID() {
        return mDVersionID;
    }

    @JsonProperty("MDVersionID")
    public void setMDVersionID(Object mDVersionID) {
        this.mDVersionID = mDVersionID;
    }

    @JsonProperty("Creator")
    public String getCreator() {
        return creator;
    }

    @JsonProperty("Creator")
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @JsonProperty("RecordTime")
    public String getRecordTime() {
        return recordTime;
    }

    @JsonProperty("RecordTime")
    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime;
    }

    @JsonProperty("MDTripNumber")
    public Object getMDTripNumber() {
        return mDTripNumber;
    }

    @JsonProperty("MDTripNumber")
    public void setMDTripNumber(Object mDTripNumber) {
        this.mDTripNumber = mDTripNumber;
    }

    @JsonProperty("MDSerialNumber")
    public Object getMDSerialNumber() {
        return mDSerialNumber;
    }

    @JsonProperty("MDSerialNumber")
    public void setMDSerialNumber(Object mDSerialNumber) {
        this.mDSerialNumber = mDSerialNumber;
    }

    @JsonProperty("MDResetCount")
    public Object getMDResetCount() {
        return mDResetCount;
    }

    @JsonProperty("MDResetCount")
    public void setMDResetCount(Object mDResetCount) {
        this.mDResetCount = mDResetCount;
    }

    @JsonProperty("EntityID")
    public Object getEntityID() {
        return entityID;
    }

    @JsonProperty("EntityID")
    public void setEntityID(Object entityID) {
        this.entityID = entityID;
    }

    @JsonProperty("RootEntityID")
    public Object getRootEntityID() {
        return rootEntityID;
    }

    @JsonProperty("RootEntityID")
    public void setRootEntityID(Object rootEntityID) {
        this.rootEntityID = rootEntityID;
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
