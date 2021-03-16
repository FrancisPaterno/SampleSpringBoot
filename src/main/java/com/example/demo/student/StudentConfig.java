package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args ->{
			Student mariam = new Student("Francis Paterno", "francis.paterno@gmail.com", LocalDate.of(1987,Month.JANUARY,14));
			Student alex = new Student("Alex Constantino", "alex.constantino@gmail.com", LocalDate.of(1957,Month.AUGUST,25));
			repository.saveAll(List.of(mariam,alex));
		};
		
	}
}
