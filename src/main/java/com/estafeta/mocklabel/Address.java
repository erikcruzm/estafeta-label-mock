package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;

/**
 * Address
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class Address   {
  @JsonProperty("roadTypeCode")
  private String roadTypeCode = null;

  @JsonProperty("roadName")
  private String roadName = null;

  @JsonProperty("townshipCode")
  private String townshipCode = null;

  @JsonProperty("settlementTypeCode")
  private String settlementTypeCode = null;

  @JsonProperty("settlementName")
  private String settlementName = null;

  @JsonProperty("stateCode")
  private String stateCode = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("addressReference")
  private String addressReference = null;

  @JsonProperty("betweenRoadName1")
  private String betweenRoadName1 = null;

  @JsonProperty("betweenRoadName2")
  private String betweenRoadName2 = null;

  @JsonProperty("latitude")
  private BigDecimal latitude = null;

  @JsonProperty("longitude")
  private BigDecimal longitude = null;

  @JsonProperty("externalNum")
  private String externalNum = null;

  @JsonProperty("indoorInformation")
  private String indoorInformation = null;

  @JsonProperty("nave")
  private String nave = null;

  @JsonProperty("platform")
  private String platform = null;

  public Address roadTypeCode(String roadTypeCode) {
    this.roadTypeCode = roadTypeCode;
    return this;
  }

  /**
   * Get roadTypeCode
   * @return roadTypeCode
   **/
  
    public String getRoadTypeCode() {
    return roadTypeCode;
  }

  public void setRoadTypeCode(String roadTypeCode) {
    this.roadTypeCode = roadTypeCode;
  }

  public Address roadName(String roadName) {
    this.roadName = roadName;
    return this;
  }

  /**
   * Get roadName
   * @return roadName
   **/
  
    public String getRoadName() {
    return roadName;
  }

  public void setRoadName(String roadName) {
    this.roadName = roadName;
  }

  public Address townshipCode(String townshipCode) {
    this.townshipCode = townshipCode;
    return this;
  }

  /**
   * Get townshipCode
   * @return townshipCode
   **/
  
    public String getTownshipCode() {
    return townshipCode;
  }

  public void setTownshipCode(String townshipCode) {
    this.townshipCode = townshipCode;
  }

  public Address settlementTypeCode(String settlementTypeCode) {
    this.settlementTypeCode = settlementTypeCode;
    return this;
  }

  /**
   * Get settlementTypeCode
   * @return settlementTypeCode
   **/
  
    public String getSettlementTypeCode() {
    return settlementTypeCode;
  }

  public void setSettlementTypeCode(String settlementTypeCode) {
    this.settlementTypeCode = settlementTypeCode;
  }

  public Address settlementName(String settlementName) {
    this.settlementName = settlementName;
    return this;
  }

  /**
   * Get settlementName
   * @return settlementName
   **/
  
    public String getSettlementName() {
    return settlementName;
  }

  public void setSettlementName(String settlementName) {
    this.settlementName = settlementName;
  }

  public Address stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

  /**
   * Get stateCode
   * @return stateCode
   **/
  
    public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public Address zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Get zipCode
   * @return zipCode
   **/
  
    public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public Address countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
   **/
  
    public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Address addressReference(String addressReference) {
    this.addressReference = addressReference;
    return this;
  }

  /**
   * Get addressReference
   * @return addressReference
   **/
  
    public String getAddressReference() {
    return addressReference;
  }

  public void setAddressReference(String addressReference) {
    this.addressReference = addressReference;
  }

  public Address betweenRoadName1(String betweenRoadName1) {
    this.betweenRoadName1 = betweenRoadName1;
    return this;
  }

  /**
   * Get betweenRoadName1
   * @return betweenRoadName1
   **/
  
    public String getBetweenRoadName1() {
    return betweenRoadName1;
  }

  public void setBetweenRoadName1(String betweenRoadName1) {
    this.betweenRoadName1 = betweenRoadName1;
  }

  public Address betweenRoadName2(String betweenRoadName2) {
    this.betweenRoadName2 = betweenRoadName2;
    return this;
  }

  /**
   * Get betweenRoadName2
   * @return betweenRoadName2
   **/
  
    public String getBetweenRoadName2() {
    return betweenRoadName2;
  }

  public void setBetweenRoadName2(String betweenRoadName2) {
    this.betweenRoadName2 = betweenRoadName2;
  }

  public Address latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   **/
  
    public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public Address longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   **/
  
    public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public Address externalNum(String externalNum) {
    this.externalNum = externalNum;
    return this;
  }

  /**
   * Get externalNum
   * @return externalNum
   **/
  
    public String getExternalNum() {
    return externalNum;
  }

  public void setExternalNum(String externalNum) {
    this.externalNum = externalNum;
  }

  public Address indoorInformation(String indoorInformation) {
    this.indoorInformation = indoorInformation;
    return this;
  }

  /**
   * Get indoorInformation
   * @return indoorInformation
   **/
  
    public String getIndoorInformation() {
    return indoorInformation;
  }

  public void setIndoorInformation(String indoorInformation) {
    this.indoorInformation = indoorInformation;
  }

  public Address nave(String nave) {
    this.nave = nave;
    return this;
  }

  /**
   * Get nave
   * @return nave
   **/
  
    public String getNave() {
    return nave;
  }

  public void setNave(String nave) {
    this.nave = nave;
  }

  public Address platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
   **/
  
    public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }


}
