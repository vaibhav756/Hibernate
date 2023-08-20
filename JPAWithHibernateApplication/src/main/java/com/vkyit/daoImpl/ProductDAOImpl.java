package com.vkyit.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vkyit.dao.ProductDAO;
import com.vkyit.entity.Product;

public class ProductDAOImpl implements ProductDAO{

	private EntityManagerFactory factory;
	
	public ProductDAOImpl()
	{
		factory=Persistence.createEntityManagerFactory("test");
	}
	
	@Override
	public Boolean saveProduct(Product prod) {
		Boolean result=false;
		EntityManager em = factory.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try{
			trans.begin();
			em.persist(prod);
			trans.commit();
			System.out.println("Product inserted successfully.");
			result=true;
		}catch(Exception e)
		{
			trans.rollback();
			e.printStackTrace();
			System.out.println("Product insertion failed.");
		}finally
		{
			em.close();
		}
		return result;
	}

	@Override
	public Product loadProductById(Integer pid) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction trans=em.getTransaction();
		Product prod=null;
		try
		{
			prod = em.find(Product.class, pid);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return prod;
	}

	@Override
	public Product updateProductById(Integer pid, Double new_price) {
		EntityManager em=factory.createEntityManager();
	    EntityTransaction trans=em.getTransaction();
	    Product prod=null;
	    try
	    {
	    	trans.begin();
	    	prod = em.find(Product.class, pid);
	    	prod.setUnitPrice(new_price);
	    	em.persist(prod);
	    	trans.commit();
	    	System.out.println("Product updated successfully.");
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    	trans.rollback();
	    	System.out.println("Product updation failed.");
	    }finally
	    {
	    	em.close();
	    }
		return null;
	}

	@Override
	public void deleteProductById(Integer pid) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction trans=em.getTransaction();
		try
		{
			trans.begin();
			Product prod = em.find(Product.class, pid);
			em.remove(prod);
			trans.commit();
			System.out.println("Product with pid : "+pid+" deleted successfully.");
		}catch(Exception e)
		{
			trans.rollback();
			e.printStackTrace();
			System.out.println("Product with pid : "+pid+" deletion failed.");
		}finally
		{
			em.close();
		}
	}

}
