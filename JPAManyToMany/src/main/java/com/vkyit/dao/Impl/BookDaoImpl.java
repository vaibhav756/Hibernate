package com.vkyit.dao.Impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vkyit.entity.Books;
import com.vkyit.entity.dao.BookDao;

public class BookDaoImpl implements BookDao {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	
	@Override
	public void saveBook(Books book) {

		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			em.merge(book);
			tx.commit();
			System.out.println("Book has been saved");
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
	public Books fetchBook(Integer bookId) {
		EntityManager em=factory.createEntityManager();
		Books book=null;
		try
		{
			book = em.find(Books.class, bookId);
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			em.close();
		}
		return book;
	}

	@Override
	public void removeBook(Integer bookId) {

		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			Books book = em.find(Books.class, bookId);
			em.remove(book);
			tx.commit();
			System.out.println("Book with BookId : "+bookId+" has been removed successfully.");
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
