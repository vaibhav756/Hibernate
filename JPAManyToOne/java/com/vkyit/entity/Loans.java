package com.vkyit.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="loans")
public class Loans {

	@Id
	@Column(name="loan_id")
	private Integer loanId;
	
	@Column(name="loan_type")
	private String loanType;
	
	@Column(name="loan_amt")
	private Double loanAmt;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id_fk")
	private Customer customer;

	public Integer getLoanId() {
		return loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Double getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(Double loanAmt) {
		this.loanAmt = loanAmt;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Loans [loanId=" + loanId + ", loanType=" + loanType + ", loanAmt=" + loanAmt + ", customer=" + customer
				+ "]";
	}
	
}
