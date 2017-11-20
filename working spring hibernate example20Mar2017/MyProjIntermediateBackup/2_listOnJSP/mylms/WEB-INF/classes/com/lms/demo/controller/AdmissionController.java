package com.lms.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.lms.demo.model.DepartmentEntity;
import com.lms.demo.model.StudentModel;
import com.lms.demo.service.StudentService;

@Controller
public class AdmissionController {
	
	@Autowired
	StudentService studentService;
	
	/*@RequestMapping(value="/admissionsucess",method = RequestMethod.GET)
	public String setupForm(Model model) 
	{
		System.out.println("GET-------admissionsucess");
		StudentModel studentVO = new StudentModel();
		model.addAttribute("student", studentVO);
		return "admissionsucess";
	}*/
	
	/*@ModelAttribute("allDepartments")
    public List<DepartmentEntity> populateDepartments() 
    {
        List<DepartmentEntity> departments = studentService.getAllDepartments();
        for(DepartmentEntity dd:departments)
        {
        	System.out.println("DepartmentEntity:"+dd.getName()+ dd.getId());
        }
 
        return departments;
    }*/

	@RequestMapping(value="/admissionsucess",method = RequestMethod.GET)
	//@ModelAttribute("allStudents")
	public ModelAndView  getAllRegisteredStudents(Model model) 
	{
		List<StudentModel> studentData = studentService.getAllRegisteredStudents();
		
		//model.addAttribute("allStudents", studentData);
		//return "admissionsucess";
		//return new ModelAndView("admissionsucess","allStudents", studentData);
		ModelAndView model1 = new ModelAndView("admissionsucess");
		model1.addObject("allStudents", studentData);

		return model1;
	}
	
	/*ModelAndView model = new ModelAndView("index");
	model.addObject("lists", list);

	return model;*/
	
}
