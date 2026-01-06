package com.college.CourseRegistrationApp.controller;

import com.college.CourseRegistrationApp.model.Course;
import com.college.CourseRegistrationApp.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@AllArgsConstructor
@Controller
public class HomeDashboardController {

    private final CourseService service;

    @GetMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }

    @GetMapping("/registerstudent")
    public String registrationStudent(Model model){
        List<Course> course = service.fetchAllCourse();

        model.addAttribute("courses",course);
        return "registerstudent";
    }
}
