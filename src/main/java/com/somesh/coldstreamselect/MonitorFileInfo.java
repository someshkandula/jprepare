
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
    "FileName",
    "Directory",
    "FileSize",
    "FileAlias",
    "FileType",
    "IsUploadedSuccessfully",
    "EntityID",
    "EntityTypeID",
    "FileID",
    "UploadedTime",
    "TripNumber",
    "SerialNumber",
    "ResetCount",
    "RowCreatedBy",
    "RowCreatedOn",
    "RowLastModifiedBy",
    "RowLastModifiedOn",
    "FileContent",
    "NamespaceID",
    "OrganizationID",
    "ErrorDescription"
})
@Generated("jsonschema2pojo")
public class MonitorFileInfo {

    @JsonProperty("FileName")
    private String fileName;
    @JsonProperty("Directory")
    private String directory;
    @JsonProperty("FileSize")
    private Integer fileSize;
    @JsonProperty("FileAlias")
    private String fileAlias;
    @JsonProperty("FileType")
    private String fileType;
    @JsonProperty("IsUploadedSuccessfully")
    private Boolean isUploadedSuccessfully;
    @JsonProperty("EntityID")
    private String entityID;
    @JsonProperty("EntityTypeID")
    private String entityTypeID;
    @JsonProperty("FileID")
    private Integer fileID;
    @JsonProperty("UploadedTime")
    private String uploadedTime;
    @JsonProperty("TripNumber")
    private Object tripNumber;
    @JsonProperty("SerialNumber")
    private Object serialNumber;
    @JsonProperty("ResetCount")
    private Object resetCount;
    @JsonProperty("RowCreatedBy")
    private String rowCreatedBy;
    @JsonProperty("RowCreatedOn")
    private String rowCreatedOn;
    @JsonProperty("RowLastModifiedBy")
    private String rowLastModifiedBy;
    @JsonProperty("RowLastModifiedOn")
    private String rowLastModifiedOn;
    @JsonProperty("FileContent")
    private Object fileContent;
    @JsonProperty("NamespaceID")
    private Integer namespaceID;
    @JsonProperty("OrganizationID")
    private Integer organizationID;
    @JsonProperty("ErrorDescription")
    private String errorDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("FileName")
    public String getFileName() {
        return fileName;
    }

    @JsonProperty("FileName")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @JsonProperty("Directory")
    public String getDirectory() {
        return directory;
    }

    @JsonProperty("Directory")
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    @JsonProperty("FileSize")
    public Integer getFileSize() {
        return fileSize;
    }

    @JsonProperty("FileSize")
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    @JsonProperty("FileAlias")
    public String getFileAlias() {
        return fileAlias;
    }

    @JsonProperty("FileAlias")
    public void setFileAlias(String fileAlias) {
        this.fileAlias = fileAlias;
    }

    @JsonProperty("FileType")
    public String getFileType() {
        return fileType;
    }

    @JsonProperty("FileType")
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @JsonProperty("IsUploadedSuccessfully")
    public Boolean getIsUploadedSuccessfully() {
        return isUploadedSuccessfully;
    }

    @JsonProperty("IsUploadedSuccessfully")
    public void setIsUploadedSuccessfully(Boolean isUploadedSuccessfully) {
        this.isUploadedSuccessfully = isUploadedSuccessfully;
    }

    @JsonProperty("EntityID")
    public String getEntityID() {
        return entityID;
    }

    @JsonProperty("EntityID")
    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    @JsonProperty("EntityTypeID")
    public String getEntityTypeID() {
        return entityTypeID;
    }

    @JsonProperty("EntityTypeID")
    public void setEntityTypeID(String entityTypeID) {
        this.entityTypeID = entityTypeID;
    }

    @JsonProperty("FileID")
    public Integer getFileID() {
        return fileID;
    }

    @JsonProperty("FileID")
    public void setFileID(Integer fileID) {
        this.fileID = fileID;
    }

    @JsonProperty("UploadedTime")
    public String getUploadedTime() {
        return uploadedTime;
    }

    @JsonProperty("UploadedTime")
    public void setUploadedTime(String uploadedTime) {
        this.uploadedTime = uploadedTime;
    }

    @JsonProperty("TripNumber")
    public Object getTripNumber() {
        return tripNumber;
    }

    @JsonProperty("TripNumber")
    public void setTripNumber(Object tripNumber) {
        this.tripNumber = tripNumber;
    }

    @JsonProperty("SerialNumber")
    public Object getSerialNumber() {
        return serialNumber;
    }

    @JsonProperty("SerialNumber")
    public void setSerialNumber(Object serialNumber) {
        this.serialNumber = serialNumber;
    }

    @JsonProperty("ResetCount")
    public Object getResetCount() {
        return resetCount;
    }

    @JsonProperty("ResetCount")
    public void setResetCount(Object resetCount) {
        this.resetCount = resetCount;
    }

    @JsonProperty("RowCreatedBy")
    public String getRowCreatedBy() {
        return rowCreatedBy;
    }

    @JsonProperty("RowCreatedBy")
    public void setRowCreatedBy(String rowCreatedBy) {
        this.rowCreatedBy = rowCreatedBy;
    }

    @JsonProperty("RowCreatedOn")
    public String getRowCreatedOn() {
        return rowCreatedOn;
    }

    @JsonProperty("RowCreatedOn")
    public void setRowCreatedOn(String rowCreatedOn) {
        this.rowCreatedOn = rowCreatedOn;
    }

    @JsonProperty("RowLastModifiedBy")
    public String getRowLastModifiedBy() {
        return rowLastModifiedBy;
    }

    @JsonProperty("RowLastModifiedBy")
    public void setRowLastModifiedBy(String rowLastModifiedBy) {
        this.rowLastModifiedBy = rowLastModifiedBy;
    }

    @JsonProperty("RowLastModifiedOn")
    public String getRowLastModifiedOn() {
        return rowLastModifiedOn;
    }

    @JsonProperty("RowLastModifiedOn")
    public void setRowLastModifiedOn(String rowLastModifiedOn) {
        this.rowLastModifiedOn = rowLastModifiedOn;
    }

    @JsonProperty("FileContent")
    public Object getFileContent() {
        return fileContent;
    }

    @JsonProperty("FileContent")
    public void setFileContent(Object fileContent) {
        this.fileContent = fileContent;
    }

    @JsonProperty("NamespaceID")
    public Integer getNamespaceID() {
        return namespaceID;
    }

    @JsonProperty("NamespaceID")
    public void setNamespaceID(Integer namespaceID) {
        this.namespaceID = namespaceID;
    }

    @JsonProperty("OrganizationID")
    public Integer getOrganizationID() {
        return organizationID;
    }

    @JsonProperty("OrganizationID")
    public void setOrganizationID(Integer organizationID) {
        this.organizationID = organizationID;
    }

    @JsonProperty("ErrorDescription")
    public String getErrorDescription() {
        return errorDescription;
    }

    @JsonProperty("ErrorDescription")
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
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
