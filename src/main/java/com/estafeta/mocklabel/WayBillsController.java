package com.estafeta.mocklabel;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class WayBillsController {
	
	  private final ObjectMapper objectMapper = new ObjectMapper();;
	
	  @RequestMapping(value = "/wayBills",
		        produces = { "application/json" }, 
		        consumes = { "application/json" }, 
		        method = RequestMethod.POST)
	public ResponseEntity<Object> createLabel(
			@RequestBody ApiRequest body,
			@RequestParam(value = "outputGroup", required = true, defaultValue="INDIVIDUAL") String outputGroup,
			@RequestParam(value = "responseMode", required = true, defaultValue="SYNC_INLINE") String responseMode,
			@RequestParam(value = "outputType", required = false, defaultValue="FILE_PDF") String outputType) {
	            try {
	            	
	            	if (outputGroup.equalsIgnoreCase("INDIVIDUAL")) {
	            		WayBillIndividualResponse res = new WayBillIndividualResponse();
	            		return new ResponseEntity<Object>(res, HttpStatus.CREATED);
					} else if(outputGroup.equalsIgnoreCase("ELEMENT")) {
						WayBillBlockResponse res = new WayBillBlockResponse();
						return new ResponseEntity<Object>(res, HttpStatus.CREATED);
					} else if(outputGroup.equalsIgnoreCase("REQUEST")) {
						WayBillPetitionResponse res = new WayBillPetitionResponse();
						return new ResponseEntity<Object>(res, HttpStatus.CREATED);
					} else {
						ErrorResponse res = new ErrorResponse();
						Error er = new Error();
						er.setCode(1);
						er.setDescription("Invalid outputGroup");
						res.add(er);
						return new ResponseEntity<Object>(res, HttpStatus.BAD_REQUEST);
					}
	            	
//	                return new ResponseEntity<Object>(objectMapper.readValue("\"\"", WayBillIndividualResponse.class), HttpStatus.CREATED);
	            } catch (Exception e) {
	                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
	            }
	    }
	  
	  @RequestMapping(value = "/",
		        method = RequestMethod.GET)
	public ResponseEntity<Object> getLabel(
			@RequestParam(value = "outputGroup", required = true, defaultValue="INDIVIDUAL") String outputGroup,
			@RequestParam(value = "responseMode", required = true, defaultValue="SYNC_INLINE") String responseMode,
			@RequestParam(value = "outputType", required = false, defaultValue="FILE_PDF") String outputType) {
	            try {
	                return new ResponseEntity<Object>(objectMapper.readValue("\"\"", WayBillIndividualResponse.class), HttpStatus.CREATED);
	            } catch (IOException e) {
	                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
	            }
	    }

}
