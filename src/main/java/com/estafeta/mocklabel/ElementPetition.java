package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * ElementPetition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class ElementPetition   {
  @JsonProperty("wayBill")
  private String wayBill = null;

  @JsonProperty("trackingCode")
  private String trackingCode = null;

  public ElementPetition wayBill(String wayBill) {
    this.wayBill = wayBill;
    return this;
  }

  /**
   * Get wayBill
   * @return wayBill
   **/
  
    public String getWayBill() {
    return wayBill;
  }

  public void setWayBill(String wayBill) {
    this.wayBill = wayBill;
  }

  public ElementPetition trackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
    return this;
  }

  /**
   * Get trackingCode
   * @return trackingCode
   **/
  
    public String getTrackingCode() {
    return trackingCode;
  }

  public void setTrackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
  }


}
