/*\/**
 * Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 * This software is the confidential and proprietary information of wavemaker-com * You shall not disclose such Confidential Information and shall use it only in accordance
 * with the terms of the source code license agreement you entered into with wavemaker.com *\/*/

package com.testmssqlimport.adventureworks2014.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.testmssqlimport.adventureworks2014.*;

/**
 * Service object for domain model class VemployeeDepartment.
 * @see com.testmssqlimport.adventureworks2014.VemployeeDepartment
 */

public interface VemployeeDepartmentService {
   /**
	 * Creates a new vemployeedepartment.
	 * 
	 * @param created
	 *            The information of the created vemployeedepartment.
	 * @return The created vemployeedepartment.
	 */
	public VemployeeDepartment create(VemployeeDepartment created);

	/**
	 * Deletes a vemployeedepartment.
	 * 
	 * @param vemployeedepartmentId
	 *            The id of the deleted vemployeedepartment.
	 * @return The deleted vemployeedepartment.
	 * @throws EntityNotFoundException
	 *             if no vemployeedepartment is found with the given id.
	 */
	public VemployeeDepartment delete(VemployeeDepartmentId vemployeedepartmentId) throws EntityNotFoundException;

	/**
	 * Finds all vemployeedepartments.
	 * 
	 * @return A list of vemployeedepartments.
	 */
	public Page<VemployeeDepartment> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<VemployeeDepartment> findAll(Pageable pageable);
	
	/**
	 * Finds vemployeedepartment by id.
	 * 
	 * @param id
	 *            The id of the wanted vemployeedepartment.
	 * @return The found vemployeedepartment. If no vemployeedepartment is found, this method returns
	 *         null.
	 */
	public VemployeeDepartment findById(VemployeeDepartmentId id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a vemployeedepartment.
	 * 
	 * @param updated
	 *            The information of the updated vemployeedepartment.
	 * @return The updated vemployeedepartment.
	 * @throws EntityNotFoundException
	 *             if no vemployeedepartment is found with given id.
	 */
	public VemployeeDepartment update(VemployeeDepartment updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the vemployeedepartments in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the vemployeedepartment.
	 */

	public long countAll();


    public Page<VemployeeDepartment> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

