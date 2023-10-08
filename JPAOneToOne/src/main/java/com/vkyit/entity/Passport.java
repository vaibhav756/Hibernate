package com.vkyit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passport")
public class Passport {
	
	@Id
	@Column(name="passport_no")
	private Integer passportNo;
	
	@Column(name="expiry_date")
	private LocalDate expDate;

	public Integer getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(Integer passportNo) {
		this.passportNo = passportNo;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", expDate=" + expDate + "]";
	}
}
