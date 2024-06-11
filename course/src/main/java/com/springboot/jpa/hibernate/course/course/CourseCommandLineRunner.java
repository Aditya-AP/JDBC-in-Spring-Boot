package com.springboot.jpa.hibernate.course.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.jpa.hibernate.course.course.Course;
import com.springboot.jpa.hibernate.course.course.jdbc.CourseJdbcRepository;
import com.springboot.jpa.hibernate.course.course.jpa.CourseJpaRepository;
import com.springboot.jpa.hibernate.course.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {

		repository.save(new Course(1, "Learn AI", "Oracle"));
		repository.save(new Course(2, "Learn Azure", "Microsoft"));
		repository.save(new Course(3, "Learn Spring Boot", "Udemy"));

		repository.deleteById(1l);

		System.out.println(repository.findById(2l));
		
		System.out.println(repository.findAll());
		
		System.out.println(repository.findByAuthor("Udemy"));
		
		System.out.println(repository.findByName("Learn Azure"));
	}

}
