/*\/**
 * Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 * This software is the confidential and proprietary information of wavemaker-com * You shall not disclose such Confidential Information and shall use it only in accordance
 * with the terms of the source code license agreement you entered into with wavemaker.com *\/*/

package com.testmssqlimport.adventureworks2014.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.testmssqlimport.adventureworks2014.service.VjobCandidateEducationService;
import org.joda.time.LocalDateTime;
import org.springframework.web.bind.annotation.RequestBody;


import java.io.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.TypeMismatchException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.util.WMMultipartUtils;
import com.wavemaker.runtime.util.WMRuntimeUtils;
import com.wavemaker.runtime.file.model.DownloadResponse;
import com.wordnik.swagger.annotations.*;

import com.testmssqlimport.adventureworks2014.*;
import com.testmssqlimport.adventureworks2014.service.*;


/**
 * Controller object for domain model class VjobCandidateEducation.
 * @see com.testmssqlimport.adventureworks2014.VjobCandidateEducation
 */

@RestController(value = "AdventureWorks2014.VjobCandidateEducationController")
@Api(value = "/AdventureWorks2014/VjobCandidateEducation", description = "Exposes APIs to work with VjobCandidateEducation resource.")
@RequestMapping("/AdventureWorks2014/VjobCandidateEducation")
public class VjobCandidateEducationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(VjobCandidateEducationController.class);

	@Autowired
	@Qualifier("AdventureWorks2014.VjobCandidateEducationService")
	private VjobCandidateEducationService vjobCandidateEducationService;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of VjobCandidateEducation instances matching the search criteria.")
	public Page<VjobCandidateEducation> findVjobCandidateEducations( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering VjobCandidateEducations list");
		return vjobCandidateEducationService.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of VjobCandidateEducation instances.")
	public Page<VjobCandidateEducation> getVjobCandidateEducations(Pageable pageable) {
		LOGGER.debug("Rendering VjobCandidateEducations list");
		return vjobCandidateEducationService.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of VjobCandidateEducation instances.")
	public Long countAllVjobCandidateEducations() {
		LOGGER.debug("counting VjobCandidateEducations");
		Long count = vjobCandidateEducationService.countAll();
		return count;
	}

	@RequestMapping(value = "/composite-id", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the VjobCandidateEducation instance associated with the given composite-id.")
	public VjobCandidateEducation getVjobCandidateEducation( @RequestParam("jobCandidateId") Integer jobCandidateId, @RequestParam("edu_level") String edu_level, @RequestParam("edu_startDate") LocalDateTime edu_startDate, @RequestParam("edu_endDate") LocalDateTime edu_endDate, @RequestParam("edu_degree") String edu_degree, @RequestParam("edu_major") String edu_major, @RequestParam("edu_minor") String edu_minor, @RequestParam("edu_gpa") String edu_gpa, @RequestParam("edu_gpascale") String edu_gpascale, @RequestParam("edu_school") String edu_school, @RequestParam("edu_loc_countryRegion") String edu_loc_countryRegion, @RequestParam("edu_loc_state") String edu_loc_state, @RequestParam("edu_loc_city") String edu_loc_city)
	 throws EntityNotFoundException {
	    VjobCandidateEducationId temp = new VjobCandidateEducationId();
	    temp.setJobCandidateId(jobCandidateId);
	    temp.setEdu_level(edu_level);
	    temp.setEdu_startDate(edu_startDate);
	    temp.setEdu_endDate(edu_endDate);
	    temp.setEdu_degree(edu_degree);
	    temp.setEdu_major(edu_major);
	    temp.setEdu_minor(edu_minor);
	    temp.setEdu_gpa(edu_gpa);
	    temp.setEdu_gpascale(edu_gpascale);
	    temp.setEdu_school(edu_school);
	    temp.setEdu_loc_countryRegion(edu_loc_countryRegion);
	    temp.setEdu_loc_state(edu_loc_state);
	    temp.setEdu_loc_city(edu_loc_city);
		LOGGER.debug("Getting VjobCandidateEducation with id: {}" , temp);
		VjobCandidateEducation instance = vjobCandidateEducationService.findById(temp);
		LOGGER.debug("VjobCandidateEducation details with id: {}" , instance);
		return instance;
	}
	@RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
	@ApiOperation(value = "Deletes the VjobCandidateEducation instance associated with the given composite-id.")
	public boolean deleteVjobCandidateEducation( @RequestParam("jobCandidateId") Integer jobCandidateId, @RequestParam("edu_level") String edu_level, @RequestParam("edu_startDate") LocalDateTime edu_startDate, @RequestParam("edu_endDate") LocalDateTime edu_endDate, @RequestParam("edu_degree") String edu_degree, @RequestParam("edu_major") String edu_major, @RequestParam("edu_minor") String edu_minor, @RequestParam("edu_gpa") String edu_gpa, @RequestParam("edu_gpascale") String edu_gpascale, @RequestParam("edu_school") String edu_school, @RequestParam("edu_loc_countryRegion") String edu_loc_countryRegion, @RequestParam("edu_loc_state") String edu_loc_state, @RequestParam("edu_loc_city") String edu_loc_city)throws EntityNotFoundException {
	    VjobCandidateEducationId temp = new VjobCandidateEducationId();
        temp.setJobCandidateId(jobCandidateId);
        temp.setEdu_level(edu_level);
        temp.setEdu_startDate(edu_startDate);
        temp.setEdu_endDate(edu_endDate);
        temp.setEdu_degree(edu_degree);
        temp.setEdu_major(edu_major);
        temp.setEdu_minor(edu_minor);
        temp.setEdu_gpa(edu_gpa);
        temp.setEdu_gpascale(edu_gpascale);
        temp.setEdu_school(edu_school);
        temp.setEdu_loc_countryRegion(edu_loc_countryRegion);
        temp.setEdu_loc_state(edu_loc_state);
        temp.setEdu_loc_city(edu_loc_city);
		LOGGER.debug("Deleting VjobCandidateEducation with id: {}" , temp);
		VjobCandidateEducation deleted = vjobCandidateEducationService.delete(temp);
		return deleted != null;
	}

	@RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
	@ApiOperation(value = "Updates the VjobCandidateEducation instance associated with the given composite-id.")
	public VjobCandidateEducation editVjobCandidateEducation( @RequestParam("jobCandidateId") Integer jobCandidateId, @RequestParam("edu_level") String edu_level, @RequestParam("edu_startDate") LocalDateTime edu_startDate, @RequestParam("edu_endDate") LocalDateTime edu_endDate, @RequestParam("edu_degree") String edu_degree, @RequestParam("edu_major") String edu_major, @RequestParam("edu_minor") String edu_minor, @RequestParam("edu_gpa") String edu_gpa, @RequestParam("edu_gpascale") String edu_gpascale, @RequestParam("edu_school") String edu_school, @RequestParam("edu_loc_countryRegion") String edu_loc_countryRegion, @RequestParam("edu_loc_state") String edu_loc_state, @RequestParam("edu_loc_city") String edu_loc_city, @RequestBody VjobCandidateEducation instance) throws EntityNotFoundException {
	    VjobCandidateEducationId temp = new VjobCandidateEducationId();
         temp.setJobCandidateId(jobCandidateId);
         temp.setEdu_level(edu_level);
         temp.setEdu_startDate(edu_startDate);
         temp.setEdu_endDate(edu_endDate);
         temp.setEdu_degree(edu_degree);
         temp.setEdu_major(edu_major);
         temp.setEdu_minor(edu_minor);
         temp.setEdu_gpa(edu_gpa);
         temp.setEdu_gpascale(edu_gpascale);
         temp.setEdu_school(edu_school);
         temp.setEdu_loc_countryRegion(edu_loc_countryRegion);
         temp.setEdu_loc_state(edu_loc_state);
         temp.setEdu_loc_city(edu_loc_city);
        vjobCandidateEducationService.delete(temp);
        instance = vjobCandidateEducationService.create(instance);
	    LOGGER.debug("VjobCandidateEducation details with id is updated: {}" , instance);
		return instance;
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new VjobCandidateEducation instance.")
	public VjobCandidateEducation createVjobCandidateEducation(@RequestBody VjobCandidateEducation instance) {
		LOGGER.debug("Create VjobCandidateEducation with information: {}" , instance);
		instance = vjobCandidateEducationService.create(instance);
		LOGGER.debug("Created VjobCandidateEducation with information: {}" , instance);
	    return instance;
	}

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setVjobCandidateEducationService(VjobCandidateEducationService service) {
		this.vjobCandidateEducationService = service;
	}
}

