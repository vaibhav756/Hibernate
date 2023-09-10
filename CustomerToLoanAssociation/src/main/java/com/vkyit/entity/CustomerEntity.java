package com.vkyit.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class CustomerEntity {

	@Id
	@Column(name="customer_id")
	private Integer customerId;
	
	@Column(name="customer_name")
	private String customerName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id_fk",referencedColumnName="customer_id")
	private List<LoansEntity> listOfLoans;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<LoansEntity> getListOfLoans() {
		return listOfLoans;
	}

	public void setListOfLoans(List<LoansEntity> listOfLoans) {
		this.listOfLoans = listOfLoans;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", listOfLoans=" + listOfLoans
				+ "]";
	}
}
