package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * Location
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class Location   {
  @JsonProperty("contact")
  private Contact contact = null;

  @JsonProperty("address")
  private Address address = null;

  public Location contact(Contact contact) {
    this.contact = contact;
    return this;
  }

    public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public Location address(Address address) {
    this.address = address;
    return this;
  }

    public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }


}
