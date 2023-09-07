package com.vkyit.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CompositeCourseKey implements Serializable{

	@Column(name="email")
	private String email;
	
	@Column(name="course_name")
	private String course_name;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(course_name, email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompositeCourseKey other = (CompositeCourseKey) obj;
		return Objects.equals(course_name, other.course_name) && Objects.equals(email, other.email);
	}

	@Override
	public String toString() {
		return "CompositeCourseKey [email=" + email + ", course_name=" + course_name + "]";
	}
	
	
	
}
