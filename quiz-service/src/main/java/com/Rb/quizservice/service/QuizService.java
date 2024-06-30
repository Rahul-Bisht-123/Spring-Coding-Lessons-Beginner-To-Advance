package com.Rb.quizservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Rb.quizservice.feign.QuizInterface;
import com.Rb.quizservice.model.QuestionWrapper;
import com.Rb.quizservice.model.Quiz;
import com.Rb.quizservice.model.Response;
import com.Rb.quizservice.repo.QuizRepo;


@Service
public class QuizService {

	@Autowired
	private QuizRepo quizRepo;
	
	@Autowired
	private QuizInterface quizInterface;
	
	public ResponseEntity<String> createQuiz(String category , int numQ, String title) {
		
		List<Integer> questionIds = quizInterface.getQuestionsForQuiz(category, numQ).getBody();
		
		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestionIds(questionIds);
		
		quizRepo.save(quiz);
		return new ResponseEntity<>("success" , HttpStatus.CREATED);
	}

	
	
	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int id) {
		
		Quiz quiz = quizRepo.findById(id).get();
		List<Integer> questionIds = quiz.getQuestionIds();
		ResponseEntity<List<QuestionWrapper>> questionsFromId = quizInterface.getQuestionsFromId(questionIds);
		
		return questionsFromId;
	}

	
	
	public ResponseEntity<Integer> calculateResult(Integer id , List<Response> responses)
	{
		ResponseEntity<Integer> score = quizInterface.getScore(responses);
		
		return score; 
	}
	
	
}























