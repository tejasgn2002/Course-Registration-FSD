package com.college.CourseRegistrationRESTful.service;


import com.college.CourseRegistrationRESTful.Entity.Course;
import com.college.CourseRegistrationRESTful.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    private  final CourseRepository repo;
    @Autowired
    public CourseService(CourseRepository repo) {
        this.repo = repo;
    }
    public List<Course> fetchAllCourse(){
        return repo.findAll();
    }
    public Optional<Course> fetchCourseById(Integer id){
        return repo.findById(id);
    }
    public List<Course> fetchAllCourseById(List<Integer> courseIds){
        return repo.findAllById(courseIds);
    }
}
