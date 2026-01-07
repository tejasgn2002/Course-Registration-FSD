package com.college.CourseRegistrationRESTful.Controller;

import com.college.CourseRegistrationRESTful.Entity.Student;
import com.college.CourseRegistrationRESTful.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4000/")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student> fetchAllStudents(){ return service.listStudent(); }

    @PostMapping("/student")
    public Student addStudent(@RequestBody  Student student){
        System.out.println(student);
        return service.addStudent(student);
    }

    @GetMapping("/student/{id}")
    public Student fetchStudentById(@PathVariable int id){
        return service.fetchStudentById(id);
    }

    @PutMapping("/student/{id}")
    public Student updateStudentById(@PathVariable int id,@RequestBody Student student){
        return  service.updateStudent(id,student);
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudentById(@PathVariable int id){
        return service.deleteStudentById(id);
    }
}
