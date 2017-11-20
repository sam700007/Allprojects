package net.ShRaam.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello(Model model) {
		
		model.addAttribute("fname", "Arun");
		model.addAttribute("mname", "Arun S");
		model.addAttribute("lname", "Arun S");

		return "welcome";//name of JSP
	}
	
	@RequestMapping(value = "/auth/Home")
    public ModelAndView RedirectLogin() {
        return new ModelAndView("welcome","fname", "Alex");
    }
}

