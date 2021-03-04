package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;

/**
 * LabelBlockResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class LabelBlockResult   {
  @JsonProperty("data")
  private String data = null;

  @JsonProperty("elementsCount")
  private Integer elementsCount = null;

  @JsonProperty("elements")
  private List<ElementBlock> elements = new ArrayList<ElementBlock>();

  @JsonProperty("destinationAddress")
  private String destinationAddress = null;

  @JsonProperty("referenceNumber")
  private String referenceNumber = null;

  @JsonProperty("result")
  private Result result = new Result();

  public LabelBlockResult data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  
    public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public LabelBlockResult elementsCount(Integer elementsCount) {
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

  public LabelBlockResult elements(List<ElementBlock> elements) {
    this.elements = elements;
    return this;
  }

  public LabelBlockResult addElementsItem(ElementBlock elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<ElementBlock>();
    }
    this.elements.add(elementsItem);
    return this;
  }

  /**
   * Get elements
   * @return elements
   **/
    public List<ElementBlock> getElements() {
    return elements;
  }

  public void setElements(List<ElementBlock> elements) {
    this.elements = elements;
  }

  public LabelBlockResult destinationAddress(String destinationAddress) {
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

  public LabelBlockResult referenceNumber(String referenceNumber) {
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

  public LabelBlockResult result(Result result) {
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
