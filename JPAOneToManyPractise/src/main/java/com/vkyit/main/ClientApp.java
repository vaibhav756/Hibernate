package com.vkyit.main;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

import com.vkyit.dao.CategoryDao;
import com.vkyit.dao.impl.CategoryDaoImpl;
import com.vkyit.entity.CategoryEntity;
import com.vkyit.entity.ProductEntity;

public class ClientApp {
	public static void main(String[] args) {
		
		CategoryDao dao=new CategoryDaoImpl();
		
		CategoryEntity cat=new CategoryEntity();
		cat.setCategoryId(102);
		cat.setCategoryName("Electronics");
		
		ProductEntity prod1=new ProductEntity();
		prod1.setProductId(104);
		prod1.setProductName("Mobile");
		try {
		File file1=new File("C:\\Users\\Vaibhav Yadav\\Desktop\\mobile.jpg");
		byte[] mobBytes=new byte[(int)file1.length()];
		FileInputStream fis=new FileInputStream(file1);
		fis.read(mobBytes);
		prod1.setProductImage(mobBytes);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		cat.setListOfProducts(Arrays.asList(prod1));
		//dao.addCategory(cat);
		
		//CategoryEntity Category = dao.fetchCategory(101);
		//System.out.println(Category);
		
		dao.deleteCategory(102);
		
	}
}
