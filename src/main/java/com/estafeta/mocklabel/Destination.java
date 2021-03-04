package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Destination
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class Destination   {
  @JsonProperty("isDeliveryToPUDO")
  private Boolean isDeliveryToPUDO = null;

  @JsonProperty("deliveryPUDOCode")
  private String deliveryPUDOCode = null;

  @JsonProperty("homeAddress")
  private Location homeAddress = null;

  public Destination isDeliveryToPUDO(Boolean isDeliveryToPUDO) {
    this.isDeliveryToPUDO = isDeliveryToPUDO;
    return this;
  }

    public Boolean isIsDeliveryToPUDO() {
    return isDeliveryToPUDO;
  }

  public void setIsDeliveryToPUDO(Boolean isDeliveryToPUDO) {
    this.isDeliveryToPUDO = isDeliveryToPUDO;
  }

  public Destination deliveryPUDOCode(String deliveryPUDOCode) {
    this.deliveryPUDOCode = deliveryPUDOCode;
    return this;
  }

    public String getDeliveryPUDOCode() {
    return deliveryPUDOCode;
  }

  public void setDeliveryPUDOCode(String deliveryPUDOCode) {
    this.deliveryPUDOCode = deliveryPUDOCode;
  }

  public Destination homeAddress(Location homeAddress) {
    this.homeAddress = homeAddress;
    return this;
  }

    public Location getHomeAddress() {
    return homeAddress;
  }

  public void setHomeAddress(Location homeAddress) {
    this.homeAddress = homeAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Destination destination = (Destination) o;
    return Objects.equals(this.isDeliveryToPUDO, destination.isDeliveryToPUDO) &&
        Objects.equals(this.deliveryPUDOCode, destination.deliveryPUDOCode) &&
        Objects.equals(this.homeAddress, destination.homeAddress);
  }

}
