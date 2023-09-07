package com.vkyit.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vkyit.dao.CourseDAO;
import com.vkyit.entity.Courses;

public class CourseDAOImpl implements CourseDAO {

	private static EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");

	@Override
	public void saveCourse(Courses course) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			em.persist(course);
			tx.commit();
		    System.out.println("Course stored successfully.");
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
			System.out.println("Course stored failed : "+course);
		}finally
		{
			em.close();
		}
		
	}

	@Override
	public Courses getCourseById(Integer courseId) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		Courses course=null;
		try
		{
			tx.begin();
			course = em.find(Courses.class, courseId);
			System.out.println("Course retrieval successfull : "+course);
			tx.commit();
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
			System.out.println("Course retrival failed for Id : "+courseId);
		}finally
		{
			em.close();
		}
		return course;
	}

	@Override
	public void updateCourse(Integer courseId,Integer coursePrice) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		Courses course=null;
		try
		{
			tx.begin();
			course = em.find(Courses.class, courseId);
			course.setCoursePrice(coursePrice);
			em.persist(course);
			tx.commit();
			System.out.println("Course updation of courseId : "+courseId+" with Price : "+coursePrice+" is successfull.");
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
			System.out.println("Course updation of courseId : "+courseId+" failed.");
			
		}finally
		{
			em.close();
		}
	}

	@Override
	public void deleteCourse(Integer courseId) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			Courses course = em.find(Courses.class, courseId);
			em.remove(course);
			tx.commit();
			System.out.println("Course with courseId : "+courseId+" deleted successfully.");
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
			System.out.println("Course with courseId : "+courseId+" deletion failed.");
		}finally
		{
			em.close();
		}

	}

}
