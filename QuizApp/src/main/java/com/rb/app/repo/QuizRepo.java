package com.rb.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rb.app.model.Quiz;

@Repository
public interface QuizRepo extends JpaRepository<Quiz, Integer>{

	
}
