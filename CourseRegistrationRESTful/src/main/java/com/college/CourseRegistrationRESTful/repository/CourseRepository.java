package com.college.CourseRegistrationRESTful.repository;

import com.college.CourseRegistrationRESTful.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
