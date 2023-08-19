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
		
		impl.saveStudent(st);
		
	}
}
