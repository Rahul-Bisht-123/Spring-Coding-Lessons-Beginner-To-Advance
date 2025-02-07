package com.rb.h2demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rb.h2demo.model.Employee;
import com.rb.h2demo.repo.EmployeeRepo;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	
	public void createNewUser(Employee employee) {
		employeeRepo.save(employee);
	}
	
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}
	
	public Employee getEmployeeById(int id) {
		return employeeRepo.findById(id).orElse(new Employee());
	}
}
