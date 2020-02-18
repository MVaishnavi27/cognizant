package com;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name="contractemployee102")  
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
})  
public class Contract_Employee extends Employee{  
      
    @Column(name="pay_per_hour")  
    private float pay_per_hour;  
      
    @Column(name="contract_duration")  
    private String contract_duration;  
  
    public float getPay_per_hour() {  
        return pay_per_hour;  
    }  
    public void setPay_per_hour(float payPerHour) {  
        pay_per_hour = payPerHour;  
    }  
    public String getContract_duration() {  
        return contract_duration;  
    }  
    public void setContract_duration(String contractDuration) {  
        contract_duration = contractDuration;  
    }  
}