package com.Rb.App.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Rb.App.model.Student;

@Repository
public class StudentRepo {
	
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void save(Student s) {
		String saveQuery = "insert into student_table (student_roll_number,student_name,student_marks) values (?,?,?)";
		int rowAffected = jdbcTemplate.update(saveQuery, s.getStudent_roll_number(),s.getStudent_name(),s.getStudent_marks());
		System.out.println(rowAffected + " Rows affected");
	}
	
	public List<Student> findAll(){
		String getAllQuery = "select * from student_table";
		
		return jdbcTemplate.query(getAllQuery, (rs,rowNum) -> {
			Student student = new Student();
			student.setStudent_roll_number(rs.getInt("student_roll_number"));
			student.setStudent_name(rs.getString("student_name"));
			student.setStudent_marks(rs.getInt("student_marks"));
			return student;
		});
	}
}