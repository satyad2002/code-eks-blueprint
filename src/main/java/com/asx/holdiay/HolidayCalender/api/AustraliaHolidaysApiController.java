package com.asx.holdiay.HolidayCalender.api;

import com.asx.holdiay.HolidayCalender.model.Holiday;
import com.asx.holdiay.HolidayCalender.repository.HolidayRepository;
import java.util.UUID;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-11-22T00:20:34.404919150Z[GMT]")
@RestController
public class AustraliaHolidaysApiController implements AustraliaHolidaysApi {

    private static final Logger log = LoggerFactory.getLogger(AustraliaHolidaysApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    @Autowired
	HolidayRepository holidayRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public AustraliaHolidaysApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Holiday>> getAustraliaHolidays(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="X-Request-ID", required=true) UUID xRequestID) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                List<Holiday> holidays = new ArrayList<Holiday>();

		
				holidayRepository.findAll().forEach(holidays::add);
		

			if (holidays.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(holidays, HttpStatus.OK);
               
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Holiday>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Holiday>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
