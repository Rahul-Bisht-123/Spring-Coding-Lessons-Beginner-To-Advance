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
	
	public void addJobPost(JobPost jobPost) {
		jobrepo.save(jobPost);
	}
	
	public void deleteJobPost(int jobId) {
		jobrepo.deleteById(jobId);
	}
	
	public void updateJobPost(JobPost jobPost) {
		jobrepo.save(jobPost);
	}
	
	public List<JobPost> getAllJobPosts() {
		return jobrepo.findAll();
	}
	
	public JobPost getJobPost(int id) {
		return jobrepo.findById(id).orElse(new JobPost());
	}
	
	public List<JobPost> searchByKeyword(String keyword) {
		return jobrepo.findByPostDescContainingOrPostProfileContaining(keyword, keyword);
	}
	
	
	public void load(List<JobPost> jobs) {
		jobrepo.saveAll(jobs);
	}
	
}