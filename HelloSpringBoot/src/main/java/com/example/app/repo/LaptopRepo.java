package com.example.app.repo;

import org.springframework.stereotype.Repository;

import com.example.app.model.Laptop;


@Repository
public class LaptopRepo {
	
	public void saveLaptop(Laptop lap) {
		System.out.println("saved the laptop...");
	}

}
