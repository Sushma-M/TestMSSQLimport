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
 * Service object for domain model class VjobCandidateEmployment.
 * @see com.testmssqlimport.adventureworks2014.VjobCandidateEmployment
 */

public interface VjobCandidateEmploymentService {
   /**
	 * Creates a new vjobcandidateemployment.
	 * 
	 * @param created
	 *            The information of the created vjobcandidateemployment.
	 * @return The created vjobcandidateemployment.
	 */
	public VjobCandidateEmployment create(VjobCandidateEmployment created);

	/**
	 * Deletes a vjobcandidateemployment.
	 * 
	 * @param vjobcandidateemploymentId
	 *            The id of the deleted vjobcandidateemployment.
	 * @return The deleted vjobcandidateemployment.
	 * @throws EntityNotFoundException
	 *             if no vjobcandidateemployment is found with the given id.
	 */
	public VjobCandidateEmployment delete(VjobCandidateEmploymentId vjobcandidateemploymentId) throws EntityNotFoundException;

	/**
	 * Finds all vjobcandidateemployments.
	 * 
	 * @return A list of vjobcandidateemployments.
	 */
	public Page<VjobCandidateEmployment> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<VjobCandidateEmployment> findAll(Pageable pageable);
	
	/**
	 * Finds vjobcandidateemployment by id.
	 * 
	 * @param id
	 *            The id of the wanted vjobcandidateemployment.
	 * @return The found vjobcandidateemployment. If no vjobcandidateemployment is found, this method returns
	 *         null.
	 */
	public VjobCandidateEmployment findById(VjobCandidateEmploymentId id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a vjobcandidateemployment.
	 * 
	 * @param updated
	 *            The information of the updated vjobcandidateemployment.
	 * @return The updated vjobcandidateemployment.
	 * @throws EntityNotFoundException
	 *             if no vjobcandidateemployment is found with given id.
	 */
	public VjobCandidateEmployment update(VjobCandidateEmployment updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the vjobcandidateemployments in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the vjobcandidateemployment.
	 */

	public long countAll();


    public Page<VjobCandidateEmployment> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

