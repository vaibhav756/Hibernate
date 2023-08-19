package com.vkyit.client;

import com.vkyit.dao.StudentDAO;
import com.vkyit.daoimpl.StudentDAOImpl;
import com.vkyit.entity.Student;

public class Testing {
	
	public static void main(String[] args) {
		
		StudentDAO dao=new StudentDAOImpl();
		Student stud=new Student();
		stud.setSid(102);
		stud.setSname("Kiran Yadav");
		stud.setGender("Male");
		stud.setMarks(59);
		
		//dao.saveStudent(stud);
		//Load Student
		//Student student = dao.loadStudent(102);
		//System.out.println(student);
		
		//Update Student
		//Student updateStudent = dao.updateStudent(102, 99);
		//System.out.println(updateStudent);
		
		//Delete Student
		//dao.deleteStudent(102);
	}

}
