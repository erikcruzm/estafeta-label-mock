package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * Contact
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class Contact   {
  @JsonProperty("corporateName")
  private String corporateName = null;

  @JsonProperty("contactName")
  private String contactName = null;

  @JsonProperty("cellPhone")
  private String cellPhone = null;

  @JsonProperty("telephone")
  private String telephone = null;

  @JsonProperty("phoneExt")
  private String phoneExt = null;

  @JsonProperty("email")
  private String email = null;

  public Contact corporateName(String corporateName) {
    this.corporateName = corporateName;
    return this;
  }

  
    public String getCorporateName() {
    return corporateName;
  }

  public void setCorporateName(String corporateName) {
    this.corporateName = corporateName;
  }

  public Contact contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

  /**
   * Get contactName
   * @return contactName
   **/
  
    public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public Contact cellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

  /**
   * Get cellPhone
   * @return cellPhone
   **/
  
    public String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public Contact telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

  /**
   * Get telephone
   * @return telephone
   **/
  
    public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public Contact phoneExt(String phoneExt) {
    this.phoneExt = phoneExt;
    return this;
  }

  /**
   * Get phoneExt
   * @return phoneExt
   **/
  
    public String getPhoneExt() {
    return phoneExt;
  }

  public void setPhoneExt(String phoneExt) {
    this.phoneExt = phoneExt;
  }

  public Contact email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


}
