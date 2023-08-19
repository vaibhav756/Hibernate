package com.vkyit.client;

import com.vkyit.dao.StudentDAO;
import com.vkyit.daoimpl.StudentDAOImpl;
import com.vkyit.entity.Student;

public class Test {
	
	public static void main(String[] args) {
	
		StudentDAO impl=new StudentDAOImpl();
		/* Student Object*/
		Student st=new Student();
		st.setSid(101);
		st.setSname("Vaibhav Yadav");
		st.setGender("Male");
		st.setMarks(80);
		
		//impl.saveStudent(st);
		
		//get and load method
		/*
		 * Student stud= impl.loadStudent(101); try { Thread.sleep(10000);
		 * }catch(Exception e) { e.printStackTrace(); } System.out.println(stud);
		 */
		
		//Update Student
		//Student updateStudent = impl.updateStudent(102, 55);
		//System.out.println(updateStudent);
		//impl.deleteStudent(102);
	}
}
