package com.springboot1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MyTestController {
	
	@RequestMapping("/test")
	@ResponseBody
	
	public String demo()
	{
		return "Hello Trupti";
	}
	
	

}
