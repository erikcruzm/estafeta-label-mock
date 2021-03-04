package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;

/**
 * ItemDescription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class ItemDescription   {
  @JsonProperty("parcelId")
  private Integer parcelId = null;

  @JsonProperty("weight")
  private BigDecimal weight = null;

  @JsonProperty("height")
  private BigDecimal height = null;

  @JsonProperty("length")
  private BigDecimal length = null;

  @JsonProperty("width")
  private BigDecimal width = null;

  public ItemDescription parcelId(Integer parcelId) {
    this.parcelId = parcelId;
    return this;
  }

    public Integer getParcelId() {
    return parcelId;
  }

  public void setParcelId(Integer parcelId) {
    this.parcelId = parcelId;
  }

  public ItemDescription weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

    public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  public ItemDescription height(BigDecimal height) {
    this.height = height;
    return this;
  }

    public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public ItemDescription length(BigDecimal length) {
    this.length = length;
    return this;
  }

    public BigDecimal getLength() {
    return length;
  }

  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public ItemDescription width(BigDecimal width) {
    this.width = width;
    return this;
  }

    public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }


}
