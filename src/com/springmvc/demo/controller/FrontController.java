package com.springmvc.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrontController {
		
	@RequestMapping("/")
	public String getMainMenuPage() {
		return "main-menu";
	}
	
	@RequestMapping("/showForm")
	public String showMainMenuPage() {
		return "show-form";
	}
	
	@RequestMapping("/processForm")
	public String processMainMenuPage() {
		return "process-form";
	}
	
	@RequestMapping("/processFormData")
	public String processMainMenuPageData(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		String message = "Hello "+ name.toUpperCase();
		model.addAttribute("message",message);		
		return "process-form";
	}
	
	@RequestMapping("/processFormDatav1")
	public String processMainMenuPageDatav1(@RequestParam("studentName") String theName, Model model) {
		theName = "Hello "+ theName.toUpperCase();
		model.addAttribute("message",theName);
		return "process-form";
	}

}

