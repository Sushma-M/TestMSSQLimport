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
 * Service object for domain model class Department.
 * @see com.testmssqlimport.adventureworks2014.Department
 */

public interface DepartmentService {
   /**
	 * Creates a new department.
	 * 
	 * @param created
	 *            The information of the created department.
	 * @return The created department.
	 */
	public Department create(Department created);

	/**
	 * Deletes a department.
	 * 
	 * @param departmentId
	 *            The id of the deleted department.
	 * @return The deleted department.
	 * @throws EntityNotFoundException
	 *             if no department is found with the given id.
	 */
	public Department delete(Short departmentId) throws EntityNotFoundException;

	/**
	 * Finds all departments.
	 * 
	 * @return A list of departments.
	 */
	public Page<Department> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Department> findAll(Pageable pageable);
	
	/**
	 * Finds department by id.
	 * 
	 * @param id
	 *            The id of the wanted department.
	 * @return The found department. If no department is found, this method returns
	 *         null.
	 */
	public Department findById(Short id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a department.
	 * 
	 * @param updated
	 *            The information of the updated department.
	 * @return The updated department.
	 * @throws EntityNotFoundException
	 *             if no department is found with given id.
	 */
	public Department update(Department updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the departments in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the department.
	 */

	public long countAll();


    public Page<Department> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

