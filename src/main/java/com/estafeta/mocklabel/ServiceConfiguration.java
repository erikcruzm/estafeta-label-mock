package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * ServiceConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class ServiceConfiguration   {
  @JsonProperty("quantityOfLabels")
  private Integer quantityOfLabels = null;

  @JsonProperty("serviceTypeId")
  private String serviceTypeId = null;

  @JsonProperty("salesOrganization")
  private String salesOrganization = null;

  @JsonProperty("effectiveDate")
  private String effectiveDate = null;

  @JsonProperty("originZipCodeForRouting")
  private String originZipCodeForRouting = null;

  @JsonProperty("isReturnDocument")
  private Boolean isReturnDocument = null;

  @JsonProperty("returnDocument")
  private ReturnDocument returnDocument = null;

  @JsonProperty("isInsurance")
  private Boolean isInsurance = null;

  @JsonProperty("insurance")
  private Insurance insurance = null;

  public ServiceConfiguration quantityOfLabels(Integer quantityOfLabels) {
    this.quantityOfLabels = quantityOfLabels;
    return this;
  }

  
    public Integer getQuantityOfLabels() {
    return quantityOfLabels;
  }

  public void setQuantityOfLabels(Integer quantityOfLabels) {
    this.quantityOfLabels = quantityOfLabels;
  }

  public ServiceConfiguration serviceTypeId(String serviceTypeId) {
    this.serviceTypeId = serviceTypeId;
    return this;
  }

  
    public String getServiceTypeId() {
    return serviceTypeId;
  }

  public void setServiceTypeId(String serviceTypeId) {
    this.serviceTypeId = serviceTypeId;
  }

  public ServiceConfiguration salesOrganization(String salesOrganization) {
    this.salesOrganization = salesOrganization;
    return this;
  }

  
    public String getSalesOrganization() {
    return salesOrganization;
  }

  public void setSalesOrganization(String salesOrganization) {
    this.salesOrganization = salesOrganization;
  }

  public ServiceConfiguration effectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  
    public String getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public ServiceConfiguration originZipCodeForRouting(String originZipCodeForRouting) {
    this.originZipCodeForRouting = originZipCodeForRouting;
    return this;
  }

  
    public String getOriginZipCodeForRouting() {
    return originZipCodeForRouting;
  }

  public void setOriginZipCodeForRouting(String originZipCodeForRouting) {
    this.originZipCodeForRouting = originZipCodeForRouting;
  }

  public ServiceConfiguration isReturnDocument(Boolean isReturnDocument) {
    this.isReturnDocument = isReturnDocument;
    return this;
  }

  
    public Boolean isIsReturnDocument() {
    return isReturnDocument;
  }

  public void setIsReturnDocument(Boolean isReturnDocument) {
    this.isReturnDocument = isReturnDocument;
  }

  public ServiceConfiguration returnDocument(ReturnDocument returnDocument) {
    this.returnDocument = returnDocument;
    return this;
  }

    public ReturnDocument getReturnDocument() {
    return returnDocument;
  }

  public void setReturnDocument(ReturnDocument returnDocument) {
    this.returnDocument = returnDocument;
  }

  public ServiceConfiguration isInsurance(Boolean isInsurance) {
    this.isInsurance = isInsurance;
    return this;
  }

  
    public Boolean isIsInsurance() {
    return isInsurance;
  }

  public void setIsInsurance(Boolean isInsurance) {
    this.isInsurance = isInsurance;
  }

  public ServiceConfiguration insurance(Insurance insurance) {
    this.insurance = insurance;
    return this;
  }

    public Insurance getInsurance() {
    return insurance;
  }

  public void setInsurance(Insurance insurance) {
    this.insurance = insurance;
  }


}
