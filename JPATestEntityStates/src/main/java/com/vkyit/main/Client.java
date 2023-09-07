package com.vkyit.main;

import com.vkyit.dao.ProductDAO;
import com.vkyit.dao.impl.ProductDAOImpl;

public class Client {

	public static void main(String[] args) {

		ProductDAO dao=new ProductDAOImpl();
	    dao.testEntityStates();	
		
	}

}
