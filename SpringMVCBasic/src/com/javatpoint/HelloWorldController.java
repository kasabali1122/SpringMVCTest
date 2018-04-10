package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/web")
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld(){
		String message="Hello ,how Are U";
		return new ModelAndView("test","message",message);
	}
	@RequestMapping("/hello2")
	public ModelAndView helloWorld1(){
		String message="Hello User";
		return new ModelAndView("test","message",message);
	}
	@RequestMapping("/hello3")
	public ModelAndView helloWorld2(){
		String message="HELLOOOOOOOOOOOOOO";
		
		return new ModelAndView("test","message",message);
	}
}
