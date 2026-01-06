package com.college.CourseRegistrationApp.requestBody;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class StudentRequest {
    private String name;
    private int usn;
    private List<Integer> courseId;
}
