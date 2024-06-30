package com.Rb.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
    	
        Alien alien1 = (Alien) con.getBean("AlienBean");
        System.out.println(alien1.getAge());
        
        
//        Alien alien2 = (Alien) con.getBean("AlienBean");
//        System.out.println(alien2.age);
        
        
        alien1.code();
        
        ((ConfigurableApplicationContext) con).close();
    }
}
