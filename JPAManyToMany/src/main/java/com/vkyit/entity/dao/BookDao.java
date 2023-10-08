package com.vkyit.entity.dao;

import com.vkyit.entity.Books;

public interface BookDao {

	void saveBook(Books book);
	Books fetchBook(Integer bookId);
	void removeBook(Integer bookId);
	
}
