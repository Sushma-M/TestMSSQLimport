/*\/**
 * Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 * This software is the confidential and proprietary information of wavemaker-com * You shall not disclose such Confidential Information and shall use it only in accordance
 * with the terms of the source code license agreement you entered into with wavemaker.com *\/*/

package com.testmssqlimport.testdb345.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.testmssqlimport.testdb345.service.Table1Service;


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

import com.testmssqlimport.testdb345.*;
import com.testmssqlimport.testdb345.service.*;


/**
 * Controller object for domain model class Table1.
 * @see com.testmssqlimport.testdb345.Table1
 */

@RestController(value = "Testdb345.Table1Controller")
@Api(value = "/testdb345/Table1", description = "Exposes APIs to work with Table1 resource.")
@RequestMapping("/testdb345/Table1")
public class Table1Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Table1Controller.class);

	@Autowired
	@Qualifier("testdb345.Table1Service")
	private Table1Service table1Service;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of Table1 instances matching the search criteria.")
	public Page<Table1> findTable1s( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering Table1s list");
		return table1Service.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of Table1 instances.")
	public Page<Table1> getTable1s(Pageable pageable) {
		LOGGER.debug("Rendering Table1s list");
		return table1Service.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of Table1 instances.")
	public Long countAllTable1s() {
		LOGGER.debug("counting Table1s");
		Long count = table1Service.countAll();
		return count;
	}


    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the Table1 instance associated with the given id.")
    public Table1 getTable1(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Table1 with id: {}" , id);
        Table1 instance = table1Service.findById(id);
        LOGGER.debug("Table1 details with id: {}" , instance);
        return instance;
    }
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the Table1 instance associated with the given id.")
    public boolean deleteTable1(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Table1 with id: {}" , id);
        Table1 deleted = table1Service.delete(id);
        return deleted != null;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the Table1 instance associated with the given id.")
    public Table1 editTable1(@PathVariable("id") Integer id, @RequestBody Table1 instance) throws EntityNotFoundException {
        LOGGER.debug("Editing Table1 with id: {}" , instance.getId());
        instance.setId(id);
        instance = table1Service.update(instance);
        LOGGER.debug("Table1 details with id: {}" , instance);
        return instance;
    }




	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new Table1 instance.")
	public Table1 createTable1(@RequestBody Table1 instance) {
		LOGGER.debug("Create Table1 with information: {}" , instance);
		instance = table1Service.create(instance);
		LOGGER.debug("Created Table1 with information: {}" , instance);
	    return instance;
	}

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setTable1Service(Table1Service service) {
		this.table1Service = service;
	}
}

