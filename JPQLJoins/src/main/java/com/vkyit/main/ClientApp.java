package com.vkyit.main;

import java.util.Arrays;

import com.vkyit.dao.DepartmentDao;
import com.vkyit.dao.impl.DepartmentDaoImpl;
import com.vkyit.entity.Department;
import com.vkyit.entity.Employee;

public class ClientApp {

	public static void main(String[] args) {

		DepartmentDao dao=new DepartmentDaoImpl();
		Department dept=new Department();
		dept.setDepartmentNo(101);
		dept.setDepartmentName("Development");
		
		Employee emp1=new Employee();
		emp1.setEmployeeNo(10101);
		emp1.setEmployeeName("Vaibhav Yadav");
		
		Employee emp2=new Employee();
		emp2.setEmployeeNo(10102);
		emp2.setEmployeeName("Vikram Matal");
		
		Employee emp3=new Employee();
		emp3.setEmployeeNo(10103);
		emp3.setEmployeeName("Piyush Modokar");
		
		dept.setListOfEmployees(Arrays.asList(emp1,emp2,emp3));
		dao.addDepartment(dept);
		
	}

}
