package com.klu.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klu.Course;
import com.klu.Repository.CourseRepository;

@Service
public class CourseService {
	private final CourseRepository coursrepo;
	CourseService(CourseRepository coursrepo){
		this.coursrepo=coursrepo;
	}
	public String addCourse(Course cour) {
		coursrepo.save(cour);
		return "Successfully inserted";
	}
	public List<Course> getAllCourses(){
		return null;
		
	}
	public Course getById(int id) {
		return coursrepo.findById(id).orElse(null);
	}
	public Course updateCourse(int id,Course newcour) {
		Course existing=coursrepo.findById(id).orElse(null);
		while(existing!=null) {
			existing.setCourseId(newcour.getCourseId());
			existing.setCourseTitle(newcour.getCourseTitle());
			existing.setCourseDuration(newcour.getCourseDuration());
			existing.setCourseFee(newcour.getCourseFee());
		}
		return existing;
	}
	public String deleteCourse(int id) {
		coursrepo.deleteById(id);
		return "deleted";
	}
}
