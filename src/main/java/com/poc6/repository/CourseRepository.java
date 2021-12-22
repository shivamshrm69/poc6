package com.poc6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc6.enity.Courses;

public interface CourseRepository extends JpaRepository<Courses, Integer>{

}
