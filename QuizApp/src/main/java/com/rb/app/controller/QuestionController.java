package com.rb.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rb.app.model.Question;
import com.rb.app.service.QuestionService;

@RestController
@RequestMapping("/api")
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	
	@GetMapping("/allquestions")
	public List<Question> getAllQuestions() {
		return questionService.getAllQuestions();
	}
	
	@PostMapping("/allquestions")
	public String addQuestions(@RequestBody List<Question> questions) {
		questionService.saveAllQuestion(questions);
		 return "added list of questions";
	}
	
	@DeleteMapping("/allquestions")
	public String deleteAll() {
		questionService.deleteAll();
		return "all ids deleted";
	}
	
	
	@GetMapping("/question/{id}")
	public Question questions(@PathVariable("id") int id) {
		return questionService.getQuestions(id);
	}
	
	@PostMapping("/question")
	public String addQuestion(@RequestBody Question ques) {
		questionService.saveQuestion(ques);
		return "added question";
	}
	
	@DeleteMapping("/question/{id}")
	public String deleteByID(@PathVariable int id) {
		questionService.deleteByID(id);
		return "id " + id + " deleted";
	}
	
	@GetMapping("/question/category/{category}")
	public List<Question> getQuestionByCategory(@PathVariable("category") String category) {
		return questionService.getQuestionsByCategory(category);
	}
	
	
	
}