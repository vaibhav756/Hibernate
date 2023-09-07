package com.vkyit.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vkyit.dao.ProductDAO;
import com.vkyit.entity.Product;

public class ProductDAOImpl implements ProductDAO{

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	
	@Override
	public void testEntityStates() {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			/*
			 * Create Product Entity and store in DB
			 */
			tx.begin();
			/*Product p=new Product();
			p.setProductId(101);
			p.setProductName("Camera");
			p.setQuantity(100);
			p.setUnitPrice(5000.00);*/
			Product p=em.find(Product.class, 101);   //When we load object from DB it goes in persistence state
			//em.persist(p);    //Persistence state
			//tx.commit();
			em.detach(p);  //Object will remove from cache
			p.setUnitPrice(6000.00);	//Tried to make changes in an entity but in detached state it doesn't affect to DB
			em.merge(p);  //Whenever we call merge method object move from detached to persistence state
			tx.commit();
			em.close();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}finally
		{
			em.close();
		}
	}

}
