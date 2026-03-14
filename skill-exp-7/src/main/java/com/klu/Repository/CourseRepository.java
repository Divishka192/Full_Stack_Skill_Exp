package com.klu.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.klu.Course;
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
