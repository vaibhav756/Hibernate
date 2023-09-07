package com.vkyit.client;

import com.vkyit.dao.CourseDAO;
import com.vkyit.daoImpl.CourseDAOImpl;
import com.vkyit.entity.Courses;

public class TestingApp {

	public static void main(String[] args) {

		CourseDAO dao=new CourseDAOImpl();
		Courses course=new Courses();
		course.setCourseId(105);
		course.setCourseName("Adv Java");
		course.setCoursePrice(8000);
		course.setCourseDuration(3);
		
		//dao.saveCourse(course);
        //Find Course ByCourseId
		//Courses course1 = dao.getCourseById(101);
		
		//Update Course price
		//dao.updateCourse(105,6000);
		
		//Delete Course
		dao.deleteCourse(105);
		
	}

}
