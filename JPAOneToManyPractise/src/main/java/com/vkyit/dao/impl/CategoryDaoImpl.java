package com.vkyit.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vkyit.dao.CategoryDao;
import com.vkyit.entity.CategoryEntity;

public class CategoryDaoImpl implements CategoryDao {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	
	@Override
	public void addCategory(CategoryEntity category) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			em.persist(category);
			tx.commit();
			System.out.println("CategoryEntity added successfully.");
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
	public CategoryEntity fetchCategory(Integer categoryId) {
		EntityManager em=factory.createEntityManager();
		CategoryEntity cat=null;
		try
		{
			cat = em.find(CategoryEntity.class, categoryId);
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			em.close();
		}
		return cat;
	}

	@Override
	public Integer updateCategory(Integer categoryId) {
		EntityManager em=factory.createEntityManager();
		try
		{
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			em.close();
		}
		return null;
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			CategoryEntity cat = em.find(CategoryEntity.class, categoryId);
			em.remove(cat);
			tx.commit();
			System.out.println("Entity has been deleted from DB for CategoryId : "+categoryId);
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
