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

	@Override
	public Student loadStudent(Integer sid) {
		Session session=factory.openSession();
		Student stud = session.get(Student.class, sid);
		return stud;
	}

	@Override
	public Student updateStudent(Integer sid, Integer mark) {
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		Student student = session.get(Student.class, sid);
		try
		{
			student.setMarks(mark);
			session.update(student);
			trans.commit();
			System.out.println("Student with sid : "+sid+" marks has been updated to : "+mark);
		}
		catch(Exception e)
		{
			trans.rollback();
			System.out.println("Student with sid : "+sid+" marks updation failed.");
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
    Student stud=session.get(Student.class, sid);
    try
    {
    	session.delete(stud);
    	trans.commit();
    	System.out.println("Student with sid : "+sid+" has been deleted.");
    }catch(Exception e)
    {
    	trans.rollback();
    	e.printStackTrace();
    	System.out.println("Student deletion failed for sid : "+sid);
    }finally
    {
    	session.close();
    }
		
	}
}
