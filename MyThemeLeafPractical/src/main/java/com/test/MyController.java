package com.test;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
	
	
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String about(Model model)
	{
		
		//Putting Data in model
		model.addAttribute("name","Trupti Arade");
		model.addAttribute("currentDate",new Date().toLocaleString());
		return "about";
		
		
	}
	
	
	//handling Iteration
	@GetMapping("/example_loop")
	public String iterateHandler(Model m)
	{
		//create a list , set collection
		List<String> names = List.of("Trupti","Snehal","Shital","Madhuri","Mayuri","Ayesha");
		m.addAttribute("names",names);
		return "Iterate";
	}
	
	//handler for conditional statements
	@GetMapping("/condition")
	public String conditionHandler(Model m)
	{
		m.addAttribute("isActive", false);
		m.addAttribute("gender","F");
		
		List<Integer> list = List.of(45, 32, 19, 67, 88, 27);
		
		m.addAttribute("myList",list);
	
		return "condition";
	}
	
	
	//handler for including fragments
	@GetMapping("/service")
	public String serviceHandler(Model m)
	{
		return "service";
	}
	
	
}
