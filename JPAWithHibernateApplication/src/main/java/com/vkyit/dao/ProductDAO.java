package com.vkyit.dao;

import com.vkyit.entity.Product;

public interface ProductDAO {

	Boolean saveProduct(Product prod);
	
	Product loadProductById(Integer pid);
	
	Product updateProductById(Integer pid,Double new_price);
	
	void deleteProductById(Integer pid);
	
}