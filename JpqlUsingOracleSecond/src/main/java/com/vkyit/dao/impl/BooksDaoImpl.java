package com.vkyit.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.vkyit.dao.BooksDAO;
import com.vkyit.entity.Books;

public class BooksDaoImpl implements BooksDAO {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	
	@Override
	public void addBooks(Books book) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			em.persist(book);			
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
	public Books getBookById(Integer bookId) {
        EntityManager em=factory.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        Books book=null;
        try
        {
        	TypedQuery<Books> tq=em.createQuery("from Books b where b.bookId=:bookId",Books.class);
        	tq.setParameter("bookId", bookId);
        	book = tq.getSingleResult();
        	
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
	public List<Books> getAllBooks() {
		EntityManager em=factory.createEntityManager();
		List<Books> list=null;
		try
		{
			TypedQuery<Books> tq=em.createQuery("from Books b",Books.class);
			list = tq.getResultList();
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
	public void deleteBooks(Integer bookId) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		Query query=em.createQuery("delete from Books b where b.bookId=:bookId");
		try
		{
			query.setParameter("bookId", bookId);
			tx.begin();
			query.executeUpdate();
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
	public void updateBooks(Integer bookId, Double bookPrice) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		Query query=em.createQuery("update Books b set b.bookPrice=:bookPrice where b.bookId=:bookId");
		try
		{
			query.setParameter("bookPrice", bookPrice);
			query.setParameter("bookId", bookId);
			tx.begin();
			query.executeUpdate();
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
