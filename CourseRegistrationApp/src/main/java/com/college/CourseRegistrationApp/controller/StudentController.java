package com.college.CourseRegistrationApp.controller;

import com.college.CourseRegistrationApp.model.Student;
import com.college.CourseRegistrationApp.requestBody.StudentRequest;
import com.college.CourseRegistrationApp.service.StudentService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {
    private StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping("/addstudent")
    public String addStudent(@RequestParam String name, @RequestParam int usn, @RequestParam List<Integer> courseIds, HttpSession session){
        StudentRequest studentRequest = new StudentRequest(name,usn,courseIds);
        Student student = service.addStudent(studentRequest);
        session.setAttribute("student",student);
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String success(HttpSession session,Model model){
        Student student = (Student) session.getAttribute("student");
        model.addAttribute("student",student);
        System.out.println(student);
        return  "success";
    }

    @GetMapping("/showstudents")
    public String show(Model model){
        List<Student> students = service.listStudent();
        model.addAttribute("studentslist",students);
        System.out.println(students);
        return "showstudents";
    }
}
