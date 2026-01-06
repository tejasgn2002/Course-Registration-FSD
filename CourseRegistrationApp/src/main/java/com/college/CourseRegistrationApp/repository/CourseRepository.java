package com.college.CourseRegistrationApp.repository;

import com.college.CourseRegistrationApp.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
