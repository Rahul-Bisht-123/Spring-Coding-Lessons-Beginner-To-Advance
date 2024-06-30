package com.Rb.App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rb.App.model.JobPost;
import com.Rb.App.repo.JobRepo;

@Service
public class JobService {

	@Autowired
	private JobRepo jobrepo;
	
	public void addJob(JobPost jobPost) {
		jobrepo.save(jobPost);
	}
	
	public List<JobPost> getAllJobs() {
		return jobrepo.findAll();
	}
	
}