package com.rb.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rb.app.model.QuestionWrapper;
import com.rb.app.service.QuizService;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

	@Autowired
	private QuizService quizService;
	
	@GetMapping("/create")
	public ResponseEntity<String> createQuiz(
			@RequestParam String category,
			@RequestParam int numQ,
			@RequestParam String title) {
		
		return quizService.createQuiz(category,numQ,title);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable int id){
		return quizService.getQuizQuestions(id);
	}
}

