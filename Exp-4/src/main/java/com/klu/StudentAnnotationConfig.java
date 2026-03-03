package com.klu;
import org.springframework.stereotype.Component;

@Component
public class StudentAnnotationConfig {

    private int studentId;
    private String name;
    private String course;
    private int year;

    public StudentAnnotationConfig() {
        this.studentId = 102;
        this.name = "Gireesh";
        this.course = "CSE";
        this.year = 3;
    }

    public void display() {
        System.out.println(studentId + " " + name + " " + course + " " + year);
    }
}