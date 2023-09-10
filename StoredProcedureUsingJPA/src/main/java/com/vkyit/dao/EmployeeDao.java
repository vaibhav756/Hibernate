package com.vkyit.dao;

import java.util.List;

import com.vkyit.entity.Employee;

public interface EmployeeDao {

	List<Employee> getAllEmployees();

	List<Employee> getEmployeeDatails(Integer empNo);
	
}
