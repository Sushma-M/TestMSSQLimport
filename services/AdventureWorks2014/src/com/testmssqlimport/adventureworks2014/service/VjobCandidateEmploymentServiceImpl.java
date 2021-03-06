/*\/**
 * Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 * This software is the confidential and proprietary information of wavemaker-com * You shall not disclose such Confidential Information and shall use it only in accordance
 * with the terms of the source code license agreement you entered into with wavemaker.com *\/*/

package com.testmssqlimport.adventureworks2014.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wavemaker.runtime.data.dao.*;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.testmssqlimport.adventureworks2014.*;


/**
 * ServiceImpl object for domain model class VjobCandidateEmployment.
 * @see com.testmssqlimport.adventureworks2014.VjobCandidateEmployment
 */
@Service("AdventureWorks2014.VjobCandidateEmploymentService")
public class VjobCandidateEmploymentServiceImpl implements VjobCandidateEmploymentService {


    private static final Logger LOGGER = LoggerFactory.getLogger(VjobCandidateEmploymentServiceImpl.class);

    @Autowired
    @Qualifier("AdventureWorks2014.VjobCandidateEmploymentDao")
    private WMGenericDao<VjobCandidateEmployment, VjobCandidateEmploymentId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<VjobCandidateEmployment, VjobCandidateEmploymentId> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
     public Page<VjobCandidateEmployment> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "AdventureWorks2014TransactionManager")
    @Override
    public VjobCandidateEmployment create(VjobCandidateEmployment vjobcandidateemployment) {
        LOGGER.debug("Creating a new vjobcandidateemployment with information: {}" , vjobcandidateemployment);
        return this.wmGenericDao.create(vjobcandidateemployment);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AdventureWorks2014TransactionManager")
    @Override
    public VjobCandidateEmployment delete(VjobCandidateEmploymentId vjobcandidateemploymentId) throws EntityNotFoundException {
        LOGGER.debug("Deleting vjobcandidateemployment with id: {}" , vjobcandidateemploymentId);
        VjobCandidateEmployment deleted = this.wmGenericDao.findById(vjobcandidateemploymentId);
        if (deleted == null) {
            LOGGER.debug("No vjobcandidateemployment found with id: {}" , vjobcandidateemploymentId);
            throw new EntityNotFoundException(String.valueOf(vjobcandidateemploymentId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public Page<VjobCandidateEmployment> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all vjobcandidateemployments");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public Page<VjobCandidateEmployment> findAll(Pageable pageable) {
        LOGGER.debug("Finding all vjobcandidateemployments");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public VjobCandidateEmployment findById(VjobCandidateEmploymentId id) throws EntityNotFoundException {
        LOGGER.debug("Finding vjobcandidateemployment by id: {}" , id);
        VjobCandidateEmployment vjobcandidateemployment=this.wmGenericDao.findById(id);
        if(vjobcandidateemployment==null){
            LOGGER.debug("No vjobcandidateemployment found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return vjobcandidateemployment;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AdventureWorks2014TransactionManager")
    @Override
    public VjobCandidateEmployment update(VjobCandidateEmployment updated) throws EntityNotFoundException {
        LOGGER.debug("Updating vjobcandidateemployment with information: {}" , updated);
        this.wmGenericDao.update(updated);

        VjobCandidateEmploymentId id = new VjobCandidateEmploymentId();
        id.setJobCandidateId(updated.getJobCandidateId());
        id.setEmp_startDate(updated.getEmp_startDate());
        id.setEmp_endDate(updated.getEmp_endDate());
        id.setEmp_orgName(updated.getEmp_orgName());
        id.setEmp_jobTitle(updated.getEmp_jobTitle());
        id.setEmp_responsibility(updated.getEmp_responsibility());
        id.setEmp_functionCategory(updated.getEmp_functionCategory());
        id.setEmp_industryCategory(updated.getEmp_industryCategory());
        id.setEmp_loc_countryRegion(updated.getEmp_loc_countryRegion());
        id.setEmp_loc_state(updated.getEmp_loc_state());
        id.setEmp_loc_city(updated.getEmp_loc_city());

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


