package com.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.constant.AppConstants;
import com.dao.EmployeeDAO;
import com.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDAO {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	
	@Override
	public Employee fetchEmployeeById(Integer empId) {
		EntityManager em=factory.createEntityManager();
		Employee employee=null;
		try
		{
            TypedQuery<Employee> tq=em.createQuery(AppConstants.FINDBYIDQUERY,Employee.class);
            tq.setParameter(1,empId);
            employee = tq.getSingleResult();
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			em.close();
		}
		return employee;
	}

	@Override
	public void addEmployee(Employee emp) {

		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			em.persist(emp);
			tx.commit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			em.close();
		}
	}

	@Override
	public List<Employee> getAllEmployees() {
		EntityManager em=factory.createEntityManager();
		List<Employee> empList=null;
		try
		{
            TypedQuery<Employee> tq=em.createQuery(AppConstants.FINDALLEMPQUERY,Employee.class);
            empList = tq.getResultList();
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			em.close();
		}
		return empList;
	}

	@Override
	public List<Object[]> getNameAndSalary() {
		EntityManager em=factory.createEntityManager();
		List<Object[]> resultList=null;
		try
		{
			TypedQuery<Object[]> tq=em.createQuery(AppConstants.GETNAMEANDSAL,Object[].class);
			resultList = tq.getResultList();
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			em.close();
		}
		return resultList;
	}

}
