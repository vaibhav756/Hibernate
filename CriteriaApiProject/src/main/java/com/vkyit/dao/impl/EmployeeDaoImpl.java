package com.vkyit.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.vkyit.dao.EmployeeDao;
import com.vkyit.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	
	@Override
	public List<Employee> getSalaryGreaterThanAmt(Integer amt) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		List<Employee> list=null;
		try
		{
			CriteriaBuilder cb=em.getCriteriaBuilder();
			CriteriaQuery<Employee> cq=cb.createQuery(Employee.class);
			Root<Employee> rt=cq.from(Employee.class);
			cq.select(rt).where(cb.gt(rt.get("empSal"), amt));
			
			Query query=em.createQuery(cq);
			list = query.getResultList();
			em.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			em.close();
		}
		return list;
	}

}
