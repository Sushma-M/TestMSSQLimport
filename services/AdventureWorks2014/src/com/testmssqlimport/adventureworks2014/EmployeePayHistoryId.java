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
 * EmployeePayHistoryId generated by hbm2java
 */
@Embeddable
public class EmployeePayHistoryId  implements java.io.Serializable {

    private Integer businessEntityId;


@Type(type="DateTime")
    private LocalDateTime rateChangeDate;

    public EmployeePayHistoryId() {
    }


    public Integer getBusinessEntityId() {
        return this.businessEntityId;
    }
    
    public void setBusinessEntityId(Integer businessEntityId) {
        this.businessEntityId = businessEntityId;
    }
    public LocalDateTime getRateChangeDate() {
        return this.rateChangeDate;
    }
    
    public void setRateChangeDate(LocalDateTime rateChangeDate) {
        this.rateChangeDate = rateChangeDate;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof EmployeePayHistoryId) )
		    return false;

		 EmployeePayHistoryId that = (EmployeePayHistoryId) o;

         return ( (this.getBusinessEntityId()==that.getBusinessEntityId()) || ( this.getBusinessEntityId()!=null && that.getBusinessEntityId()!=null && this.getBusinessEntityId().equals(that.getBusinessEntityId()) ) )
 && ( (this.getRateChangeDate()==that.getRateChangeDate()) || ( this.getRateChangeDate()!=null && that.getRateChangeDate()!=null && this.getRateChangeDate().equals(that.getRateChangeDate()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getBusinessEntityId() == null ? 0 : this.getBusinessEntityId().hashCode() );
         result = 37 * result + ( getRateChangeDate() == null ? 0 : this.getRateChangeDate().hashCode() );

         return result;
    }


}

