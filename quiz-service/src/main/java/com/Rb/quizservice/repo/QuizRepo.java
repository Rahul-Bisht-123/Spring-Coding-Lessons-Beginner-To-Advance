package com.Rb.quizservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rb.quizservice.model.Quiz;



@Repository
public interface QuizRepo extends JpaRepository<Quiz, Integer>{

	
}
