package com.rb.h2demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rb.h2demo.model.Employee;
import com.rb.h2demo.service.EmployeeService;


@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping()
	public String createEmployee(@RequestBody Employee employee) {
		employeeService.createNewUser(employee);
		return "employee created";
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeByID(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@GetMapping("/all")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}
	
}
