package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * Identification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class Identification   {
  @JsonProperty("suscriberId")
  private String suscriberId = null;

  @JsonProperty("customerNumber")
  private String customerNumber = null;

  public Identification suscriberId(String suscriberId) {
    this.suscriberId = suscriberId;
    return this;
  }

    public String getSuscriberId() {
    return suscriberId;
  }

  public void setSuscriberId(String suscriberId) {
    this.suscriberId = suscriberId;
  }

  public Identification customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

  
    public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }


}
