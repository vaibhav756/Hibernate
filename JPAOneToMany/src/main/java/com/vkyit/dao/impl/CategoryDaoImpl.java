package com.vkyit.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vkyit.dao.CategoryDao;
import com.vkyit.entity.CategoryEntity;

public class CategoryDaoImpl implements CategoryDao{

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	
	@Override
	public void saveCategory(CategoryEntity category) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			em.persist(category);
			tx.commit();
			System.out.println("Category with products persisted successfully.");
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
	public CategoryEntity fetchCategoryById(Integer categoryId) {
		EntityManager em=factory.createEntityManager();
		CategoryEntity category=null;
		try
		{
			category = em.find(CategoryEntity.class, categoryId);
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			em.close();
		}
		return category;
	}

	@Override
	public void removeCategory(Integer categoryId) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		CategoryEntity category=null;
		try
		{
			tx.begin();
			category=em.find(CategoryEntity.class, categoryId);
			em.remove(category);
			tx.commit();
			System.out.println("Category with Products categoryId : "+categoryId+" has been removed.");
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
	public Integer updateCategory(Integer categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

}
