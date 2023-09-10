package com.vkyit.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vkyit.dao.CustomerDao;
import com.vkyit.entity.CustomerEntity;

public class CustomerDaoImpl implements CustomerDao {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	
	@Override
	public void saveCustomer(CustomerEntity customer) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			em.persist(customer);
			tx.commit();
			System.out.println("Customer with loans has been saved successfully.");
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}finally
		{
			em.close();
		}
	}

	@Override
	public CustomerEntity fetchCustomer(Integer customerId) {
		return null;
	}

	@Override
	public void removeCustomer(Integer customerId) {
		// TODO Auto-generated method stub

	}

}
