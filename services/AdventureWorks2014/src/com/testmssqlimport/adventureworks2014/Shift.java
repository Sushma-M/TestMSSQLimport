/*\/**
 * Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 * This software is the confidential and proprietary information of wavemaker-com * You shall not disclose such Confidential Information and shall use it only in accordance
 * with the terms of the source code license agreement you entered into with wavemaker.com *\/*/

package com.testmssqlimport.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * Shift generated by hbm2java
 */
@Entity
@Table(name="`Shift`"
    ,schema="HumanResources"
)

public class Shift  implements java.io.Serializable {

    private byte shiftId;
    private String name;
    private Date startTime;
    private Date endTime;


@Type(type="DateTime")
    private LocalDateTime modifiedDate;
    private Set<EmployeeDepartmentHistory> employeeDepartmentHistories = new HashSet<EmployeeDepartmentHistory>(0);

    public Shift() {
    }


    @Id @GeneratedValue(strategy=IDENTITY)
    

    @Column(name="`ShiftID`", nullable=false)
    public byte getShiftId() {
        return this.shiftId;
    }
    
    public void setShiftId(byte shiftId) {
        this.shiftId = shiftId;
    }

    

    @Column(name="`Name`", nullable=false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Temporal(TemporalType.TIME)

    @Column(name="`StartTime`", nullable=false, length=16)
    public Date getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Temporal(TemporalType.TIME)

    @Column(name="`EndTime`", nullable=false, length=16)
    public Date getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    

    @Column(name="`ModifiedDate`", nullable=false, length=23)
    public LocalDateTime getModifiedDate() {
        return this.modifiedDate;
    }
    
    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="shift")
    public Set<EmployeeDepartmentHistory> getEmployeeDepartmentHistories() {
        return this.employeeDepartmentHistories;
    }
    
    public void setEmployeeDepartmentHistories(Set<EmployeeDepartmentHistory> employeeDepartmentHistories) {
        this.employeeDepartmentHistories = employeeDepartmentHistories;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof Shift) )
		    return false;

		 Shift that = (Shift) o;

		 return (this.getShiftId()==that.getShiftId());
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + this.getShiftId();

         return result;
    }


}

