package com.github.antonioticelso.coursespring.endpoint.repository;

import com.github.antonioticelso.coursespring.endpoint.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
