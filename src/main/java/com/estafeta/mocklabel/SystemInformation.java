package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * SystemInformation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class SystemInformation   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("version")
  private String version = null;

  public SystemInformation id(String id) {
    this.id = id;
    return this;
  }

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SystemInformation name(String name) {
    this.name = name;
    return this;
  }

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SystemInformation version(String version) {
    this.version = version;
    return this;
  }

  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


}
