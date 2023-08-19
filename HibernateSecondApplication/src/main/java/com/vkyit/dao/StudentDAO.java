package com.vkyit.dao;

import com.vkyit.entity.Student;

public interface StudentDAO {
	void saveStudent(Student stud);
	Student loadStudent(Integer sid);
	Student updateStudent(Integer sid,Integer mark);
	void deleteStudent(Integer sid);
}
