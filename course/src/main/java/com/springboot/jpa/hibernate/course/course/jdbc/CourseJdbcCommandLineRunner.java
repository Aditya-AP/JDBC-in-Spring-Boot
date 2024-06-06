package com.springboot.jpa.hibernate.course.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.jpa.hibernate.course.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.insert(new Course(1,"Learn AI","Oracle"));
		repository.insert(new Course(2,"Learn Azure","Microsoft"));
		repository.insert(new Course(3,"Learn Spring Boot","Udemy"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
	}

}

