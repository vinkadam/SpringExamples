package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greeting")
public class HelloController {

	@RequestMapping("/hello/{userName}/{country}")
	public ModelAndView helloWorld(@PathVariable("userName") String userName, @PathVariable("country") String country) {
		
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("msg","Hello!! This is " + userName + ". From " + country + " country" );
		return modelAndView;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hioWorld() {
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("msg","Hello!! This is hi.");
		return modelAndView;
	}

}
