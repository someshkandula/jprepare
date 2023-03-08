
package com.coldstream.sensitech;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties
public class ColdStreamSelectResp {
    public ColdStreamSelectResp() {
    }

    @JsonProperty("SensorCollection")
    private List<SensorCollection> sensorCollection = null;

    @JsonProperty("ResetCount")
    private Integer resetCount;

    @JsonProperty("DownloadTimeZone")
    private String downloadTimeZone;

    @JsonProperty("DownloadUser")
    private String downloadUser;

    @JsonProperty("Interval")
    private Integer interval;

    @JsonProperty("TripNumber")
    private String tripNumber;

    @JsonProperty("SerialNumber")
    private String serialNumber;

    @JsonProperty("StartTime")
    private String startTime;

    @JsonProperty("StopTime")
    private String stopTime;

    @JsonProperty("DownloadDateTime")
    private String downloadDateTime;
}
