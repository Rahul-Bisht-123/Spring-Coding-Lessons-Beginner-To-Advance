package com.Rb.App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Rb.App.model.JobPost;
import com.Rb.App.service.JobService;

@RestController
public class JobPostRestController {
	
	@Autowired
	private JobService jobService;
	
	
	//get all job posts
	@GetMapping("/jobposts")
	public List<JobPost> getAllJobs() {
		return jobService.getAllJobPosts();
	}
	
	//get a single job post with id
	@GetMapping("/jobpost/{jobId}")
	public JobPost getJobPost(@PathVariable int jobId) {
		return jobService.getJobPost(jobId);
	}
	
	//get a single job post with id
	@DeleteMapping("/jobpost/{jobId}")
	public String deleteJobPost(@PathVariable int jobId) {
		jobService.deleteJobPost(jobId);
		return "Deleted Successfully";
	}
	
	//add a new job Post
	@PostMapping("/jobpost")
	public String addJobPost(@RequestBody JobPost jobPost) {
		jobService.addJobPost(jobPost);
		return "Added Successfully";
		
	}
	
	//add a new job Post
	@PutMapping("/jobpost")
	public String updateJobPost(@RequestBody JobPost jobPost) {
		jobService.updateJobPost(jobPost);
		return "Updated Successfully";
		
	}
	
	@GetMapping("/jobpost/keyword/{keyword}")
	public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword){
		return jobService.searchByKeyword(keyword);
	}
	
	@GetMapping("/load")
	public String loadData() {
		
		List<JobPost> jobs = new ArrayList<>(Arrays.asList(
	            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
	                    Arrays.asList("Core Java", "J2EE", "Spring Boot", "Hibernate")),
	            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
	                    Arrays.asList("HTML", "CSS", "JavaScript", "React")),
	            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
	                    Arrays.asList("Python", "Machine Learning", "Data Analysis")),
	            new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
	                    Arrays.asList("Networking", "Cisco", "Routing", "Switching"))
	    ));
		jobService.load(jobs);
		return "loaded dummy data";
	}
}