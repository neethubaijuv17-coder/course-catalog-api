package com.vayu.course_catalog.repository;

import com.vayu.course_catalog.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
