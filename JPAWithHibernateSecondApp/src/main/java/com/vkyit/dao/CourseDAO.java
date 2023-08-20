package com.vkyit.dao;

import com.vkyit.entity.Courses;

public interface CourseDAO {

	void saveCourse(Courses course);
	
	Courses getCourseById(Integer courseId);
	
	void updateCourse(Integer coursePrice);
	
	void deleteCourse(Integer courseId);
	
}
