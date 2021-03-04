package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * LocationLabel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class LocationLabel   {
  @JsonProperty("isDRAAlternative")
  private Boolean isDRAAlternative = null;

  @JsonProperty("DRAAlternative")
  private Location drAAlternative = null;

  @JsonProperty("origin")
  private Location origin = null;

  @JsonProperty("destination")
  private Destination destination = null;

  public LocationLabel isDRAAlternative(Boolean isDRAAlternative) {
    this.isDRAAlternative = isDRAAlternative;
    return this;
  }

  
    public Boolean isIsDRAAlternative() {
    return isDRAAlternative;
  }

  public void setIsDRAAlternative(Boolean isDRAAlternative) {
    this.isDRAAlternative = isDRAAlternative;
  }

  public LocationLabel drAAlternative(Location drAAlternative) {
    this.drAAlternative = drAAlternative;
    return this;
  }

    public Location getDrAAlternative() {
    return drAAlternative;
  }

  public void setDrAAlternative(Location drAAlternative) {
    this.drAAlternative = drAAlternative;
  }

  public LocationLabel origin(Location origin) {
    this.origin = origin;
    return this;
  }

    public Location getOrigin() {
    return origin;
  }

  public void setOrigin(Location origin) {
    this.origin = origin;
  }

  public LocationLabel destination(Destination destination) {
    this.destination = destination;
    return this;
  }
    public Destination getDestination() {
    return destination;
  }

  public void setDestination(Destination destination) {
    this.destination = destination;
  }


}
