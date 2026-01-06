package com.college.CourseRegistrationApp.repository;

import com.college.CourseRegistrationApp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
