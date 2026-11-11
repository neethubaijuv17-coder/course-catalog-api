package com.vayu.course_catalog.service;

import com.vayu.course_catalog.model.Course;
import com.vayu.course_catalog.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course create(Course course) {
        // TODO: save and return the saved course
    }

    public List<Course> findAll() {
        // TODO
    }

    public Course findById(Long id) {
        // TODO: return the course, or throw CourseNotFoundException
    }

    public Course update(Long id, Course updated) {
        // TODO: find the existing course (404 if missing), copy the fields, save
    }

    public void delete(Long id) {
        // TODO: 404 if missing, otherwise delete
    }
}
