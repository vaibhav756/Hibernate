package com.vkyit.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vkyit.dao.DepartmentDao;
import com.vkyit.entity.Department;

public class DepartmentDaoImpl implements DepartmentDao {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	
	@Override
	public void addDepartment(Department dept) {

		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			em.persist(dept);
			tx.commit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			em.close();
		}
		
	}

}
