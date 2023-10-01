package com.vkyit.entity.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vkyit.entity.Loans;
import com.vkyit.entity.dao.LoansDao;

public class LoanDaoImpl implements LoansDao {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	
	@Override
	public void saveLoan(Loans loan) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			em.merge(loan);
			tx.commit();
			System.out.println("Loan has been added successfully.");
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			em.close();
		}
	}

	@Override
	public Loans fetchLoans(Integer loanId) {
		EntityManager em=factory.createEntityManager();
		Loans loan=null;
		try
		{
			loan = em.find(Loans.class, loanId);
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			em.close();
		}
		return loan;
	}

	@Override
	public void deleteLoans(Integer loanId) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			Loans loan = em.find(Loans.class, loanId);
			em.remove(loan);
			tx.commit();
		}catch(Exception e)
		{
			e.printStackTrace();
			tx.rollback();
		}finally
		{
			em.close();
		}	
	}

}
