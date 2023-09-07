package com.vkyit.main;

import java.util.List;

import com.vkyit.dao.impl.BooksDaoImpl;
import com.vkyit.entity.Books;

public class ClientApp {

	public static void main(String[] args) {

		//Add Books
		Books book=new Books();
		book.setBookId(103);
		book.setBookName("Spring");
		book.setBookPrice(7000.00);
		
		BooksDaoImpl impl=new BooksDaoImpl();
		//impl.addBooks(book);
		//Books books = impl.getBookById(101);
		//System.out.println(books);
		
		//Get all books
		List<Books> allBooks = impl.getAllBooks();
		allBooks.forEach(books->{
			System.out.println(books);
		});
		
		//Update Books
		//impl.updateBooks(103, 9000.00);
		
	}

}
