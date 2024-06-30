package com.rb.h2demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rb.h2demo.model.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
