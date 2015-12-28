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
 * ServiceImpl object for domain model class VjobCandidate.
 * @see com.testmssqlimport.adventureworks2014.VjobCandidate
 */
@Service("AdventureWorks2014.VjobCandidateService")
public class VjobCandidateServiceImpl implements VjobCandidateService {


    private static final Logger LOGGER = LoggerFactory.getLogger(VjobCandidateServiceImpl.class);

    @Autowired
    @Qualifier("AdventureWorks2014.VjobCandidateDao")
    private WMGenericDao<VjobCandidate, VjobCandidateId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<VjobCandidate, VjobCandidateId> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
     public Page<VjobCandidate> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "AdventureWorks2014TransactionManager")
    @Override
    public VjobCandidate create(VjobCandidate vjobcandidate) {
        LOGGER.debug("Creating a new vjobcandidate with information: {}" , vjobcandidate);
        return this.wmGenericDao.create(vjobcandidate);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AdventureWorks2014TransactionManager")
    @Override
    public VjobCandidate delete(VjobCandidateId vjobcandidateId) throws EntityNotFoundException {
        LOGGER.debug("Deleting vjobcandidate with id: {}" , vjobcandidateId);
        VjobCandidate deleted = this.wmGenericDao.findById(vjobcandidateId);
        if (deleted == null) {
            LOGGER.debug("No vjobcandidate found with id: {}" , vjobcandidateId);
            throw new EntityNotFoundException(String.valueOf(vjobcandidateId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public Page<VjobCandidate> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all vjobcandidates");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public Page<VjobCandidate> findAll(Pageable pageable) {
        LOGGER.debug("Finding all vjobcandidates");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public VjobCandidate findById(VjobCandidateId id) throws EntityNotFoundException {
        LOGGER.debug("Finding vjobcandidate by id: {}" , id);
        VjobCandidate vjobcandidate=this.wmGenericDao.findById(id);
        if(vjobcandidate==null){
            LOGGER.debug("No vjobcandidate found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return vjobcandidate;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AdventureWorks2014TransactionManager")
    @Override
    public VjobCandidate update(VjobCandidate updated) throws EntityNotFoundException {
        LOGGER.debug("Updating vjobcandidate with information: {}" , updated);
        this.wmGenericDao.update(updated);

        VjobCandidateId id = new VjobCandidateId();
        id.setJobCandidateId(updated.getJobCandidateId());
        id.setBusinessEntityId(updated.getBusinessEntityId());
        id.setName_prefix(updated.getName_prefix());
        id.setName_first(updated.getName_first());
        id.setName_middle(updated.getName_middle());
        id.setName_last(updated.getName_last());
        id.setName_suffix(updated.getName_suffix());
        id.setSkills(updated.getSkills());
        id.setAddr_type(updated.getAddr_type());
        id.setAddr_loc_countryRegion(updated.getAddr_loc_countryRegion());
        id.setAddr_loc_state(updated.getAddr_loc_state());
        id.setAddr_loc_city(updated.getAddr_loc_city());
        id.setAddr_postalCode(updated.getAddr_postalCode());
        id.setEmail(updated.getEmail());
        id.setWebSite(updated.getWebSite());
        id.setModifiedDate(updated.getModifiedDate());

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


