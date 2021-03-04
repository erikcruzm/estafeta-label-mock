package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * ApiRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class ApiRequest   {
  @JsonProperty("identification")
  private Identification identification = null;

  @JsonProperty("systemInformation")
  private SystemInformation systemInformation = null;

  @JsonProperty("labelDefinition")
  private LabelDefinition labelDefinition = null;

  public ApiRequest identification(Identification identification) {
    this.identification = identification;
    return this;
  }

    public Identification getIdentification() {
    return identification;
  }

  public void setIdentification(Identification identification) {
    this.identification = identification;
  }

  public ApiRequest systemInformation(SystemInformation systemInformation) {
    this.systemInformation = systemInformation;
    return this;
  }

    public SystemInformation getSystemInformation() {
    return systemInformation;
  }

  public void setSystemInformation(SystemInformation systemInformation) {
    this.systemInformation = systemInformation;
  }

  public ApiRequest labelDefinition(LabelDefinition labelDefinition) {
    this.labelDefinition = labelDefinition;
    return this;
  }

    public LabelDefinition getLabelDefinition() {
    return labelDefinition;
  }

  public void setLabelDefinition(LabelDefinition labelDefinition) {
    this.labelDefinition = labelDefinition;
  }


}
