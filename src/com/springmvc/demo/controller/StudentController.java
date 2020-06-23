package com.springmvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.demo.model.StudentDetails;

@Controller
@RequestMapping("student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showStudentForm(Model theModel) {
		StudentDetails theStudent = new StudentDetails();
		theModel.addAttribute("student", theStudent);
		return "student-data";
	}
	
	@RequestMapping("/processData")
	public String getStudentDetails(@ModelAttribute("student") StudentDetails theStudent, Model theModel) {
		System.out.println(theStudent.toString());
		return "student-form";
		
	}
}
