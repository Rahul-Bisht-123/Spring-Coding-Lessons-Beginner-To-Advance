package com.Rb.App.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rb.App.model.JobPost;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer>{
	
	 }
	


//private List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//        new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
//                Arrays.asList("Core Java", "J2EE", "Spring Boot", "Hibernate")),
//        new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
//                Arrays.asList("HTML", "CSS", "JavaScript", "React")),
//        new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
//                Arrays.asList("Python", "Machine Learning", "Data Analysis")),
//        new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
//                Arrays.asList("Networking", "Cisco", "Routing", "Switching"))
//));
//
//
//// method to return all JobPosts
//public List<JobPost> returnAllJobPosts() {
//	return jobs;
//}
//
//// method to save a job post object into arrayList
//public void addJobPost(JobPost job) {
//	jobs.add(job);
//
//}
