package com.vkyit.client;

import com.vkyit.dao.CourseDAO;
import com.vkyit.daoImpl.CourseDAOImpl;
import com.vkyit.entity.Courses;

public class TestingApp {

	public static void main(String[] args) {

		CourseDAO dao=new CourseDAOImpl();
		Courses course=new Courses();
		course.setCourseId(101);
		course.setCourseName("Core Java");
		course.setCoursePrice(5000);
		course.setCourseDuration(3);
		
		dao.saveCourse(course);

	}

}
