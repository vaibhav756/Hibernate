package com.vkyit.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="loans")
public class Loans implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="loan_id")
	private Integer loanId;
	
	@Column(name="loan_amt")
	private Double loanAmt;
	
	@Column(name="loan_type")
	private String loanType;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="customer_id_fk")
	private Customer customer;

	public Integer getLoanId() {
		return loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public Double getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(Double loanAmt) {
		this.loanAmt = loanAmt;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Loans [loanId=" + loanId + ", loanAmt=" + loanAmt + ", loanType=" + loanType + ", customer=" + customer
				+ "]";
	}
	
	
}
