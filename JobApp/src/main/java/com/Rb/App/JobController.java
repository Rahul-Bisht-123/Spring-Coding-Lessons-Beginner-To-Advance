package com.Rb.App;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Rb.App.model.JobPost;
import com.Rb.App.service.JobService;

@Controller
public class JobController {
	
	@Autowired
	private JobService jobService;
	
	@GetMapping({"/" , "/home"})
	public String home() {
		return "home";
	}
	
	@GetMapping("/addjob")
	public String addJob() {
		return "addjob";
	}
	
	@GetMapping("/viewalljobs")
	public String viewAllJobs(Model model) {
        model.addAttribute("jobPosts", jobService.getAllJobs());
        return "viewalljobs";
    }
	
	@PostMapping("/handleForm")
	public String handleForm(JobPost jobPost) {
		jobService.addJob(jobPost);
		return "success";
	}

}