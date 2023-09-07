package com.vkyit.main;

import java.util.List;

import com.vkyit.dao.EmployeeDao;
import com.vkyit.dao.impl.EmployeeDaoImpl;
import com.vkyit.entity.Employee;

public class ClientApp {

	public static void main(String[] args) {

		EmployeeDao dao=new EmployeeDaoImpl();
		List<Employee> allEmployees = dao.getAllEmployees();
		allEmployees.forEach(System.out::println);
		
	}

}
