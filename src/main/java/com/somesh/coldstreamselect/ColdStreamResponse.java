
package com.somesh.coldstreamselect;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonIgnoreProperties
@AllArgsConstructor
public class ColdStreamResponse {
    public ColdStreamResponse() {
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

    @JsonProperty("StartTime")
    private String startTime;
    @JsonProperty("TripNumber")
    private String tripNumber;

    @JsonProperty("SerialNumber")
    private String serialNumber;
    @JsonProperty("StopTime")
    private String stopTime;

    @JsonProperty("DownloadDateTime")
    private String downloadDateTime;
    @JsonProperty("MonitorDataID")
    private String monitorDataID;


}
