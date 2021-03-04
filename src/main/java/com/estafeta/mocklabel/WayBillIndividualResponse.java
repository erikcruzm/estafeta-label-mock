package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * WayBillIndividualResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class WayBillIndividualResponse  {
  @JsonProperty("labelIndividualResult")
  private LabelIndivResult labelIndividualResult = new LabelIndivResult();

  @JsonProperty("generatorSystems")
  private GeneratorSystems generatorSystems = new GeneratorSystems();

  public WayBillIndividualResponse labelIndividualResult(LabelIndivResult labelIndividualResult) {
    this.labelIndividualResult = labelIndividualResult;
    return this;
  }

  /**
   * Get labelIndividualResult
   * @return labelIndividualResult
   **/
  
    public LabelIndivResult getLabelIndividualResult() {
    return labelIndividualResult;
  }

  public void setLabelIndividualResult(LabelIndivResult labelIndividualResult) {
    this.labelIndividualResult = labelIndividualResult;
  }

  public WayBillIndividualResponse generatorSystems(GeneratorSystems generatorSystems) {
    this.generatorSystems = generatorSystems;
    return this;
  }

  /**
   * Get generatorSystems
   * @return generatorSystems
   **/
    public GeneratorSystems getGeneratorSystems() {
    return generatorSystems;
  }

  public void setGeneratorSystems(GeneratorSystems generatorSystems) {
    this.generatorSystems = generatorSystems;
  }


}
