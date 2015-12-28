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
 * Service object for domain model class TableName.
 * @see com.testmssqlimport.adventureworks2014.TableName
 */

public interface TableNameService {
   /**
	 * Creates a new tablename.
	 * 
	 * @param created
	 *            The information of the created tablename.
	 * @return The created tablename.
	 */
	public TableName create(TableName created);

	/**
	 * Deletes a tablename.
	 * 
	 * @param tablenameId
	 *            The id of the deleted tablename.
	 * @return The deleted tablename.
	 * @throws EntityNotFoundException
	 *             if no tablename is found with the given id.
	 */
	public TableName delete(Integer tablenameId) throws EntityNotFoundException;

	/**
	 * Finds all tablenames.
	 * 
	 * @return A list of tablenames.
	 */
	public Page<TableName> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<TableName> findAll(Pageable pageable);
	
	/**
	 * Finds tablename by id.
	 * 
	 * @param id
	 *            The id of the wanted tablename.
	 * @return The found tablename. If no tablename is found, this method returns
	 *         null.
	 */
	public TableName findById(Integer id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a tablename.
	 * 
	 * @param updated
	 *            The information of the updated tablename.
	 * @return The updated tablename.
	 * @throws EntityNotFoundException
	 *             if no tablename is found with given id.
	 */
	public TableName update(TableName updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the tablenames in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the tablename.
	 */

	public long countAll();


    public Page<TableName> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

