package com.vkyit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loans")
public class LoansEntity {

	@Id
	@Column(name="loan_id")
	private Integer loanId;
	
	@Column(name="loan_type")
	private String loanType;
	
	@Column(name="loan_amt")
	private Double loanAmt;

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

	@Override
	public String toString() {
		return "LoansEntity [loanId=" + loanId + ", loanType=" + loanType + ", loanAmt=" + loanAmt + "]";
	}
	
}
