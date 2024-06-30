package com.Rb.App.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

	private int student_roll_number;
	private String student_name;
	private int student_marks;

	public int getStudent_roll_number() {
		return student_roll_number;
	}

	public void setStudent_roll_number(int student_roll_number) {
		this.student_roll_number = student_roll_number;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getStudent_marks() {
		return student_marks;
	}

	public void setStudent_marks(int student_marks) {
		this.student_marks = student_marks;
	}

	@Override
	public String toString() {
		return "Student [student_roll_number=" + student_roll_number + ", student_name=" + student_name
				+ ", student_marks=" + student_marks + "]" + "\n";
		
	}

}
