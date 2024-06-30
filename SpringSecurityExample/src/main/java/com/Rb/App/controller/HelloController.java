package com.Rb.App.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

	@GetMapping("/")
	public String home(HttpServletRequest req) {
		return "Home Page";
	}
	@GetMapping("/about")
	public String about(HttpServletRequest req) {
		
		return "About Page";
	}
}