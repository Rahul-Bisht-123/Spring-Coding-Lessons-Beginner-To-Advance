package com.rb.question_service.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rb.question_service.model.Question;



@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer>{

	public List<Question> findByCategory(String category);
	
	@Query(value = "SELECT q.id FROM question q WHERE q.category = :category ORDER BY RANDOM() LIMIT :numQ" , nativeQuery = true)
	public List<Integer> findRandomQuestionsByCategory(String category, int numQ);
}
