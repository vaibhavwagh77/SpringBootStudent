package com.winabale.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.winabale.sms.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	//display the list of student
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("ListStudent",studentService.getAllstudent());
		return "index";
		
	}

}
