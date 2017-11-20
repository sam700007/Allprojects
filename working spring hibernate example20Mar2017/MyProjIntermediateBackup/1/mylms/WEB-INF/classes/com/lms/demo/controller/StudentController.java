package com.lms.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.lms.demo.model.CourseModel;
import com.lms.demo.model.StudentModel;
import com.lms.demo.service.StudentService;


@Controller
@RequestMapping("/student-register")
@SessionAttributes("student")
public class StudentController
{
	@Autowired
	StudentService studentService;
	
	/**
	 * Method will be called in initial page load at GET /employee-module
	 * */
	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) 
	{
		StudentModel studentVO = new StudentModel();
		model.addAttribute("student", studentVO);
		return "registerStudentView";
	}
	
	/**
	 * Method will be called on submitting add employee form POST /employee-module
	 * */
	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("student") StudentModel studentVO,@ModelAttribute("courseModel") CourseModel courseModelVo,
			BindingResult result, SessionStatus status) {
	System.out.println("StudentController"+studentVO);
	System.out.println("courseModelVo :"+courseModelVo);
		boolean addEmployee=this.studentService.saveEmployee(studentVO);
		status.setComplete();
		return "redirect:/student-register/";
	}

}