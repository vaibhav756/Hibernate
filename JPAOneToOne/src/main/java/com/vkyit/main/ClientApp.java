package com.vkyit.main;

import java.time.LocalDate;

import com.vkyit.dao.PersonDao;
import com.vkyit.dao.impl.PersonDaoImpl;
import com.vkyit.entity.Passport;
import com.vkyit.entity.Person;

public class ClientApp {

	public static void main(String[] args) {

		PersonDao dao=new PersonDaoImpl();
		
		//Add Person using OneToOne Association
		Person person=new Person();
		person.setPersonId(101);
		person.setPersonName("Vaibhav Yadav");
		
		Passport passport=new Passport();
		passport.setPassportNo(123456789);
		passport.setExpDate(LocalDate.now());
		person.setPassport(passport);
		
		//dao.addPerson(person);
		
		//Fetch Person using personId
		//Person fetchperson = dao.fetchPerson(101);
		//System.out.println(fetchperson);
		
		//Remove Person
		//dao.removePerson(101);
		
	}

}
