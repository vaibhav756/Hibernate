package com.client;

import java.util.List;

import com.dao.impl.EmployeeDaoImpl;
import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		
		EmployeeDaoImpl impl=new EmployeeDaoImpl();
		
		Employee emp=new Employee();
		emp.setEmpId(102);
		emp.setEmpName("Amit Devkar");
		emp.setEmpSalary(8000.00);
		emp.setDeptNo(102);
		//impl.addEmployee(emp);
		
		//Employee empDetails = impl.fetchEmployeeById(101);
		//System.out.println(empDetails);
		
		//Get All Employees
		List<Object[]> nameAndSalary = impl.getNameAndSalary();
		for(Object[] obj:nameAndSalary)
		{
//			System.out.println(obj[0]+" - "+obj[1]);			
		}
		
	}

}
