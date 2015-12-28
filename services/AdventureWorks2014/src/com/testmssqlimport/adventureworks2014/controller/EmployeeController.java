/*\/**
 * Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 * This software is the confidential and proprietary information of wavemaker-com * You shall not disclose such Confidential Information and shall use it only in accordance
 * with the terms of the source code license agreement you entered into with wavemaker.com *\/*/

package com.testmssqlimport.adventureworks2014.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.testmssqlimport.adventureworks2014.service.EmployeeDepartmentHistoryService;
import com.testmssqlimport.adventureworks2014.service.EmployeePayHistoryService;
import com.testmssqlimport.adventureworks2014.service.EmployeeService;
import com.testmssqlimport.adventureworks2014.service.JobCandidateService;


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
 * Controller object for domain model class Employee.
 * @see com.testmssqlimport.adventureworks2014.Employee
 */

@RestController(value = "AdventureWorks2014.EmployeeController")
@Api(value = "/AdventureWorks2014/Employee", description = "Exposes APIs to work with Employee resource.")
@RequestMapping("/AdventureWorks2014/Employee")
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	@Qualifier("AdventureWorks2014.EmployeeService")
	private EmployeeService employeeService;


    @Autowired
    @Qualifier("AdventureWorks2014.JobCandidateService")
    private JobCandidateService jobCandidateService;


    @Autowired
    @Qualifier("AdventureWorks2014.EmployeePayHistoryService")
    private EmployeePayHistoryService employeePayHistoryService;


    @Autowired
    @Qualifier("AdventureWorks2014.EmployeeDepartmentHistoryService")
    private EmployeeDepartmentHistoryService employeeDepartmentHistoryService;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of Employee instances matching the search criteria.")
	public Page<Employee> findEmployees( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering Employees list");
		return employeeService.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of Employee instances.")
	public Page<Employee> getEmployees(Pageable pageable) {
		LOGGER.debug("Rendering Employees list");
		return employeeService.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of Employee instances.")
	public Long countAllEmployees() {
		LOGGER.debug("counting Employees");
		Long count = employeeService.countAll();
		return count;
	}


    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the Employee instance associated with the given id.")
    public Employee getEmployee(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Employee with id: {}" , id);
        Employee instance = employeeService.findById(id);
        LOGGER.debug("Employee details with id: {}" , instance);
        return instance;
    }
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the Employee instance associated with the given id.")
    public boolean deleteEmployee(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Employee with id: {}" , id);
        Employee deleted = employeeService.delete(id);
        return deleted != null;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the Employee instance associated with the given id.")
    public Employee editEmployee(@PathVariable("id") Integer id, @RequestBody Employee instance) throws EntityNotFoundException {
        LOGGER.debug("Editing Employee with id: {}" , instance.getBusinessEntityId());
        instance.setBusinessEntityId(id);
        instance = employeeService.update(instance);
        LOGGER.debug("Employee details with id: {}" , instance);
        return instance;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.POST, consumes = {"multipart/form-data"})
    @ApiOperation(value = "Updates the Employee instance associated with the given id.This API should be used when Employee instance fields that require multipart data.")
    public Employee editEmployee(@PathVariable("id") Integer id, MultipartHttpServletRequest multipartHttpServletRequest) throws EntityNotFoundException {
        Employee newemployee = WMMultipartUtils.toObject(multipartHttpServletRequest,Employee.class,"AdventureWorks2014");
        newemployee.setBusinessEntityId(id);
        Employee oldemployee = employeeService.findById(id);
        WMMultipartUtils.updateLobsContent(oldemployee,newemployee);
        LOGGER.debug("Updating employee with information: {}" , newemployee);
        return employeeService.update(newemployee);
    }
    @RequestMapping(value = "/{id}/content/{fieldName}", method = RequestMethod.GET, produces="application/octet-stream")
    @ApiOperation(value = "Retrieves content for the given BLOB field in Employee instance" )
    public DownloadResponse getEmployeeBLOBContent(@PathVariable("id") Integer id,@PathVariable("fieldName") String fieldName,HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @RequestParam( value="download", defaultValue = "false") boolean download) {
        LOGGER.debug("Retrieves content for the given BLOB field {} in Employee instance" , fieldName);
        if(!WMRuntimeUtils.isLob(Employee.class,fieldName)) {
            throw new TypeMismatchException("Given field " + fieldName + " is not a valid BLOB type");
        }
        Employee instance = employeeService.findById(id);
        return WMMultipartUtils.buildDownloadResponseForBlob(instance, fieldName, httpServletRequest, download);
    }

    @RequestMapping(value="/{id:.+}/employeePayHistories", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the employeePayHistories instance associated with the given id.")
     public Page<EmployeePayHistory> findAssociatedemployeePayHistories(Pageable pageable, @PathVariable("id") Integer id){
        LOGGER.debug("Fetching all associated employeePayHistories");
        return employeePayHistoryService.findAssociatedValues(id,"employee","businessEntityId", pageable);
   }

    @RequestMapping(value="/{id:.+}/jobCandidates", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the jobCandidates instance associated with the given id.")
     public Page<JobCandidate> findAssociatedjobCandidates(Pageable pageable, @PathVariable("id") Integer id){
        LOGGER.debug("Fetching all associated jobCandidates");
        return jobCandidateService.findAssociatedValues(id,"employee","businessEntityId", pageable);
   }

    @RequestMapping(value="/{id:.+}/employeeDepartmentHistories", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the employeeDepartmentHistories instance associated with the given id.")
     public Page<EmployeeDepartmentHistory> findAssociatedemployeeDepartmentHistories(Pageable pageable, @PathVariable("id") Integer id){
        LOGGER.debug("Fetching all associated employeeDepartmentHistories");
        return employeeDepartmentHistoryService.findAssociatedValues(id,"employee","businessEntityId", pageable);
   }



	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new Employee instance.")
	public Employee createEmployee(@RequestBody Employee instance) {
		LOGGER.debug("Create Employee with information: {}" , instance);
		instance = employeeService.create(instance);
		LOGGER.debug("Created Employee with information: {}" , instance);
	    return instance;
	}

	@RequestMapping(value = "/", method = RequestMethod.POST, consumes = {"multipart/form-data"})
	@ApiOperation(value = "Creates a new Employee instance.This API should be used when the Employee instance has fields that requires multipart data.")
    public Employee createEmployee(MultipartHttpServletRequest multipartHttpServletRequest) {
    	Employee employee = WMMultipartUtils.toObject(multipartHttpServletRequest,Employee.class,"AdventureWorks2014");
        LOGGER.debug("Creating a new employee with information: {}" , employee);
        return employeeService.create(employee);
    }

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setEmployeeService(EmployeeService service) {
		this.employeeService = service;
	}
}

