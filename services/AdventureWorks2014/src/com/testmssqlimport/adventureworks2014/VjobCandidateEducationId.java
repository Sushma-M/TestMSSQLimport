/*\/**
 * Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 * This software is the confidential and proprietary information of wavemaker-com * You shall not disclose such Confidential Information and shall use it only in accordance
 * with the terms of the source code license agreement you entered into with wavemaker.com *\/*/

package com.testmssqlimport.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Embeddable;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * VjobCandidateEducationId generated by hbm2java
 */
@Embeddable
public class VjobCandidateEducationId  implements java.io.Serializable {

    private Integer jobCandidateId;
    private String edu_level;


@Type(type="DateTime")
    private LocalDateTime edu_startDate;


@Type(type="DateTime")
    private LocalDateTime edu_endDate;
    private String edu_degree;
    private String edu_major;
    private String edu_minor;
    private String edu_gpa;
    private String edu_gpascale;
    private String edu_school;
    private String edu_loc_countryRegion;
    private String edu_loc_state;
    private String edu_loc_city;

    public VjobCandidateEducationId() {
    }


    public Integer getJobCandidateId() {
        return this.jobCandidateId;
    }
    
    public void setJobCandidateId(Integer jobCandidateId) {
        this.jobCandidateId = jobCandidateId;
    }
    public String getEdu_level() {
        return this.edu_level;
    }
    
    public void setEdu_level(String edu_level) {
        this.edu_level = edu_level;
    }
    public LocalDateTime getEdu_startDate() {
        return this.edu_startDate;
    }
    
    public void setEdu_startDate(LocalDateTime edu_startDate) {
        this.edu_startDate = edu_startDate;
    }
    public LocalDateTime getEdu_endDate() {
        return this.edu_endDate;
    }
    
    public void setEdu_endDate(LocalDateTime edu_endDate) {
        this.edu_endDate = edu_endDate;
    }
    public String getEdu_degree() {
        return this.edu_degree;
    }
    
    public void setEdu_degree(String edu_degree) {
        this.edu_degree = edu_degree;
    }
    public String getEdu_major() {
        return this.edu_major;
    }
    
    public void setEdu_major(String edu_major) {
        this.edu_major = edu_major;
    }
    public String getEdu_minor() {
        return this.edu_minor;
    }
    
    public void setEdu_minor(String edu_minor) {
        this.edu_minor = edu_minor;
    }
    public String getEdu_gpa() {
        return this.edu_gpa;
    }
    
    public void setEdu_gpa(String edu_gpa) {
        this.edu_gpa = edu_gpa;
    }
    public String getEdu_gpascale() {
        return this.edu_gpascale;
    }
    
    public void setEdu_gpascale(String edu_gpascale) {
        this.edu_gpascale = edu_gpascale;
    }
    public String getEdu_school() {
        return this.edu_school;
    }
    
    public void setEdu_school(String edu_school) {
        this.edu_school = edu_school;
    }
    public String getEdu_loc_countryRegion() {
        return this.edu_loc_countryRegion;
    }
    
    public void setEdu_loc_countryRegion(String edu_loc_countryRegion) {
        this.edu_loc_countryRegion = edu_loc_countryRegion;
    }
    public String getEdu_loc_state() {
        return this.edu_loc_state;
    }
    
    public void setEdu_loc_state(String edu_loc_state) {
        this.edu_loc_state = edu_loc_state;
    }
    public String getEdu_loc_city() {
        return this.edu_loc_city;
    }
    
    public void setEdu_loc_city(String edu_loc_city) {
        this.edu_loc_city = edu_loc_city;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof VjobCandidateEducationId) )
		    return false;

		 VjobCandidateEducationId that = (VjobCandidateEducationId) o;

         return ( (this.getJobCandidateId()==that.getJobCandidateId()) || ( this.getJobCandidateId()!=null && that.getJobCandidateId()!=null && this.getJobCandidateId().equals(that.getJobCandidateId()) ) )
 && ( (this.getEdu_level()==that.getEdu_level()) || ( this.getEdu_level()!=null && that.getEdu_level()!=null && this.getEdu_level().equals(that.getEdu_level()) ) )
 && ( (this.getEdu_startDate()==that.getEdu_startDate()) || ( this.getEdu_startDate()!=null && that.getEdu_startDate()!=null && this.getEdu_startDate().equals(that.getEdu_startDate()) ) )
 && ( (this.getEdu_endDate()==that.getEdu_endDate()) || ( this.getEdu_endDate()!=null && that.getEdu_endDate()!=null && this.getEdu_endDate().equals(that.getEdu_endDate()) ) )
 && ( (this.getEdu_degree()==that.getEdu_degree()) || ( this.getEdu_degree()!=null && that.getEdu_degree()!=null && this.getEdu_degree().equals(that.getEdu_degree()) ) )
 && ( (this.getEdu_major()==that.getEdu_major()) || ( this.getEdu_major()!=null && that.getEdu_major()!=null && this.getEdu_major().equals(that.getEdu_major()) ) )
 && ( (this.getEdu_minor()==that.getEdu_minor()) || ( this.getEdu_minor()!=null && that.getEdu_minor()!=null && this.getEdu_minor().equals(that.getEdu_minor()) ) )
 && ( (this.getEdu_gpa()==that.getEdu_gpa()) || ( this.getEdu_gpa()!=null && that.getEdu_gpa()!=null && this.getEdu_gpa().equals(that.getEdu_gpa()) ) )
 && ( (this.getEdu_gpascale()==that.getEdu_gpascale()) || ( this.getEdu_gpascale()!=null && that.getEdu_gpascale()!=null && this.getEdu_gpascale().equals(that.getEdu_gpascale()) ) )
 && ( (this.getEdu_school()==that.getEdu_school()) || ( this.getEdu_school()!=null && that.getEdu_school()!=null && this.getEdu_school().equals(that.getEdu_school()) ) )
 && ( (this.getEdu_loc_countryRegion()==that.getEdu_loc_countryRegion()) || ( this.getEdu_loc_countryRegion()!=null && that.getEdu_loc_countryRegion()!=null && this.getEdu_loc_countryRegion().equals(that.getEdu_loc_countryRegion()) ) )
 && ( (this.getEdu_loc_state()==that.getEdu_loc_state()) || ( this.getEdu_loc_state()!=null && that.getEdu_loc_state()!=null && this.getEdu_loc_state().equals(that.getEdu_loc_state()) ) )
 && ( (this.getEdu_loc_city()==that.getEdu_loc_city()) || ( this.getEdu_loc_city()!=null && that.getEdu_loc_city()!=null && this.getEdu_loc_city().equals(that.getEdu_loc_city()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getJobCandidateId() == null ? 0 : this.getJobCandidateId().hashCode() );
         result = 37 * result + ( getEdu_level() == null ? 0 : this.getEdu_level().hashCode() );
         result = 37 * result + ( getEdu_startDate() == null ? 0 : this.getEdu_startDate().hashCode() );
         result = 37 * result + ( getEdu_endDate() == null ? 0 : this.getEdu_endDate().hashCode() );
         result = 37 * result + ( getEdu_degree() == null ? 0 : this.getEdu_degree().hashCode() );
         result = 37 * result + ( getEdu_major() == null ? 0 : this.getEdu_major().hashCode() );
         result = 37 * result + ( getEdu_minor() == null ? 0 : this.getEdu_minor().hashCode() );
         result = 37 * result + ( getEdu_gpa() == null ? 0 : this.getEdu_gpa().hashCode() );
         result = 37 * result + ( getEdu_gpascale() == null ? 0 : this.getEdu_gpascale().hashCode() );
         result = 37 * result + ( getEdu_school() == null ? 0 : this.getEdu_school().hashCode() );
         result = 37 * result + ( getEdu_loc_countryRegion() == null ? 0 : this.getEdu_loc_countryRegion().hashCode() );
         result = 37 * result + ( getEdu_loc_state() == null ? 0 : this.getEdu_loc_state().hashCode() );
         result = 37 * result + ( getEdu_loc_city() == null ? 0 : this.getEdu_loc_city().hashCode() );

         return result;
    }


}

