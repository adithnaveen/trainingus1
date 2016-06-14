package com.mypackage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
public class HelloController{
 
   @RequestMapping(value="/hello", method = RequestMethod.GET)
   public String helloWorld(ModelMap model) {
	   
	   String message = "Welcome to Spring MVC";

      model.addAttribute("message", message);

      return "hello";
      // /WEB-INF/jsp/hello.jsp
      
      // return new ModelAndView("hello", "message", message);
   }

}