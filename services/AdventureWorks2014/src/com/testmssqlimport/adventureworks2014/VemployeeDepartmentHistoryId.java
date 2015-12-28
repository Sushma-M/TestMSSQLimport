/*\/**
 * Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 * This software is the confidential and proprietary information of wavemaker-com * You shall not disclose such Confidential Information and shall use it only in accordance
 * with the terms of the source code license agreement you entered into with wavemaker.com *\/*/

package com.testmssqlimport.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;
import javax.persistence.Embeddable;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * VemployeeDepartmentHistoryId generated by hbm2java
 */
@Embeddable
public class VemployeeDepartmentHistoryId  implements java.io.Serializable {

    private Integer businessEntityId;
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private String shift;
    private String department;
    private String groupName;
    private Date startDate;
    private Date endDate;

    public VemployeeDepartmentHistoryId() {
    }


    public Integer getBusinessEntityId() {
        return this.businessEntityId;
    }
    
    public void setBusinessEntityId(Integer businessEntityId) {
        this.businessEntityId = businessEntityId;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return this.middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getSuffix() {
        return this.suffix;
    }
    
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    public String getShift() {
        return this.shift;
    }
    
    public void setShift(String shift) {
        this.shift = shift;
    }
    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getGroupName() {
        return this.groupName;
    }
    
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof VemployeeDepartmentHistoryId) )
		    return false;

		 VemployeeDepartmentHistoryId that = (VemployeeDepartmentHistoryId) o;

         return ( (this.getBusinessEntityId()==that.getBusinessEntityId()) || ( this.getBusinessEntityId()!=null && that.getBusinessEntityId()!=null && this.getBusinessEntityId().equals(that.getBusinessEntityId()) ) )
 && ( (this.getTitle()==that.getTitle()) || ( this.getTitle()!=null && that.getTitle()!=null && this.getTitle().equals(that.getTitle()) ) )
 && ( (this.getFirstName()==that.getFirstName()) || ( this.getFirstName()!=null && that.getFirstName()!=null && this.getFirstName().equals(that.getFirstName()) ) )
 && ( (this.getMiddleName()==that.getMiddleName()) || ( this.getMiddleName()!=null && that.getMiddleName()!=null && this.getMiddleName().equals(that.getMiddleName()) ) )
 && ( (this.getLastName()==that.getLastName()) || ( this.getLastName()!=null && that.getLastName()!=null && this.getLastName().equals(that.getLastName()) ) )
 && ( (this.getSuffix()==that.getSuffix()) || ( this.getSuffix()!=null && that.getSuffix()!=null && this.getSuffix().equals(that.getSuffix()) ) )
 && ( (this.getShift()==that.getShift()) || ( this.getShift()!=null && that.getShift()!=null && this.getShift().equals(that.getShift()) ) )
 && ( (this.getDepartment()==that.getDepartment()) || ( this.getDepartment()!=null && that.getDepartment()!=null && this.getDepartment().equals(that.getDepartment()) ) )
 && ( (this.getGroupName()==that.getGroupName()) || ( this.getGroupName()!=null && that.getGroupName()!=null && this.getGroupName().equals(that.getGroupName()) ) )
 && ( (this.getStartDate()==that.getStartDate()) || ( this.getStartDate()!=null && that.getStartDate()!=null && this.getStartDate().equals(that.getStartDate()) ) )
 && ( (this.getEndDate()==that.getEndDate()) || ( this.getEndDate()!=null && that.getEndDate()!=null && this.getEndDate().equals(that.getEndDate()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getBusinessEntityId() == null ? 0 : this.getBusinessEntityId().hashCode() );
         result = 37 * result + ( getTitle() == null ? 0 : this.getTitle().hashCode() );
         result = 37 * result + ( getFirstName() == null ? 0 : this.getFirstName().hashCode() );
         result = 37 * result + ( getMiddleName() == null ? 0 : this.getMiddleName().hashCode() );
         result = 37 * result + ( getLastName() == null ? 0 : this.getLastName().hashCode() );
         result = 37 * result + ( getSuffix() == null ? 0 : this.getSuffix().hashCode() );
         result = 37 * result + ( getShift() == null ? 0 : this.getShift().hashCode() );
         result = 37 * result + ( getDepartment() == null ? 0 : this.getDepartment().hashCode() );
         result = 37 * result + ( getGroupName() == null ? 0 : this.getGroupName().hashCode() );
         result = 37 * result + ( getStartDate() == null ? 0 : this.getStartDate().hashCode() );
         result = 37 * result + ( getEndDate() == null ? 0 : this.getEndDate().hashCode() );

         return result;
    }


}

