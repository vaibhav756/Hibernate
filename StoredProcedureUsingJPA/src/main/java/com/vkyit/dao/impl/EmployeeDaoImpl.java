package com.vkyit.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import com.vkyit.dao.EmployeeDao;
import com.vkyit.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	
	@Override
	public List<Employee> getEmployeeDatails(Integer empNo) {
		List<Employee> list=null;
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			StoredProcedureQuery spq=em.createNamedStoredProcedureQuery("getEmpExp");
			spq.setParameter("ENO",empNo);
			
			//StoredProcedureQuery spq = em.createNamedStoredProcedureQuery("getAllEmps");
			spq.execute();
			String name = (String)spq.getOutputParameterValue("NAME");
			Integer exp = (Integer)spq.getOutputParameterValue("EXPERIENCE");
			//List<Employee> outputParameterValue = (List<Employee>)spq.getOutputParameterValue("emp_details");
			tx.commit();
			System.out.println(name+" - "+exp);
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			em.close();
		}
		return list;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return null;
	}

}
