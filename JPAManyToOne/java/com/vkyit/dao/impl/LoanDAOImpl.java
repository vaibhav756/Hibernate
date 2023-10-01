package com.vkyit.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vkyit.dao.LoanDAO;
import com.vkyit.entity.Loans;

public class LoanDAOImpl implements LoanDAO {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	
	@Override
	public void saveLoan(Loans loans) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			em.persist(loans);
			tx.commit();
			System.out.println("Loan object persisted successfully.");
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
	public Loans fetchLoanDetailsById(Integer loanId) {
		EntityManager em=factory.createEntityManager();
		Loans loan=null;
		try
		{
			loan = em.find(Loans.class, loanId);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
		}
		return loan;
	}

	@Override
	public void removeLoan(Integer loanId) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			Loans loan = em.find(Loans.class, loanId);
			em.remove(loan);
			tx.commit();
			System.out.println("Loan object has been deleted with loanId : "+loanId);
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
