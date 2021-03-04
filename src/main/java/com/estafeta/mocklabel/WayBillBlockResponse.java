package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * WayBillBlockResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class WayBillBlockResponse  {
  @JsonProperty("labelBlockResult")
  private LabelBlockResult labelBlockResult = new LabelBlockResult();

  @JsonProperty("generatorSystems")
  private GeneratorSystems generatorSystems = new GeneratorSystems();

  public WayBillBlockResponse labelBlockResult(LabelBlockResult labelBlockResult) {
    this.labelBlockResult = labelBlockResult;
    return this;
  }

  /**
   * Get labelBlockResult
   * @return labelBlockResult
   **/
    public LabelBlockResult getLabelBlockResult() {
    return labelBlockResult;
  }

  public void setLabelBlockResult(LabelBlockResult labelBlockResult) {
    this.labelBlockResult = labelBlockResult;
  }

  public WayBillBlockResponse generatorSystems(GeneratorSystems generatorSystems) {
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
