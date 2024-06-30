package com.Rb.App;

import java.util.List;

//import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Rb.App.model.Student;
import com.Rb.App.service.StudentService;

@SpringBootApplication
public class SpringJdbcAndH2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcAndH2Application.class, args);
		Student std1 = context.getBean(Student.class);
		std1.setStudent_roll_number(105); 
		std1.setStudent_name("Eli");
		std1.setStudent_marks(999);
		
		StudentService studentService = context.getBean(StudentService.class);
//		studentService.saveStudent(std1);
		
		List<Student> stu_list = studentService.getAllStudents();
		System.out.println(stu_list);

	}

}