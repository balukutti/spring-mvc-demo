package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController 
{

	// Need a controller Method to show the initial TML form
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	// new controller method to read form data 
	// add data to the model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model)
	{
		// read the request parameter from the HTML form
		String name = request.getParameter("studentName");
		
		// convert the name to upper case
		name = name.toUpperCase();
		
		// create the message
		String result = "Yo!  " + name;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDudeWithParamName(@RequestParam("studentName") String theName,  Model model)
	{
		// convert the name to upper case
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Hey My Friend from version 3!  " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}