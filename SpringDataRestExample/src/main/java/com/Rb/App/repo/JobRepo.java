package com.Rb.App.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rb.App.model.JobPost;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer>{}