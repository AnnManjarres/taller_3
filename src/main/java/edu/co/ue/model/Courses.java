package edu.co.ue.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.co.ue.model"})
public class Courses {

	public static void main(String[] args) {
		SpringApplication.run(Courses.class, args);

	}

}
