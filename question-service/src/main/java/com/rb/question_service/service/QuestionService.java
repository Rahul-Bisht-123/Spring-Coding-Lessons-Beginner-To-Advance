package com.rb.question_service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rb.question_service.model.Question;
import com.rb.question_service.model.QuestionWrapper;
import com.rb.question_service.model.Response;
import com.rb.question_service.repo.QuestionRepo;

@Service
public class QuestionService {

	@Autowired
	QuestionRepo questionRepo;

	
	public List<Question> getAllQuestions() {
		return questionRepo.findAll();
	}

	
	public Question getQuestionById(int id) {
		return questionRepo.findById(id).orElse(new Question());
	}

	
	public List<Question> getQuestionsByCategory(String category) {
		return questionRepo.findByCategory(category);
	}

	
	public void saveQuestion(Question ques) {
		questionRepo.save(ques);
	}

	
	public void saveAllQuestion(List<Question> questions) {
		questionRepo.saveAll(questions);
	}

	
	public void deleteByID(int id) {
		questionRepo.deleteById(id);
	}

	
	public void deleteAll() {
		questionRepo.deleteAll();
	}

	
	public ResponseEntity<List<Integer>> getQuestionsForQuiz(String categoryName, Integer numQuestions) {
		List<Integer> questions = questionRepo.findRandomQuestionsByCategory(categoryName, numQuestions);
		return new ResponseEntity<>(questions, HttpStatus.OK);
	}

	
	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Integer> questionIds) {

		List<QuestionWrapper> wquestions = new ArrayList<>();
		List<Question> questions = new ArrayList<>();

		for (Integer id : questionIds) {

			questions.add(questionRepo.findById(id).get());
		}

		for (Question q : questions) {
			QuestionWrapper wq = new QuestionWrapper(
					q.getId(),
					q.getQuestionTitle(),
					q.getOption1(),
					q.getOption2(),
					q.getOption3(),
					q.getOption4());
			
			wquestions.add(wq);
		}

		return new ResponseEntity<List<QuestionWrapper>>(wquestions, HttpStatus.OK);
	}
	

	public ResponseEntity<Integer> getScore(List<Response> responses) {

		int right = 0;

		for (Response response : responses) {
			Question question = questionRepo.findById(response.getId()).get();
			if (response.getResponse().equals(question.getRightAnswer())) {
				right++;
			}
		}

		return new ResponseEntity<Integer>(right, HttpStatus.OK);
	}
}
