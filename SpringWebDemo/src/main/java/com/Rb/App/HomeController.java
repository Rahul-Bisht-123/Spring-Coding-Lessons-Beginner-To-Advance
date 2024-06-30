package com.Rb.App;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;

@Controller 
public class HomeController {

	@GetMapping("/")
	public String Home() {
		return "index";
	}
	
	@GetMapping("/alienForm")
	public String alienForm() {
		return "alienForm";
	}
	
	@GetMapping("/addAlien")
	public String addAlien(Alien alien) {
		return "welcomeAlien";
	}
	
	@ModelAttribute("dayNumber")
	public String dayNumer() {
		return "24";
	}
	
//	@GetMapping("/add")
//	public String add(@RequestParam("num1")int param1,@RequestParam("num2")int param2, HttpSession session) {
//		int result = param1 + param2;
//		session.setAttribute("result", result);
//		return "result.jsp";
//	}
	
//	@GetMapping("/add")
//	public String add(@RequestParam("num1")int param1,@RequestParam("num2")int param2, Model model) {
//		int result = param1 + param2;
//		model.addAttribute("result", result);
////		session.setAttribute("result", result);
//		return "result";
//	}
	@GetMapping("/add")
	public ModelAndView add(@RequestParam("num1")int param1,@RequestParam("num2")int param2, ModelAndView mv) {
		int result = param1 + param2;
		mv.addObject("result", result);
		mv.setViewName("result");
		return mv;
	}
}
