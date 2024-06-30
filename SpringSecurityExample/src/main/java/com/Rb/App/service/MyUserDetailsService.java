package com.Rb.App.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Rb.App.model.User;
import com.Rb.App.model.UserPrincipal;
import com.Rb.App.repo.UserRepo;


@Service
public class MyUserDetailsService implements UserDetailsService{
	
	
	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = repo.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("User not found....");
		}
		
		return new UserPrincipal(user);
	}

}
