package com.vkyit.dao;

import com.vkyit.entity.CategoryEntity;

public interface CategoryDao {

	void addCategory(CategoryEntity category);
	CategoryEntity fetchCategory(Integer categoryId);
	Integer updateCategory(Integer categoryId);
	void deleteCategory(Integer categoryId);
}
