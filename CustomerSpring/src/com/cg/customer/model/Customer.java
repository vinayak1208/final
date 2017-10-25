package com.cg.customer.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "Customer")
@NamedQueries({
@NamedQuery(name = "getAllCustomers", query = "SELECT cust FROM Customer cust"),
@NamedQuery(name = "getById", query = "SELECT cust FROM Customer cust where cust.customerId=:customerId"),
@NamedQuery(name="delById",query="delete  from Customer cust where cust.customerId=:customerId"),
@NamedQuery(name="getAllId",query="select cust.customerId from Customer cust")
})

public class Customer {
	@NotEmpty(message="required")
	@Pattern(regexp="[A-Z]{1}[A-Za-z]{2,}",message="name must contain at least 3 character")
	private String customerName;
	
	@NotEmpty(message="required")
	private String customerEmail;
	
	private Date customerDOB;
	@Id
	@NotNull
	@Column(name = "customerId")
	/*@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE2")
	@SequenceGenerator(name="SEQUENCE2", sequenceName="CUSTOMER_ID_SEQ", allocationSize=10)
	@Min(value=1,message="value cannot be less than 1")
	@Max(value=100,message="value cannot be more than 100")*/
    private int customerId;
	@Min(value = 10, message = "mobile number should be 10 digits")
    private int customerMobile;
    
	public Date getCustomerDOB() {
		return customerDOB;
	}
	public void setCustomerDOB(Date customerDOB) {
		this.customerDOB = customerDOB;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}


	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCustomerMobile() {
		return customerMobile;
	}
	public void setCustomerMobile(int customerMobile) {
		this.customerMobile = customerMobile;
	}
    
    
}
