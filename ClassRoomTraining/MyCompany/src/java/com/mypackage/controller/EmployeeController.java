package com.mypackage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mypackage.beans.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/employee.html")
	public ModelAndView employee(){
		return new ModelAndView("employee", "emp", new Employee());
	}
	
	
	@RequestMapping(value="addemployee.html", method=RequestMethod.POST)
	public String addEmployee(Employee employee, ModelMap modelMap){
		
		// you will get the employee object, you can CAll the dao 
		
		modelMap.addAttribute("empId", employee.getEmpId());
		modelMap.addAttribute("empName", employee.getEmpName());
		modelMap.addAttribute("age", employee.getAge());
		
		
		return "result";
	}
	
}
