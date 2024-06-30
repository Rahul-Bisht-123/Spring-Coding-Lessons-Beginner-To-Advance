package com.Rb;

//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	public void service(HttpServletRequest req , HttpServletResponse res) {
		System.out.println("Hello from servlet");
	}
	
}