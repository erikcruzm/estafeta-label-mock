package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * Result
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class Result   {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("description")
  private String description = null;

  public Result code(Integer code) {
    this.code = code;
    return this;
  }

  
    public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Result description(String description) {
    this.description = description;
    return this;
  }

  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


}
