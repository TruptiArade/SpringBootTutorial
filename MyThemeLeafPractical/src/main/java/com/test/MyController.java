package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
	
	//http://localhost:8080/about
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String about()
	{
		return "about";
		//about.html
	}
}
