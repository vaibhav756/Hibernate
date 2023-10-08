package com.vkyit.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vkyit.dao.PersonDao;
import com.vkyit.entity.Person;

public class PersonDaoImpl implements PersonDao{

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	
	@Override
	public void addPerson(Person person) {

		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			em.persist(person);
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
	public Person fetchPerson(Integer personId) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		Person person=new Person();
		try
		{
			person=em.find(Person.class, personId);
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			em.close();
		}
		return person;
	}

	@Override
	public void removePerson(Integer personId) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			Person person = em.find(Person.class, personId);
			em.remove(person);
			tx.commit();
			System.out.println("Person object has been removed");
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			em.close();
		}
	}

	
	
}
