package com.vkyit;

import java.util.Arrays;
import java.util.List;

import com.vkyit.dao.Impl.BookDaoImpl;
import com.vkyit.entity.Authors;
import com.vkyit.entity.Books;
import com.vkyit.entity.dao.BookDao;

public class ClientApp {

	public static void main(String[] args) {

		BookDao dao=new BookDaoImpl();
		
		Books book=new Books();
		book.setBookId(101);
		book.setBookName("Java");
		
		Books book1=new Books();
		book1.setBookId(102);
		book1.setBookName("Adv Java");
		
		Authors auth=new Authors();
		auth.setAuthorId(201);
		auth.setAuthorName("Jams Gosline");
		
		Authors auth1=new Authors();
		auth1.setAuthorId(202);
		auth1.setAuthorName("Garden");

		Authors auth2=new Authors();
		auth2.setAuthorId(203);
		auth2.setAuthorName("Blake");
		
		List<Authors> listOfAuthorsOfBook=Arrays.asList(auth,auth2);
		book.setAuthors(listOfAuthorsOfBook);
		
		List<Authors> listOfAuthorsOfBook1=Arrays.asList(auth,auth1,auth2);
		book1.setAuthors(listOfAuthorsOfBook1);

		//dao.saveBook(book);
		//dao.saveBook(book1);
		
		//Find BookById
		Books fetchBook=dao.fetchBook(101);
		/*System.out.println("BookId : "+fetchBook.getBookId());
		System.out.println("BookName : "+fetchBook.getBookName());
		List<Authors> authors = fetchBook.getAuthors();
		authors.forEach(System.out::println);*/
		System.out.println(fetchBook);
		
		//Remove BookById
		//We can't remove Authors associated with Books because there might be possiblityt that same authors are associated with other Books
		//When we have manyTomany association Hibernate behave in bi-directional operation which leads to delete entire data in both the tables. 
	}

}
