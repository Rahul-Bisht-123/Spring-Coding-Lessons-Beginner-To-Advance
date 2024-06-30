package com.Rb.quizservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Rb.quizservice.model.QuestionWrapper;
import com.Rb.quizservice.model.QuizDTO;
import com.Rb.quizservice.service.QuizService;



@RestController
@RequestMapping("/api/quiz")
public class QuizController {

	@Autowired
	private QuizService quizService;
	
	@GetMapping("/create")
	public ResponseEntity<String> createQuiz(@RequestBody QuizDTO quizDTO) {
		
		return quizService.createQuiz(
				quizDTO.getCategoryName(),
				quizDTO.getNumQ(),
				quizDTO.getTitle());
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable int id){
		return quizService.getQuizQuestions(id);
	}
}

