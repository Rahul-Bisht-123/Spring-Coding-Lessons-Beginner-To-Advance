package com.Rb.App;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Rb.App.model.Student;
import com.Rb.App.repo.StudentRepo;

@SpringBootApplication
public class SpringDataJpaExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaExampleApplication.class, args);
		
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
		
//		s1.setRoll_number(101);
//		s1.setName("Atul");
//		s1.setMarks(99);
//		
//		s2.setRoll_number(102);
//		s2.setName("Ben");
//		s2.setMarks(97);
		
		s3.setRoll_number(103);
		s3.setName("chen yang");
		s3.setMarks(999);
		
		StudentRepo studentRepo = context.getBean(StudentRepo.class);
//		studentRepo.save(s1);
//		studentRepo.save(s2);
//		studentRepo.save(s3);
		
//		System.out.println(studentRepo.findAll());
		
//		Optional<Student> s = studentRepo.findById(109);
//		System.out.println(s.orElse(new Student()));
		
//		System.out.println(studentRepo.findByName("Ben"));
//		System.out.println(studentRepo.findByMarks(98));
//		System.out.println(studentRepo.findByMarksEquals(99));
//		System.out.println(studentRepo.findByMarksGreaterThan(98));
//		System.out.println(studentRepo.findByMarksLessThan(99));
		
//		studentRepo.save(s3);
		studentRepo.delete(s3);
		
		
		
	}

}
