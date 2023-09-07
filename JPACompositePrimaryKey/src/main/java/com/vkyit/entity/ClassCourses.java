package com.vkyit.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="course_admission")
public class ClassCourses {

	@EmbeddedId
	private CompositeCourseKey composite;
	

	@Column(name="course_price")
	private Integer coursePrice;
	
	@Column(name="course_duration")
	private Integer courseDuration;

	public CompositeCourseKey getComposite() {
		return composite;
	}

	public void setComposite(CompositeCourseKey composite) {
		this.composite = composite;
	}

	public Integer getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(Integer coursePrice) {
		this.coursePrice = coursePrice;
	}

	public Integer getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(Integer courseDuration) {
		this.courseDuration = courseDuration;
	}

	@Override
	public String toString() {
		return "ClassCourses [composite=" + composite + ", coursePrice=" + coursePrice + ", courseDuration="
				+ courseDuration + "]";
	}
	
}
