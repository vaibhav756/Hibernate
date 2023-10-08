package com.vkyit.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="authors")
public class Authors {

	@Id
	@Column(name="author_id")
	private Integer authorId;
	
	@Column(name="author_name")
	private String authorName;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="authors",fetch=FetchType.EAGER)
	private List<Books> books;

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Authors [authorId=" + authorId + ", authorName=" + authorName + "]";
	}

	
	
}
