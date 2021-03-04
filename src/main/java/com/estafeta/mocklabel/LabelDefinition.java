package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * LabelDefinition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class LabelDefinition   {
  @JsonProperty("wayBillDocument")
  private WayBillDocument wayBillDocument = null;

  @JsonProperty("itemDescription")
  private ItemDescription itemDescription = null;

  @JsonProperty("serviceConfiguration")
  private ServiceConfiguration serviceConfiguration = null;

  @JsonProperty("location")
  private LocationLabel location = null;

  public LabelDefinition wayBillDocument(WayBillDocument wayBillDocument) {
    this.wayBillDocument = wayBillDocument;
    return this;
  }

    public WayBillDocument getWayBillDocument() {
    return wayBillDocument;
  }

  public void setWayBillDocument(WayBillDocument wayBillDocument) {
    this.wayBillDocument = wayBillDocument;
  }

  public LabelDefinition itemDescription(ItemDescription itemDescription) {
    this.itemDescription = itemDescription;
    return this;
  }

    public ItemDescription getItemDescription() {
    return itemDescription;
  }

  public void setItemDescription(ItemDescription itemDescription) {
    this.itemDescription = itemDescription;
  }

  public LabelDefinition serviceConfiguration(ServiceConfiguration serviceConfiguration) {
    this.serviceConfiguration = serviceConfiguration;
    return this;
  }

    public ServiceConfiguration getServiceConfiguration() {
    return serviceConfiguration;
  }

  public void setServiceConfiguration(ServiceConfiguration serviceConfiguration) {
    this.serviceConfiguration = serviceConfiguration;
  }

  public LabelDefinition location(LocationLabel location) {
    this.location = location;
    return this;
  }

    public LocationLabel getLocation() {
    return location;
  }

  public void setLocation(LocationLabel location) {
    this.location = location;
  }


}
