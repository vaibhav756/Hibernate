package com.vkyit.client;

import com.vkyit.dao.ProductDAO;
import com.vkyit.daoImpl.ProductDAOImpl;
import com.vkyit.entity.Product;

public class Test {

	public static void main(String[] args) {
		//Add PRODUCT
		ProductDAO impl=new ProductDAOImpl();
		Product p=new Product();
		p.setProductId(105);
		p.setProductName("Orio");
		p.setQuantity(170);
		p.setUnitPrice(14.00);
		//Boolean saveProduct = impl.saveProduct(p);
		
		//Load Product by id
		//Product prod = impl.loadProductById(102);
		//System.out.println(prod);
		
		//Update Product by id
		//Product prod = impl.updateProductById(102, 15.00);
		//System.out.println(prod);
		
		//Delete Product by id
		//impl.deleteProductById(104);
		
	}
	
}
