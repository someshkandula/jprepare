package com.coldstream.sensitech;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class SensorCollection{
    public SensorCollection() {
    }

    @JsonProperty("CompressedDatapoint")
    public CompressedDatapoint compressedDatapoint;

}
