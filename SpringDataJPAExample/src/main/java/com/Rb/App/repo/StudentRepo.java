package com.Rb.App.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rb.App.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	

//     @Query("select s from student s where s.student_name = ?1")
	 List<Student> findByName(String name);
	 List<Student> findByMarks(int marks);
	 List<Student> findByMarksEquals(int marks);
	 List<Student> findByMarksGreaterThan(int marks);
	 List<Student> findByMarksLessThan(int marks);
}
