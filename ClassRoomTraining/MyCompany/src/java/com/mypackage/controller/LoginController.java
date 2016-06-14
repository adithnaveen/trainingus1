package com.mypackage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/loginpage.html")
	public ModelAndView showLoginPage(){
		return new ModelAndView("loginpage");
	}
	
	
	
	@RequestMapping("/validatelogin.html")
	public ModelAndView 
		validateLogin(HttpServletRequest req, 
				HttpServletResponse resp){
		
		String uName = req.getParameter("uname");
		String password = req.getParameter("pass");
		
		if(uName.equals("lenovo") && password.equals("apple")){
			return new ModelAndView("successlogin", "message",
					"You logged in Successfully : " + uName );
		}
		
		return new ModelAndView("failurelogin", "message",
				"Invalid Login : " + uName );
	}
}







