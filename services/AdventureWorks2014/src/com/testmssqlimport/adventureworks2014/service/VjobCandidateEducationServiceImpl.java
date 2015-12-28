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
 * ServiceImpl object for domain model class VjobCandidateEducation.
 * @see com.testmssqlimport.adventureworks2014.VjobCandidateEducation
 */
@Service("AdventureWorks2014.VjobCandidateEducationService")
public class VjobCandidateEducationServiceImpl implements VjobCandidateEducationService {


    private static final Logger LOGGER = LoggerFactory.getLogger(VjobCandidateEducationServiceImpl.class);

    @Autowired
    @Qualifier("AdventureWorks2014.VjobCandidateEducationDao")
    private WMGenericDao<VjobCandidateEducation, VjobCandidateEducationId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<VjobCandidateEducation, VjobCandidateEducationId> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
     public Page<VjobCandidateEducation> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "AdventureWorks2014TransactionManager")
    @Override
    public VjobCandidateEducation create(VjobCandidateEducation vjobcandidateeducation) {
        LOGGER.debug("Creating a new vjobcandidateeducation with information: {}" , vjobcandidateeducation);
        return this.wmGenericDao.create(vjobcandidateeducation);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AdventureWorks2014TransactionManager")
    @Override
    public VjobCandidateEducation delete(VjobCandidateEducationId vjobcandidateeducationId) throws EntityNotFoundException {
        LOGGER.debug("Deleting vjobcandidateeducation with id: {}" , vjobcandidateeducationId);
        VjobCandidateEducation deleted = this.wmGenericDao.findById(vjobcandidateeducationId);
        if (deleted == null) {
            LOGGER.debug("No vjobcandidateeducation found with id: {}" , vjobcandidateeducationId);
            throw new EntityNotFoundException(String.valueOf(vjobcandidateeducationId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public Page<VjobCandidateEducation> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all vjobcandidateeducations");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public Page<VjobCandidateEducation> findAll(Pageable pageable) {
        LOGGER.debug("Finding all vjobcandidateeducations");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public VjobCandidateEducation findById(VjobCandidateEducationId id) throws EntityNotFoundException {
        LOGGER.debug("Finding vjobcandidateeducation by id: {}" , id);
        VjobCandidateEducation vjobcandidateeducation=this.wmGenericDao.findById(id);
        if(vjobcandidateeducation==null){
            LOGGER.debug("No vjobcandidateeducation found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return vjobcandidateeducation;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AdventureWorks2014TransactionManager")
    @Override
    public VjobCandidateEducation update(VjobCandidateEducation updated) throws EntityNotFoundException {
        LOGGER.debug("Updating vjobcandidateeducation with information: {}" , updated);
        this.wmGenericDao.update(updated);

        VjobCandidateEducationId id = new VjobCandidateEducationId();
        id.setJobCandidateId(updated.getJobCandidateId());
        id.setEdu_level(updated.getEdu_level());
        id.setEdu_startDate(updated.getEdu_startDate());
        id.setEdu_endDate(updated.getEdu_endDate());
        id.setEdu_degree(updated.getEdu_degree());
        id.setEdu_major(updated.getEdu_major());
        id.setEdu_minor(updated.getEdu_minor());
        id.setEdu_gpa(updated.getEdu_gpa());
        id.setEdu_gpascale(updated.getEdu_gpascale());
        id.setEdu_school(updated.getEdu_school());
        id.setEdu_loc_countryRegion(updated.getEdu_loc_countryRegion());
        id.setEdu_loc_state(updated.getEdu_loc_state());
        id.setEdu_loc_city(updated.getEdu_loc_city());

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


