package com.vkyit.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.vkyit.dao.CategoryDao;
import com.vkyit.dao.impl.CategoryDaoImpl;
import com.vkyit.entity.CategoryEntity;

public class ClientApp {

	public static void main(String[] args) {

		CategoryDao dao=new CategoryDaoImpl();
		/*
		File file=new File("C:\\Users\\Vaibhav Yadav\\Desktop\\mobile.jpg");
		byte[] imageBytes=new byte[(int)file.length()];
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			fis.read(imageBytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Product One
		ProductEntity prod1=new ProductEntity();
		prod1.setProductId(101);
		prod1.setProductName("Mobile");
		prod1.setProductImage(imageBytes);
		
		//Product Two
		ProductEntity prod2=new ProductEntity();
		prod2.setProductId(102);
		prod2.setProductName("Tv");
		
		File file2=new File("C:\\Users\\Vaibhav Yadav\\Desktop\\tv.jpg");
		byte[] imageBytes2=new byte[(int)file2.length()];
		FileInputStream fis2=null;
		try {
			fis2=new FileInputStream(file2);
			fis2.read(imageBytes2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		prod2.setProductImage(imageBytes2);

		//Product Three
		ProductEntity prod3=new ProductEntity();
		prod3.setProductId(103);
		prod3.setProductName("Microoven");
		File file3=new File("C:\\Users\\Vaibhav Yadav\\Desktop\\microoven.jpg");
		byte[] imageBytes3=new byte[(int)file3.length()];
		FileInputStream fis3=null;
		try {
			fis3=new FileInputStream(file3);
			fis3.read(imageBytes3);
		} catch (IOException e) {
			e.printStackTrace();
		}
		prod3.setProductImage(imageBytes3);
		
		List<ProductEntity> listOfProducts=Arrays.asList(prod1,prod2,prod3);
		
		CategoryEntity cat=new CategoryEntity();
		cat.setCategoryId(101);
		cat.setCategoryName("Electronics");
		cat.setListOfProducts(listOfProducts);
		dao.saveCategory(cat);*/
		
		
		//Fetch Records based on CategoryId
		/*CategoryEntity fetchCategoryById = dao.fetchCategoryById(101);
		System.out.println(fetchCategoryById);
		File outfile=new File("C:\\Users\\Vaibhav Yadav\\Desktop\\MobileCopy.jpg");
		byte[] img=fetchCategoryById.getListOfProducts().get(0).getProductImage();
		try {
			FileOutputStream fos=new FileOutputStream(outfile);
			fos.write(img);
			fos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Mobile copy stored successfully.");
		*/
		
		//Delete Record based on CategoryId
		//dao.removeCategory(101);
		
	}

}
