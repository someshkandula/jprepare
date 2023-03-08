
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
    "ShipmentId",
    "ContentLevelId",
    "UITableId",
    "UITableRow",
    "UITableRowID",
    "PassSAGCheck"
})
@Generated("jsonschema2pojo")
public class ShipmentCollection {

    @JsonProperty("ShipmentId")
    private String shipmentId;
    @JsonProperty("ContentLevelId")
    private String contentLevelId;
    @JsonProperty("UITableId")
    private String uITableId;
    @JsonProperty("UITableRow")
    private Integer uITableRow;
    @JsonProperty("UITableRowID")
    private String uITableRowID;
    @JsonProperty("PassSAGCheck")
    private Boolean passSAGCheck;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ShipmentId")
    public String getShipmentId() {
        return shipmentId;
    }

    @JsonProperty("ShipmentId")
    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    @JsonProperty("ContentLevelId")
    public String getContentLevelId() {
        return contentLevelId;
    }

    @JsonProperty("ContentLevelId")
    public void setContentLevelId(String contentLevelId) {
        this.contentLevelId = contentLevelId;
    }

    @JsonProperty("UITableId")
    public String getUITableId() {
        return uITableId;
    }

    @JsonProperty("UITableId")
    public void setUITableId(String uITableId) {
        this.uITableId = uITableId;
    }

    @JsonProperty("UITableRow")
    public Integer getUITableRow() {
        return uITableRow;
    }

    @JsonProperty("UITableRow")
    public void setUITableRow(Integer uITableRow) {
        this.uITableRow = uITableRow;
    }

    @JsonProperty("UITableRowID")
    public String getUITableRowID() {
        return uITableRowID;
    }

    @JsonProperty("UITableRowID")
    public void setUITableRowID(String uITableRowID) {
        this.uITableRowID = uITableRowID;
    }

    @JsonProperty("PassSAGCheck")
    public Boolean getPassSAGCheck() {
        return passSAGCheck;
    }

    @JsonProperty("PassSAGCheck")
    public void setPassSAGCheck(Boolean passSAGCheck) {
        this.passSAGCheck = passSAGCheck;
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
