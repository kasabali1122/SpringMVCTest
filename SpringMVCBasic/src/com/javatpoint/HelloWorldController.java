package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/web")
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld(){
		String message="Hello Spring MVC how r u";
		return new ModelAndView("hellopage","message",message);
	}
	@RequestMapping("/kemal")
	public ModelAndView helloWorld1(){
		String message="Hello kemal";
		return new ModelAndView("hellopage","message",message);
	}
	@RequestMapping("/getName")
	public ModelAndView helloWorld2(){
		String message="KEMAL";
		
		return new ModelAndView("index","message",message);
	}
}
