package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * ReturnDocument
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class ReturnDocument   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("serviceId")
  private String serviceId = null;

  public ReturnDocument type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ReturnDocument serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
   **/
  
    public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }


}
