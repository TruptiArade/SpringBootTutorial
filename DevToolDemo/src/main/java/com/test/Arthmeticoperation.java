package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Arthmeticoperation {
	
   @RequestMapping("/Arithmetic")
	public String Addition()
	{	
	   int a=90;
	   int b=78;
	   return "Addition is:" +(a+b) +  " Substraction:"+(a-b)  + "Multiplication:"+ (a*b) +  "Division:"+ (a/b);
	   
	}
   
   
   }
