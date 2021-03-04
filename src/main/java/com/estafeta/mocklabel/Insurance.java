package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;

/**
 * Insurance
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class Insurance   {
  @JsonProperty("contentDescription")
  private String contentDescription = null;

  @JsonProperty("declaredValue")
  private BigDecimal declaredValue = null;

  public Insurance contentDescription(String contentDescription) {
    this.contentDescription = contentDescription;
    return this;
  }

  /**
   * Get contentDescription
   * @return contentDescription
   **/
  
    public String getContentDescription() {
    return contentDescription;
  }

  public void setContentDescription(String contentDescription) {
    this.contentDescription = contentDescription;
  }

  public Insurance declaredValue(BigDecimal declaredValue) {
    this.declaredValue = declaredValue;
    return this;
  }

  /**
   * Get declaredValue
   * @return declaredValue
   **/
  
    public BigDecimal getDeclaredValue() {
    return declaredValue;
  }

  public void setDeclaredValue(BigDecimal declaredValue) {
    this.declaredValue = declaredValue;
  }


}
