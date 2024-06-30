package com.Rb.App.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rb.App.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	User findByUsername(String username);
}
