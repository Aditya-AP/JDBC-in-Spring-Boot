package com.springboot.jpa.hibernate.course.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jpa.hibernate.course.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);

	
}
