
package com.coldstream.sensitech;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class ColdStreamSelect {

    @JsonProperty("resetCount")
    private Integer resetCount;

    @JsonProperty("responseCode")
    private int responseCode;

    @JsonProperty("message")
    private String message;

    @JsonProperty("responseData")
    private ColdStreamSelectResp coldStreamResponse;

}
