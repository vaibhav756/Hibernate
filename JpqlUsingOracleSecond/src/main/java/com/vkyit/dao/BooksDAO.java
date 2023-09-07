package com.vkyit.dao;

import java.util.List;

import com.vkyit.entity.Books;

public interface BooksDAO {

	void addBooks(Books book);
	Books getBookById(Integer bookId);
	List<Books> getAllBooks();
	void deleteBooks(Integer bookId);
	void updateBooks(Integer bookId,Double bookPrice);
	
}
