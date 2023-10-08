package com.vkyit.dao;

import com.vkyit.entity.Person;

public interface PersonDao {

	void addPerson(Person person);
	Person fetchPerson(Integer personId);
	void removePerson(Integer personId);
	
}
