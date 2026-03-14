package com.klu.service;

import org.springframework.stereotype.Service;

import com.klu.Student;
import com.klu.exception.StudentNotFoundException;

@Service
public class StudentService {

    public Student getStudentById(int id) {

        if(id == 1)
            return new Student(1,"Rahul");

        if(id == 2)
            return new Student(2,"Priya");

        throw new StudentNotFoundException("Student not found with id : " + id);
    }

}