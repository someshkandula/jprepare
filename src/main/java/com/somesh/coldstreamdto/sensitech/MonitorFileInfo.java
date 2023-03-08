package com.coldstream.sensitech;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class MonitorFileInfo{
    @JsonProperty("FileName") 
    public String fileName;
    @JsonProperty("Directory") 
    public String directory;
    @JsonProperty("FileSize") 
    public int fileSize;
    @JsonProperty("FileAlias")
    public String fileAlias;
    @JsonProperty("FileType") 
    public String fileType;
    @JsonProperty("IsUploadedSuccessfully") 
    public boolean isUploadedSuccessfully;
    @JsonProperty("EntityID") 
    public String entityID;
    @JsonProperty("EntityTypeID") 
    public String entityTypeID;
    @JsonProperty("FileID") 
    public int fileID;
    @JsonProperty("UploadedTime") 
    public Date uploadedTime;
    @JsonProperty("TripNumber") 
    public Object tripNumber;
    @JsonProperty("SerialNumber") 
    public Object serialNumber;
    @JsonProperty("ResetCount") 
    public Object resetCount;
    @JsonProperty("RowCreatedBy") 
    public String rowCreatedBy;
    @JsonProperty("RowCreatedOn") 
    public Date rowCreatedOn;
    @JsonProperty("RowLastModifiedBy") 
    public String rowLastModifiedBy;
    @JsonProperty("RowLastModifiedOn") 
    public Date rowLastModifiedOn;
    @JsonProperty("FileContent") 
    public Object fileContent;
    @JsonProperty("NamespaceID") 
    public int namespaceID;
    @JsonProperty("OrganizationID") 
    public int organizationID;
    @JsonProperty("ErrorDescription") 
    public String errorDescription;
}
