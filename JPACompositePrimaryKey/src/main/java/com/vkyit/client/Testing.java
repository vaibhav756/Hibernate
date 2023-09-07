package com.vkyit.client;

import com.vkyit.dao.CoursesDAO;
import com.vkyit.dao.impl.CourseDAOImpl;
import com.vkyit.entity.ClassCourses;
import com.vkyit.entity.CompositeCourseKey;

public class Testing {

	public static void main(String[] args) {
		
		//
		CompositeCourseKey key=new CompositeCourseKey();
		key.setEmail("amitd123@gmail.com");
		key.setCourse_name("Core Java");
		ClassCourses course=new ClassCourses();
		course.setComposite(key);
		course.setCoursePrice(5000);
		course.setCourseDuration(3);
		
		CoursesDAO dao=new CourseDAOImpl();
		dao.saveCourses(course);
		
		
		//Get course by id
		//ClassCourses courseByCompositeKey = dao.getCourseByCompositeKey(key);
		
		//Update courseprice by id
		//dao.updateCourse(key,7000);
		
		//Delete course by id
		//dao.deleteCourse(key);
		
	}
	
}
