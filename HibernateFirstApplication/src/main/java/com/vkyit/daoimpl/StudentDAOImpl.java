package com.vkyit.daoimpl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.vkyit.dao.StudentDAO;
import com.vkyit.entity.Student;

public class StudentDAOImpl implements StudentDAO{

	SessionFactory factory;
	
	public StudentDAOImpl()
	{
		ServiceRegistry registery=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(registery).getMetadataBuilder().build();
		factory=meta.getSessionFactoryBuilder().build();
	}
	
	@Override
	public void saveStudent(Student student) {
		
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		
		try
		{
			session.save(student);
			System.out.println("Student object is persisted in DB.");
			trans.commit();
		}catch(Exception e)
		{
			trans.rollback();
			System.out.println("Error occured while persisting student object");
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
	}

}
