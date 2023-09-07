package com.vkyit.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.vkyit.dao.BikesDao;
import com.vkyit.entity.Bikes;

public class BikesDaoImpl implements BikesDao{

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	
	@Override
	public void addBikes(Bikes bikes) {
	EntityManager em=factory.createEntityManager();
	EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			em.persist(bikes);
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
	public Bikes getBikeByBikeName(String bikeName) {
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
	public List<Bikes> getAllBikes() {
		EntityManager em=factory.createEntityManager();
		TypedQuery<Bikes> tq=em.createNamedQuery("getBikeDetails",Bikes.class);
		List bikeList=null;
		try
		{
			bikeList = tq.getResultList();
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			em.close();
		}
		return bikeList;
	}

}
