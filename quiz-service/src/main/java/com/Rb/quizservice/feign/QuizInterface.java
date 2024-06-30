package com.Rb.quizservice.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.Rb.quizservice.model.QuestionWrapper;
import com.Rb.quizservice.model.Response;



@FeignClient("QUESTION-SERVICE")
public interface QuizInterface {
	
	@GetMapping("api/question/generate")
	public ResponseEntity<List<Integer>> getQuestionsForQuiz(
			@RequestParam String categoryName,
			@RequestParam Integer numQuestions);
	
	
	@PostMapping("api/question/getquestions")
	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds);
	
	@PostMapping("api/question/getScore")
	public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses);

}