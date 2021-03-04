package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * WayBillPetitionResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class WayBillPetitionResponse  {
  @JsonProperty("data")
  private String data = null;

  @JsonProperty("labelPetitionResult")
  private LabelPetitionResult labelPetitionResult = new LabelPetitionResult();

  public WayBillPetitionResponse data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  
    public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public WayBillPetitionResponse labelPetitionResult(LabelPetitionResult labelPetitionResult) {
    this.labelPetitionResult = labelPetitionResult;
    return this;
  }

  /**
   * Get labelPetitionResult
   * @return labelPetitionResult
   **/
    public LabelPetitionResult getLabelPetitionResult() {
    return labelPetitionResult;
  }

  public void setLabelPetitionResult(LabelPetitionResult labelPetitionResult) {
    this.labelPetitionResult = labelPetitionResult;
  }


}
