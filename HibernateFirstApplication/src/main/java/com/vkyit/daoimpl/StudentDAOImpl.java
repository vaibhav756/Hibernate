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

	@Override
	public Student loadStudent(Integer sid) {
		Session session=factory.openSession();
		Student stud=null;
		try
		{
			//stud = session.get(Student.class, sid);
			stud = session.load(Student.class, sid);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		//session.close();
		return stud;
	}

	@Override
	public Student updateStudent(Integer sid, Integer marks) {
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		Student student = session.get(Student.class, sid);
		student.setMarks(marks);
		try
		{
			session.update(student);
			trans.commit();
			System.out.println("Student object is updated.");
		}catch(Exception e)
		{
			trans.rollback();
			System.out.println("Student object is not updated.");
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return student;
	}

	@Override
	public void deleteStudent(Integer sid) {
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
        try
        {
        	Student student = session.get(Student.class, sid);
        	session.delete(student);
        	trans.commit();
        	System.out.println("Student with studId : "+sid+" has been deleted.");
        }catch(Exception e)
        {
        	trans.rollback();
        	System.out.println("Deletion operation failed for studId : "+sid);
        	e.printStackTrace();
        }finally
        {
        	session.close();
        }
	}

	@Override
	public void cacheTesting(Integer sid) {
		
		Session session=factory.openSession();
		Session session2=factory.openSession();
		
		Student student = session.get(Student.class, 101);
		Student student1 = session.get(Student.class, 102);
		//To remove particular object from cache we use evict method
		//session.evict(student);
		
		//To remove all object from cache we use clear method
		//session.clear();
		Student student2 = session.get(Student.class, 101);
		Student student3 = session2.get(Student.class, 101);
	}

}
