package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * WayBillDocument
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class WayBillDocument   {
  @JsonProperty("aditionalInfo")
  private String aditionalInfo = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("costCenter")
  private String costCenter = null;

  @JsonProperty("customerShipmentId")
  private String customerShipmentId = null;

  @JsonProperty("referenceNumber")
  private String referenceNumber = null;

  @JsonProperty("groupShipmentId")
  private String groupShipmentId = null;

  public WayBillDocument aditionalInfo(String aditionalInfo) {
    this.aditionalInfo = aditionalInfo;
    return this;
  }
    public String getAditionalInfo() {
    return aditionalInfo;
  }

  public void setAditionalInfo(String aditionalInfo) {
    this.aditionalInfo = aditionalInfo;
  }

  public WayBillDocument content(String content) {
    this.content = content;
    return this;
  }

  
    public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public WayBillDocument costCenter(String costCenter) {
    this.costCenter = costCenter;
    return this;
  }

  
    public String getCostCenter() {
    return costCenter;
  }

  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
  }

  public WayBillDocument customerShipmentId(String customerShipmentId) {
    this.customerShipmentId = customerShipmentId;
    return this;
  }

  
    public String getCustomerShipmentId() {
    return customerShipmentId;
  }

  public void setCustomerShipmentId(String customerShipmentId) {
    this.customerShipmentId = customerShipmentId;
  }

  public WayBillDocument referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  
    public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public WayBillDocument groupShipmentId(String groupShipmentId) {
    this.groupShipmentId = groupShipmentId;
    return this;
  }

    public String getGroupShipmentId() {
    return groupShipmentId;
  }

  public void setGroupShipmentId(String groupShipmentId) {
    this.groupShipmentId = groupShipmentId;
  }


}
