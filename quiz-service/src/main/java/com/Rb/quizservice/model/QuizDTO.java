package com.Rb.quizservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuizDTO {
	
	private String categoryName;
	private String title;
	private int numQ;
	
	

}
