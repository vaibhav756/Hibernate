package com.vkyit.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vkyit.dao.CourseDAO;
import com.vkyit.entity.Courses;

public class CourseDAOImpl implements CourseDAO {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	
	@Override
	public void saveCourse(Courses course) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try
		{
			tx.begin();
			em.persist(course);
			tx.commit();
			System.out.println("Course added successfully.");
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
			System.out.println("Course addition failed "+course);
		}finally
		{
			em.close();
		}

	}

	@Override
	public Courses getCourseById(Integer courseId) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
		}finally
		{
			em.close();
		}
		return null;
	}

	@Override
	public void updateCourse(Integer coursePrice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCourse(Integer courseId) {
		// TODO Auto-generated method stub

	}

}
