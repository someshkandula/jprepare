package com.coldstream.sensitech;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
public class Event{
    @JsonProperty("TagInstanceChangeRecords") 
    public ArrayList<Object> tagInstanceChangeRecords;
    @JsonProperty("Location") 
    public Object location;
    @JsonProperty("CreationTime") 
    public Date creationTime;
    @JsonProperty("LocationID") 
    public Object locationID;
    @JsonProperty("EventTime") 
    public Date eventTime;
    @JsonProperty("Type") 
    public String type;
    @JsonProperty("EntityType") 
    public String entityType;
    @JsonProperty("ID") 
    public String iD;
    @JsonProperty("MDVersionID") 
    public Object mDVersionID;
    @JsonProperty("Creator") 
    public String creator;
    @JsonProperty("RecordTime") 
    public Date recordTime;
    @JsonProperty("MDTripNumber") 
    public Object mDTripNumber;
    @JsonProperty("MDSerialNumber") 
    public Object mDSerialNumber;
    @JsonProperty("MDResetCount") 
    public Object mDResetCount;
    @JsonProperty("EntityID") 
    public Object entityID;
    @JsonProperty("RootEntityID") 
    public Object rootEntityID;
}
