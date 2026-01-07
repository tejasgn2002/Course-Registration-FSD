package com.college.CourseRegistrationRESTful.repository;


import com.college.CourseRegistrationRESTful.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
