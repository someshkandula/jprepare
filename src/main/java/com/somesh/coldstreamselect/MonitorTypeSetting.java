
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
    "MonitorTypeSettingId",
    "MonitorTypeName",
    "MonitorTypeId",
    "DownloadedMonitorTypeId",
    "BaseMonitorTypeSettingId",
    "MaxNumOfPoints",
    "SettingValue",
    "ParentMonitorTypes"
})
@Generated("jsonschema2pojo")
public class MonitorTypeSetting {

    @JsonProperty("MonitorTypeSettingId")
    private String monitorTypeSettingId;
    @JsonProperty("MonitorTypeName")
    private String monitorTypeName;
    @JsonProperty("MonitorTypeId")
    private String monitorTypeId;
    @JsonProperty("DownloadedMonitorTypeId")
    private String downloadedMonitorTypeId;
    @JsonProperty("BaseMonitorTypeSettingId")
    private Object baseMonitorTypeSettingId;
    @JsonProperty("MaxNumOfPoints")
    private Object maxNumOfPoints;
    @JsonProperty("SettingValue")
    private SettingValue settingValue;
    @JsonProperty("ParentMonitorTypes")
    private List<Object> parentMonitorTypes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MonitorTypeSettingId")
    public String getMonitorTypeSettingId() {
        return monitorTypeSettingId;
    }

    @JsonProperty("MonitorTypeSettingId")
    public void setMonitorTypeSettingId(String monitorTypeSettingId) {
        this.monitorTypeSettingId = monitorTypeSettingId;
    }

    @JsonProperty("MonitorTypeName")
    public String getMonitorTypeName() {
        return monitorTypeName;
    }

    @JsonProperty("MonitorTypeName")
    public void setMonitorTypeName(String monitorTypeName) {
        this.monitorTypeName = monitorTypeName;
    }

    @JsonProperty("MonitorTypeId")
    public String getMonitorTypeId() {
        return monitorTypeId;
    }

    @JsonProperty("MonitorTypeId")
    public void setMonitorTypeId(String monitorTypeId) {
        this.monitorTypeId = monitorTypeId;
    }

    @JsonProperty("DownloadedMonitorTypeId")
    public String getDownloadedMonitorTypeId() {
        return downloadedMonitorTypeId;
    }

    @JsonProperty("DownloadedMonitorTypeId")
    public void setDownloadedMonitorTypeId(String downloadedMonitorTypeId) {
        this.downloadedMonitorTypeId = downloadedMonitorTypeId;
    }

    @JsonProperty("BaseMonitorTypeSettingId")
    public Object getBaseMonitorTypeSettingId() {
        return baseMonitorTypeSettingId;
    }

    @JsonProperty("BaseMonitorTypeSettingId")
    public void setBaseMonitorTypeSettingId(Object baseMonitorTypeSettingId) {
        this.baseMonitorTypeSettingId = baseMonitorTypeSettingId;
    }

    @JsonProperty("MaxNumOfPoints")
    public Object getMaxNumOfPoints() {
        return maxNumOfPoints;
    }

    @JsonProperty("MaxNumOfPoints")
    public void setMaxNumOfPoints(Object maxNumOfPoints) {
        this.maxNumOfPoints = maxNumOfPoints;
    }

    @JsonProperty("SettingValue")
    public SettingValue getSettingValue() {
        return settingValue;
    }

    @JsonProperty("SettingValue")
    public void setSettingValue(SettingValue settingValue) {
        this.settingValue = settingValue;
    }

    @JsonProperty("ParentMonitorTypes")
    public List<Object> getParentMonitorTypes() {
        return parentMonitorTypes;
    }

    @JsonProperty("ParentMonitorTypes")
    public void setParentMonitorTypes(List<Object> parentMonitorTypes) {
        this.parentMonitorTypes = parentMonitorTypes;
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
