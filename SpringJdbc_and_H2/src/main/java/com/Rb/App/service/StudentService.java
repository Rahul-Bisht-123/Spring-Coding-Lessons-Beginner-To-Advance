package com.Rb.App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rb.App.model.Student;
import com.Rb.App.repository.StudentRepo;

@Service
public class StudentService {
	
	private StudentRepo studentRepo;
	
	
	public StudentRepo getStudentRepo() {
		return studentRepo;
	}

	@Autowired
	public void setStudentRepo(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}
	
	public void saveStudent(Student s) {
		studentRepo.save(s);
	}

	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

}
