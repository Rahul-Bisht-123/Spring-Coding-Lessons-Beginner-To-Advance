package com.Rb.SpringJavaBasedConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Coder {
	
	@Value("66")
	int age;
	
	@Autowired
//	@Qualifier("desktop")
	Computer comp;
	
	public Coder() {
		System.out.println("Coder object created..");
	}


	public void code() {
		comp.compile();
	}
	
}