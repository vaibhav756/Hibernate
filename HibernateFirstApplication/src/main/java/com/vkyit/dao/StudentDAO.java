package com.vkyit.dao;

import com.vkyit.entity.Student;

public interface StudentDAO {

	void saveStudent(Student student);
	
	Student loadStudent(Integer sid);
	
	Student updateStudent(Integer sid,Integer marks);
	
	void deleteStudent(Integer sid);
	
	void cacheTesting(Integer sid);
}
