package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLombokApplication.class, args);
		Student s = new Student(1,"kanchan",1000.00);
		
		Employee e = new Employee(1,"vicky",5000.00);
		
		System.out.println(s.getName());
		System.out.println(e.getSalary());
		
		System.out.print("name of employee "+ e.getName());
	}

}
