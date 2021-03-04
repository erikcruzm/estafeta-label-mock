package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * GeneratorSystems
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class GeneratorSystems   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("releasedDate")
  private String releasedDate = null;

  @JsonProperty("Versión")
  private String versin = null;

  public GeneratorSystems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GeneratorSystems releasedDate(String releasedDate) {
    this.releasedDate = releasedDate;
    return this;
  }

  /**
   * Get releasedDate
   * @return releasedDate
   **/
  
    public String getReleasedDate() {
    return releasedDate;
  }

  public void setReleasedDate(String releasedDate) {
    this.releasedDate = releasedDate;
  }

  public GeneratorSystems versin(String versin) {
    this.versin = versin;
    return this;
  }

  /**
   * Get versin
   * @return versin
   **/
  
    public String getVersin() {
    return versin;
  }

  public void setVersin(String versin) {
    this.versin = versin;
  }


}
