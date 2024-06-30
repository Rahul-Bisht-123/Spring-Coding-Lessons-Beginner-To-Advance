package com.Rb.SpringJavaBasedConfig;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Desktop implements Computer{
	
	int cost;
	
	public Desktop() {
		System.out.println("Desktop object created..");
	}

	public void compile() {
		System.out.println("compiling using desktop...");
	}

}
