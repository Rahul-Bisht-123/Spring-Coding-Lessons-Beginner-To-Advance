package com.example.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.model.Laptop;
import com.example.app.repo.LaptopRepo;


@Service
public class LaptopService {
	
	@Autowired
	LaptopRepo rep;
	
	public void addLaptop(Laptop lap) {
		rep.saveLaptop(lap);
	}

}
