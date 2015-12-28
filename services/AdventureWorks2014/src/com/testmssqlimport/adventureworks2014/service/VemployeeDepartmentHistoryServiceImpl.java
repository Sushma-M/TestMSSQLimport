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
 * ServiceImpl object for domain model class VemployeeDepartmentHistory.
 * @see com.testmssqlimport.adventureworks2014.VemployeeDepartmentHistory
 */
@Service("AdventureWorks2014.VemployeeDepartmentHistoryService")
public class VemployeeDepartmentHistoryServiceImpl implements VemployeeDepartmentHistoryService {


    private static final Logger LOGGER = LoggerFactory.getLogger(VemployeeDepartmentHistoryServiceImpl.class);

    @Autowired
    @Qualifier("AdventureWorks2014.VemployeeDepartmentHistoryDao")
    private WMGenericDao<VemployeeDepartmentHistory, VemployeeDepartmentHistoryId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<VemployeeDepartmentHistory, VemployeeDepartmentHistoryId> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
     public Page<VemployeeDepartmentHistory> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "AdventureWorks2014TransactionManager")
    @Override
    public VemployeeDepartmentHistory create(VemployeeDepartmentHistory vemployeedepartmenthistory) {
        LOGGER.debug("Creating a new vemployeedepartmenthistory with information: {}" , vemployeedepartmenthistory);
        return this.wmGenericDao.create(vemployeedepartmenthistory);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AdventureWorks2014TransactionManager")
    @Override
    public VemployeeDepartmentHistory delete(VemployeeDepartmentHistoryId vemployeedepartmenthistoryId) throws EntityNotFoundException {
        LOGGER.debug("Deleting vemployeedepartmenthistory with id: {}" , vemployeedepartmenthistoryId);
        VemployeeDepartmentHistory deleted = this.wmGenericDao.findById(vemployeedepartmenthistoryId);
        if (deleted == null) {
            LOGGER.debug("No vemployeedepartmenthistory found with id: {}" , vemployeedepartmenthistoryId);
            throw new EntityNotFoundException(String.valueOf(vemployeedepartmenthistoryId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public Page<VemployeeDepartmentHistory> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all vemployeedepartmenthistorys");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public Page<VemployeeDepartmentHistory> findAll(Pageable pageable) {
        LOGGER.debug("Finding all vemployeedepartmenthistorys");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public VemployeeDepartmentHistory findById(VemployeeDepartmentHistoryId id) throws EntityNotFoundException {
        LOGGER.debug("Finding vemployeedepartmenthistory by id: {}" , id);
        VemployeeDepartmentHistory vemployeedepartmenthistory=this.wmGenericDao.findById(id);
        if(vemployeedepartmenthistory==null){
            LOGGER.debug("No vemployeedepartmenthistory found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return vemployeedepartmenthistory;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AdventureWorks2014TransactionManager")
    @Override
    public VemployeeDepartmentHistory update(VemployeeDepartmentHistory updated) throws EntityNotFoundException {
        LOGGER.debug("Updating vemployeedepartmenthistory with information: {}" , updated);
        this.wmGenericDao.update(updated);

        VemployeeDepartmentHistoryId id = new VemployeeDepartmentHistoryId();
        id.setBusinessEntityId(updated.getBusinessEntityId());
        id.setTitle(updated.getTitle());
        id.setFirstName(updated.getFirstName());
        id.setMiddleName(updated.getMiddleName());
        id.setLastName(updated.getLastName());
        id.setSuffix(updated.getSuffix());
        id.setShift(updated.getShift());
        id.setDepartment(updated.getDepartment());
        id.setGroupName(updated.getGroupName());
        id.setStartDate(updated.getStartDate());
        id.setEndDate(updated.getEndDate());

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


