
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
    "MonitorType",
    "DownloadedMonitorType"
})
@Generated("jsonschema2pojo")
public class SettingValue {

    @JsonProperty("MonitorType")
    private String monitorType;
    @JsonProperty("DownloadedMonitorType")
    private String downloadedMonitorType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MonitorType")
    public String getMonitorType() {
        return monitorType;
    }

    @JsonProperty("MonitorType")
    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }

    @JsonProperty("DownloadedMonitorType")
    public String getDownloadedMonitorType() {
        return downloadedMonitorType;
    }

    @JsonProperty("DownloadedMonitorType")
    public void setDownloadedMonitorType(String downloadedMonitorType) {
        this.downloadedMonitorType = downloadedMonitorType;
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
