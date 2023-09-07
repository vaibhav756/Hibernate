package com.vkyit.dao;

import com.vkyit.entity.ClassCourses;
import com.vkyit.entity.CompositeCourseKey;

public interface CoursesDAO {

	void saveCourses(ClassCourses course);
	
	ClassCourses getCourseByCompositeKey(CompositeCourseKey key);
	
	void updateCourse(CompositeCourseKey key,Integer coursePrice);
	
	void deleteCourse(CompositeCourseKey key);
	
}
