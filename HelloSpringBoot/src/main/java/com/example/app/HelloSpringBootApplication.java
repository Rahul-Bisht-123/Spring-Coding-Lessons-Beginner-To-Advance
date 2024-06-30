package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.app.model.Laptop;
import com.example.app.service.LaptopService;

@SpringBootApplication
public class HelloSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(HelloSpringBootApplication.class, args);
		
		
		LaptopService laptopService = con.getBean(LaptopService.class);
		Laptop laptop = con.getBean(Laptop.class);

		laptopService.addLaptop(laptop);
		
	}

}
