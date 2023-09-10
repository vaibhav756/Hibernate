package com.vkyit.dao;

import com.vkyit.entity.CategoryEntity;

public interface CategoryDao {

	void saveCategory(CategoryEntity category);
	CategoryEntity fetchCategoryById(Integer categoryId);
	void removeCategory(Integer categoryId);
	Integer updateCategory(Integer categoryId);
	
}
