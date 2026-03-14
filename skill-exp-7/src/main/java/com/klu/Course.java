package com.klu;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Skill-7")
public class Course {
	@Id
	private int CourseId;
	private String CourseTitle;
	private int CourseDuration;
	private double CourseFee;
	public int getCourseId() {
		return CourseId;
	}
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}
	public String getCourseTitle() {
		return CourseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		CourseTitle = courseTitle;
	}
	public int getCourseDuration() {
		return CourseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		CourseDuration = courseDuration;
	}
	public double getCourseFee() {
		return CourseFee;
	}
	public void setCourseFee(double courseFee) {
		CourseFee = courseFee;
	}
	public Course(int courseId, String courseTitle, int courseDuration, double courseFee) {
		super();
		CourseId = courseId;
		CourseTitle = courseTitle;
		CourseDuration = courseDuration;
		CourseFee = courseFee;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [CourseId=" + CourseId + ", CourseTitle=" + CourseTitle + ", CourseDuration=" + CourseDuration
				+ ", CourseFee=" + CourseFee + "]";
	}
	
}
