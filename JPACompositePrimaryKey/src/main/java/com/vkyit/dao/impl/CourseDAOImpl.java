package com.vkyit.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vkyit.dao.CoursesDAO;
import com.vkyit.entity.ClassCourses;
import com.vkyit.entity.CompositeCourseKey;

public class CourseDAOImpl implements CoursesDAO{

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	
	@Override
	public void saveCourses(ClassCourses course) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try {
			tx.begin();
			em.persist(course);
			tx.commit();
			System.out.println("Course saved successfully.");
			
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
			System.out.println("Course save operation failed");
			
		}finally
		{
			em.close();
		}
	}

	@Override
	public ClassCourses getCourseByCompositeKey(CompositeCourseKey key) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		ClassCourses course=null;
		try
		{
			tx.begin();
			course=em.find(ClassCourses.class, key);
			tx.commit();
			System.out.println("Loading course bases on id : "+key+" is : "+course);
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
			System.out.println("Load Course failed for courseId : "+key);
		}finally
		{
			em.close();
		}
		return course;
	}

	@Override
	public void updateCourse(CompositeCourseKey key,Integer coursePrice) {
		
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			ClassCourses course=em.find(ClassCourses.class, key);
			course.setCoursePrice(coursePrice);
			tx.commit();
			System.out.println("Course with courseId : "+key+" has been updated coursePrice : "+coursePrice);
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
			System.out.println("Courese updation failed for courseId : "+key);
		}finally
		{
			em.close();
		}
		
	}

	@Override
	public void deleteCourse(CompositeCourseKey key) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try
		{
			tx.begin();
			ClassCourses find = em.find(ClassCourses.class, key);
			em.remove(find);
			tx.commit();
			System.out.println("Course deleted successfully for courseId : "+key);
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
			System.out.println("Course deletion failed for courseId : "+key);
		}finally
		{
			em.close();
		}
		
	}

}
