package com.rb.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rb.app.model.Question;
import com.rb.app.repo.QuestionRepo;

@Service
public class QuestionService {

	@Autowired
	QuestionRepo questionRepo;
	
	
	public List<Question> getAllQuestions() {
		return questionRepo.findAll();
	}
	
	public Question getQuestions(int id) {
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
}
