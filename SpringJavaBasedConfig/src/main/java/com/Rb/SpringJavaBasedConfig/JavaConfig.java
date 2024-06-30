package com.Rb.SpringJavaBasedConfig;

//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.Rb.SpringJavaBasedConfig")
public class JavaConfig {
	
	
//	@Bean(name = "desktopBean")
//	@Scope("prototype")
//	public Desktop desktop() {
//		return new Desktop();
//	}
//	
//	@Bean(name = "laptopBean")
//	@Scope("prototype")
////	@Primary
//	public Laptop laptop() {
//		return new Laptop();
//	}
//	
//	@Bean(name = "coderBean")
//	@Scope("prototype")
//	public Coder coder(@Qualifier("desktopBean")Computer comp) {
//		Coder obj = new Coder();
//		comp.compile();
//		return obj;
//	}
}
