package com.rb.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rb.app.model.Question;
import com.rb.app.model.QuestionWrapper;
import com.rb.app.model.Quiz;
import com.rb.app.model.Response;
import com.rb.app.repo.QuestionRepo;
import com.rb.app.repo.QuizRepo;

@Service
public class QuizService {

	@Autowired
	private QuizRepo quizRepo;
	
	@Autowired
	private QuestionRepo questionRepo;
	
	public ResponseEntity<String> createQuiz(String category, 
											 int numQ, 
											 String title) {
		
		List<Question> questions = questionRepo
									.findRandomQuestionsByCategory(category , numQ);
		
		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestions(questions);
		
		quizRepo.save(quiz);
		return new ResponseEntity<>("success" , HttpStatus.CREATED);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int id) {
		
		Optional<Quiz> quiz = quizRepo.findById(id);
		List<Question> questionsFromDB = quiz.get().getQuestions();
		ArrayList<QuestionWrapper> questionForUser = new ArrayList<>();
		
		for(Question q : questionsFromDB) {
			QuestionWrapper qw = new QuestionWrapper(
					q.getId(),
				    q.getQuestionTitle(),
					q.getOption1(),
					q.getOption2(),
					q.getOption3(),
					q.getOption4());
			
			questionForUser.add(qw);
		}
		
		return new ResponseEntity<>(questionForUser, HttpStatus.OK);
		
	}

	public ResponseEntity<Integer> calculateResult(Integer id , List<Response> responses)
	{
		Quiz quiz = quizRepo.findById(id).get();
		List<Question> questions = quiz.getQuestions();
		
		int right = 0;
		int i = 0;
		
		for(Response response : responses) {
			if(response.getResponse().equals(questions.get(i).getRightAnswer()))
				{right++;}
				
			i++;
		}
		
		return new ResponseEntity<Integer>(right, HttpStatus.OK); 
	}
}























