
package com.somesh.coldstreamselect;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ColdStreamData {
    @JsonProperty("responseCode")
    private int responseCode;

    @JsonProperty("message")
    private String message;

    @JsonProperty("responseData")
    private ColdStreamResponse coldStreamResponse;

}
