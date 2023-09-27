package com.vkyit.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="products")
public class ProductEntity {

	@Id
	@Column(name="product_id")
	private Integer productId;
	
	@Lob
	@Column(name="product_image")
	private byte[] productImage;
	
	@Column(name="product_name")
	private String productName;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public byte[] getProductImage() {
		return productImage;
	}

	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", productImage=" + Arrays.toString(productImage)
				+ ", productName=" + productName + "]";
	}

	
}
