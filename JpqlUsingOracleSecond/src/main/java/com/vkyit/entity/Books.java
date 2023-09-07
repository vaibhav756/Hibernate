package com.vkyit.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
public class Books {

	@Id
	@Column(name="book_id")
	private Integer bookId;
	
	@Column(name="book_name")
	private String bookName;
	
	@Column(name="book_price")
	private Double bookPrice;
	
	@CreationTimestamp
	@Column(name="crtm_timestamp")
	private Timestamp crtnTimestamp;
	
	@UpdateTimestamp
	@Column(name="update_timestamp")
	private Timestamp updtTimestamp;
	
	@Column(name="book_language",columnDefinition="varchar2(255) default 'English'")
	private String language;

	public Integer getBookId() {
		return bookId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Timestamp getCrtnTimestamp() {
		return crtnTimestamp;
	}

	public void setCrtnTimestamp(Timestamp crtnTimestamp) {
		this.crtnTimestamp = crtnTimestamp;
	}

	public Timestamp getUpdtTimestamp() {
		return updtTimestamp;
	}

	public void setUpdtTimestamp(Timestamp updtTimestamp) {
		this.updtTimestamp = updtTimestamp;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", crtnTimestamp="
				+ crtnTimestamp + ", updtTimestamp=" + updtTimestamp + ", language=" + language + "]";
	}

}
