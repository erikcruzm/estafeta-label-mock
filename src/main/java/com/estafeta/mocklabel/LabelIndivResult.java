package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;

/**
 * LabelIndivResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class LabelIndivResult   {
  @JsonProperty("elementsCount")
  private Integer elementsCount = null;

  @JsonProperty("elements")
  private List<ElementIndividual> elements = new ArrayList<ElementIndividual>();

  @JsonProperty("destinationAddress")
  private String destinationAddress = null;

  @JsonProperty("referenceNumber")
  private String referenceNumber = null;

  @JsonProperty("result")
  private Result result = new Result();

  public LabelIndivResult elementsCount(Integer elementsCount) {
    this.elementsCount = elementsCount;
    return this;
  }

  /**
   * Get elementsCount
   * @return elementsCount
   **/
  
    public Integer getElementsCount() {
    return elementsCount;
  }

  public void setElementsCount(Integer elementsCount) {
    this.elementsCount = elementsCount;
  }

  public LabelIndivResult elements(List<ElementIndividual> elements) {
    this.elements = elements;
    return this;
  }

  public LabelIndivResult addElementsItem(ElementIndividual elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<ElementIndividual>();
    }
    this.elements.add(elementsItem);
    return this;
  }

  /**
   * Get elements
   * @return elements
   **/
    public List<ElementIndividual> getElements() {
    return elements;
  }

  public void setElements(List<ElementIndividual> elements) {
    this.elements = elements;
  }

  public LabelIndivResult destinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
    return this;
  }

  /**
   * Get destinationAddress
   * @return destinationAddress
   **/
  
    public String getDestinationAddress() {
    return destinationAddress;
  }

  public void setDestinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  public LabelIndivResult referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * Get referenceNumber
   * @return referenceNumber
   **/
  
    public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public LabelIndivResult result(Result result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   **/
    public Result getResult() {
    return result;
  }

  public void setResult(Result result) {
    this.result = result;
  }


}
