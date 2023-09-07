package com.vkyit.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {

	@Id
	@Column(name="empno")
	private Integer empNumber;
	
	@Column(name="ename")
	private String empName;
	
	@Column(name="job")
	private String empJob;
	
	@Column(name="mgr")
	private Integer empManager;
	
	@Column(name="hiredate")
	private Date empHireDate;
	
	@Column(name="sal")
	private Integer empSal;
	
	@Column(name="comm")
	private Integer empComm;
	
	@Column(name="deptno")
	private Integer empDeptNo;

	public Integer getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(Integer empNumber) {
		this.empNumber = empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpJob() {
		return empJob;
	}

	public void setEmpJob(String empJob) {
		this.empJob = empJob;
	}

	public Integer getEmpManager() {
		return empManager;
	}

	public void setEmpManager(Integer empManager) {
		this.empManager = empManager;
	}

	public Date getEmpHireDate() {
		return empHireDate;
	}

	public void setEmpHireDate(Date empHireDate) {
		this.empHireDate = empHireDate;
	}

	public Integer getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Integer empSal) {
		this.empSal = empSal;
	}

	public Integer getEmpComm() {
		return empComm;
	}

	public void setEmpComm(Integer empComm) {
		this.empComm = empComm;
	}

	public Integer getEmpDeptNo() {
		return empDeptNo;
	}

	public void setEmpDeptNo(Integer empDeptNo) {
		this.empDeptNo = empDeptNo;
	}

	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", empName=" + empName + ", empJob=" + empJob + ", empManager="
				+ empManager + ", empHireDate=" + empHireDate + ", empSal=" + empSal + ", empComm=" + empComm
				+ ", empDeptNo=" + empDeptNo + "]";
	}

	
}
