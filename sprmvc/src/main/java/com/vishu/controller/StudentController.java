package com.vishu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.vishu.service.StudentManager;

@Controller
public class StudentController {
	@Autowired
	StudentManager manager;
	
@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getallstudents(Model model)
	{
		model.addAttribute("students", manager.getallstudents());
		return "Studentdetails";
	}

/*@RequestMapping(value = "/")
public String myHome()
{
	return "home";
}*/
}
