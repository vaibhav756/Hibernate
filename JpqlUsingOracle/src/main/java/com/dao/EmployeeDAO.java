package com.dao;

import java.util.List;

import com.entity.Employee;

public interface EmployeeDAO {

	Employee fetchEmployeeById(Integer empId);
	void addEmployee(Employee emp);
	List<Employee> getAllEmployees();
	List<Object[]> getNameAndSalary();
	
}
