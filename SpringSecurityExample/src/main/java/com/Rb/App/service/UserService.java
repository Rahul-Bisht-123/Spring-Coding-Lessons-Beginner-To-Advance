package com.Rb.App.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.Rb.App.model.User;
import com.Rb.App.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	
	
	public User saveUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return repo.save(user);
	}
}
