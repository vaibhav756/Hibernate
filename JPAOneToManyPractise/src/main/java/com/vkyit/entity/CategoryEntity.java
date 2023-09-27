package com.vkyit.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="category")
public class CategoryEntity {

	@Id
	@Column(name="category_id")
	private Integer categoryId;
	
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="category_id_fk",referencedColumnName="category_id")
	private List<ProductEntity> listOfProducts;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<ProductEntity> getListOfProducts() {
		return listOfProducts;
	}

	public void setListOfProducts(List<ProductEntity> listOfProducts) {
		this.listOfProducts = listOfProducts;
	}

	@Override
	public String toString() {
		return "CategoryEntity [categoryId=" + categoryId + ", categoryName=" + categoryName + ", listOfProducts="
				+ listOfProducts + "]";
	}
	
	
	
}
