package com.college.CourseRegistrationApp.service;

import com.college.CourseRegistrationApp.model.Course;
import com.college.CourseRegistrationApp.model.Student;
import com.college.CourseRegistrationApp.repository.StudentRepository;
import com.college.CourseRegistrationApp.requestBody.StudentRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class StudentService {
    private  final StudentRepository repo;
    private  final CourseService courseService;

    public Student addStudent(StudentRequest studentRequest){
        Student student = new Student();
        student.setName(studentRequest.getName());
        student.setUsn(studentRequest.getUsn());
        List<Course> courseList = courseService.fetchAllCourseById(studentRequest.getCourseId());
        student.setCourseList(courseList);
        return repo.save(student);
    }

    public List<Student> listStudent(){
        return repo.findAll();
    }
}
