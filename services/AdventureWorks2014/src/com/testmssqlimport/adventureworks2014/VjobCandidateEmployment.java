/*\/**
 * Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 * This software is the confidential and proprietary information of wavemaker-com * You shall not disclose such Confidential Information and shall use it only in accordance
 * with the terms of the source code license agreement you entered into with wavemaker.com *\/*/

package com.testmssqlimport.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * VjobCandidateEmployment generated by hbm2java
 */
@Entity
@Table(name="`vJobCandidateEmployment`"
    ,schema="HumanResources"
)
@IdClass(value=VjobCandidateEmploymentId.class)
public class VjobCandidateEmployment  implements java.io.Serializable {

    private Integer jobCandidateId;


@Type(type="DateTime")
    private LocalDateTime emp_startDate;


@Type(type="DateTime")
    private LocalDateTime emp_endDate;
    private String emp_orgName;
    private String emp_jobTitle;
    private String emp_responsibility;
    private String emp_functionCategory;
    private String emp_industryCategory;
    private String emp_loc_countryRegion;
    private String emp_loc_state;
    private String emp_loc_city;

    public VjobCandidateEmployment() {
    }


    @Id 
    

    @Column(name="`JobCandidateID`", nullable=false, insertable=false, updatable=false)
    public Integer getJobCandidateId() {
        return this.jobCandidateId;
    }
    
    public void setJobCandidateId(Integer jobCandidateId) {
        this.jobCandidateId = jobCandidateId;
    }
    @Id 
    

    @Column(name="`Emp.StartDate`", insertable=false, updatable=false, length=23)
    public LocalDateTime getEmp_startDate() {
        return this.emp_startDate;
    }
    
    public void setEmp_startDate(LocalDateTime emp_startDate) {
        this.emp_startDate = emp_startDate;
    }
    @Id 
    

    @Column(name="`Emp.EndDate`", insertable=false, updatable=false, length=23)
    public LocalDateTime getEmp_endDate() {
        return this.emp_endDate;
    }
    
    public void setEmp_endDate(LocalDateTime emp_endDate) {
        this.emp_endDate = emp_endDate;
    }
    @Id 
    

    @Column(name="`Emp.OrgName`", insertable=false, updatable=false)
    public String getEmp_orgName() {
        return this.emp_orgName;
    }
    
    public void setEmp_orgName(String emp_orgName) {
        this.emp_orgName = emp_orgName;
    }
    @Id 
    

    @Column(name="`Emp.JobTitle`", insertable=false, updatable=false)
    public String getEmp_jobTitle() {
        return this.emp_jobTitle;
    }
    
    public void setEmp_jobTitle(String emp_jobTitle) {
        this.emp_jobTitle = emp_jobTitle;
    }
    @Id 
    

    @Column(name="`Emp.Responsibility`", insertable=false, updatable=false)
    public String getEmp_responsibility() {
        return this.emp_responsibility;
    }
    
    public void setEmp_responsibility(String emp_responsibility) {
        this.emp_responsibility = emp_responsibility;
    }
    @Id 
    

    @Column(name="`Emp.FunctionCategory`", insertable=false, updatable=false)
    public String getEmp_functionCategory() {
        return this.emp_functionCategory;
    }
    
    public void setEmp_functionCategory(String emp_functionCategory) {
        this.emp_functionCategory = emp_functionCategory;
    }
    @Id 
    

    @Column(name="`Emp.IndustryCategory`", insertable=false, updatable=false)
    public String getEmp_industryCategory() {
        return this.emp_industryCategory;
    }
    
    public void setEmp_industryCategory(String emp_industryCategory) {
        this.emp_industryCategory = emp_industryCategory;
    }
    @Id 
    

    @Column(name="`Emp.Loc.CountryRegion`", insertable=false, updatable=false)
    public String getEmp_loc_countryRegion() {
        return this.emp_loc_countryRegion;
    }
    
    public void setEmp_loc_countryRegion(String emp_loc_countryRegion) {
        this.emp_loc_countryRegion = emp_loc_countryRegion;
    }
    @Id 
    

    @Column(name="`Emp.Loc.State`", insertable=false, updatable=false)
    public String getEmp_loc_state() {
        return this.emp_loc_state;
    }
    
    public void setEmp_loc_state(String emp_loc_state) {
        this.emp_loc_state = emp_loc_state;
    }
    @Id 
    

    @Column(name="`Emp.Loc.City`", insertable=false, updatable=false)
    public String getEmp_loc_city() {
        return this.emp_loc_city;
    }
    
    public void setEmp_loc_city(String emp_loc_city) {
        this.emp_loc_city = emp_loc_city;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof VjobCandidateEmployment) )
		    return false;

		 VjobCandidateEmployment that = (VjobCandidateEmployment) o;

         return ( (this.getJobCandidateId()==that.getJobCandidateId()) || ( this.getJobCandidateId()!=null && that.getJobCandidateId()!=null && this.getJobCandidateId().equals(that.getJobCandidateId()) ) )
 && ( (this.getEmp_startDate()==that.getEmp_startDate()) || ( this.getEmp_startDate()!=null && that.getEmp_startDate()!=null && this.getEmp_startDate().equals(that.getEmp_startDate()) ) )
 && ( (this.getEmp_endDate()==that.getEmp_endDate()) || ( this.getEmp_endDate()!=null && that.getEmp_endDate()!=null && this.getEmp_endDate().equals(that.getEmp_endDate()) ) )
 && ( (this.getEmp_orgName()==that.getEmp_orgName()) || ( this.getEmp_orgName()!=null && that.getEmp_orgName()!=null && this.getEmp_orgName().equals(that.getEmp_orgName()) ) )
 && ( (this.getEmp_jobTitle()==that.getEmp_jobTitle()) || ( this.getEmp_jobTitle()!=null && that.getEmp_jobTitle()!=null && this.getEmp_jobTitle().equals(that.getEmp_jobTitle()) ) )
 && ( (this.getEmp_responsibility()==that.getEmp_responsibility()) || ( this.getEmp_responsibility()!=null && that.getEmp_responsibility()!=null && this.getEmp_responsibility().equals(that.getEmp_responsibility()) ) )
 && ( (this.getEmp_functionCategory()==that.getEmp_functionCategory()) || ( this.getEmp_functionCategory()!=null && that.getEmp_functionCategory()!=null && this.getEmp_functionCategory().equals(that.getEmp_functionCategory()) ) )
 && ( (this.getEmp_industryCategory()==that.getEmp_industryCategory()) || ( this.getEmp_industryCategory()!=null && that.getEmp_industryCategory()!=null && this.getEmp_industryCategory().equals(that.getEmp_industryCategory()) ) )
 && ( (this.getEmp_loc_countryRegion()==that.getEmp_loc_countryRegion()) || ( this.getEmp_loc_countryRegion()!=null && that.getEmp_loc_countryRegion()!=null && this.getEmp_loc_countryRegion().equals(that.getEmp_loc_countryRegion()) ) )
 && ( (this.getEmp_loc_state()==that.getEmp_loc_state()) || ( this.getEmp_loc_state()!=null && that.getEmp_loc_state()!=null && this.getEmp_loc_state().equals(that.getEmp_loc_state()) ) )
 && ( (this.getEmp_loc_city()==that.getEmp_loc_city()) || ( this.getEmp_loc_city()!=null && that.getEmp_loc_city()!=null && this.getEmp_loc_city().equals(that.getEmp_loc_city()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getJobCandidateId() == null ? 0 : this.getJobCandidateId().hashCode() );
         result = 37 * result + ( getEmp_startDate() == null ? 0 : this.getEmp_startDate().hashCode() );
         result = 37 * result + ( getEmp_endDate() == null ? 0 : this.getEmp_endDate().hashCode() );
         result = 37 * result + ( getEmp_orgName() == null ? 0 : this.getEmp_orgName().hashCode() );
         result = 37 * result + ( getEmp_jobTitle() == null ? 0 : this.getEmp_jobTitle().hashCode() );
         result = 37 * result + ( getEmp_responsibility() == null ? 0 : this.getEmp_responsibility().hashCode() );
         result = 37 * result + ( getEmp_functionCategory() == null ? 0 : this.getEmp_functionCategory().hashCode() );
         result = 37 * result + ( getEmp_industryCategory() == null ? 0 : this.getEmp_industryCategory().hashCode() );
         result = 37 * result + ( getEmp_loc_countryRegion() == null ? 0 : this.getEmp_loc_countryRegion().hashCode() );
         result = 37 * result + ( getEmp_loc_state() == null ? 0 : this.getEmp_loc_state().hashCode() );
         result = 37 * result + ( getEmp_loc_city() == null ? 0 : this.getEmp_loc_city().hashCode() );

         return result;
    }


}
