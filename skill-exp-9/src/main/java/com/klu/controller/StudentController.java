package com.klu.controller;

import org.springframework.web.bind.annotation.*;

import com.klu.Student;
import com.klu.exception.InvalidInputException;
import com.klu.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service){
        this.service = service;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id){

        if(id <= 0){
            throw new InvalidInputException("Student ID must be positive");
        }

        return service.getStudentById(id);
    }
}