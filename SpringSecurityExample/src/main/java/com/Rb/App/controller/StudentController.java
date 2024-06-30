package com.Rb.App.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Rb.App.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

	List<Student> students = new ArrayList<>(
			List.of(
					new Student(1,"aman","java"),
					new Student(2,"bob","python"),
					new Student(3,"aman","spring")
					));
	
	
	@GetMapping("/students")
	public List<Student> findAll() {
		return students;
	}
	
	@GetMapping("/token")
	public CsrfToken getToken(HttpServletRequest req) {
		return (CsrfToken) req.getAttribute("_csrf");
	}
	
	
	@PostMapping("/students")
	public String addStudent(@RequestBody Student student) {
		students.add(student);
		return "added";
	}
}