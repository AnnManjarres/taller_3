package edu.co.ue.model;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	Course course;
	
	@PostConstruct
	public void init() {
		course = new Course();
	}
	
	@GetMapping(value="course", produces=MediaType.APPLICATION_JSON_VALUE)
	public Course getCourse() {
		return new Course("JavaScript", 20.0, 10.0, 24);
		
	}
	
	@GetMapping(value="courses", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Course> getCourses() {
		return course.myListCourses();
	}
	
	@GetMapping(value="courses/{name}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Course> searchCourse(@PathVariable("name") String name) {
		return course.searchCourses(name);
	}
	
	@DeleteMapping(value="course/{name}")
	public List<Course> deleteCourse(@PathVariable("name") String name) {
		return course.deleteCourse(name);
	}
	
	@PostMapping(value="course", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Course> postCourse(@RequestBody Course c) {
		return course.postCourse(c);
		
	}
	

}
