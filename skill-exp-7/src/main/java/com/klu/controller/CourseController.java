package com.klu.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.Course;
import com.klu.Service.CourseService;
@RestController
@RequestMapping("/course/details")
public class CourseController {
	private final CourseService courservice;
	CourseController(CourseService courservice){
		this.courservice=courservice;
	}
	@PostMapping
	public String addDetails(@RequestBody Course cour) {
		return courservice.addCourse(cour);
	}
	@GetMapping("/{id}")
	public Course getById(@PathVariable("id")int id) {
		return courservice.getById(id);
	}
	@PutMapping("/{id}")
	public Course updateCourse(@PathVariable("id")int id,Course cour) {
		return courservice.updateCourse(id, cour);
	}
	@DeleteMapping("{id}")
	public String deleteProduct(@PathVariable int id) {
		return courservice.deleteCourse(id);
	}
}
