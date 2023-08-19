package com.vkyit.daoimpl;

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
		ServiceRegistry registry=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(registry).getMetadataBuilder().build();
		factory=meta.getSessionFactoryBuilder().build();
	}
	
	@Override
	public void saveStudent(Student stud) {
		
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		try
		{
			session.save(stud);
			trans.commit();
			System.out.println("Student object inserted");
		}catch(Exception e)
		{
			trans.rollback();
			System.out.println("Student object insertion failed");
			e.printStackTrace();
		}finally
		{
			session.close();
		}	
	}
}
