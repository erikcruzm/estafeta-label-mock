package com.estafeta.mocklabel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;

/**
 * LabelPetitionResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-04T13:47:35.462Z[GMT]")


public class LabelPetitionResult   {
  @JsonProperty("elementsCount")
  private Integer elementsCount = null;

  @JsonProperty("elements")
  private List<ElementPetition> elements = new ArrayList<ElementPetition>();

  @JsonProperty("referenceNumber")
  private String referenceNumber = null;

  @JsonProperty("result")
  private Result result = new Result();

  public LabelPetitionResult elementsCount(Integer elementsCount) {
    this.elementsCount = elementsCount;
    return this;
  }

    public Integer getElementsCount() {
    return elementsCount;
  }

  public void setElementsCount(Integer elementsCount) {
    this.elementsCount = elementsCount;
  }

  public LabelPetitionResult elements(List<ElementPetition> elements) {
    this.elements = elements;
    return this;
  }

  public LabelPetitionResult addElementsItem(ElementPetition elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<ElementPetition>();
    }
    this.elements.add(elementsItem);
    return this;
  }

  /**
   * Get elements
   * @return elements
   **/
    public List<ElementPetition> getElements() {
    return elements;
  }

  public void setElements(List<ElementPetition> elements) {
    this.elements = elements;
  }

  public LabelPetitionResult referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  
    public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public LabelPetitionResult result(Result result) {
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
