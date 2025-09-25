package com.pebloop.learning.controllers;

import com.pebloop.learning.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "pebloop"),
                new Course(2, "Learn DevOps", "pebloop"),
                new Course(3, "Learn Azure", "pebloop"),
                new Course(4, "Learn Springboot", "pebloop")
        );
    }

}
