package com.naveen.controller;

/*import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")

public class HelloWorld {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView helloWorld() {
		String message = "Welcome Naveen";
		// return new ModelAndView("welcome", "message", message);

		// first param : view name
		// Second param : Model Name
		// Third Param :Data Object
		
		System.out.println("Called controller ");
		
		return new ModelAndView("hello", "message", "message");
	}
}
*/



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
public class HelloWorld{
 
   @RequestMapping(value="/hello", method = RequestMethod.GET)
   public String printHello(ModelMap model) {
	   
	   String message = "Welcome to Spring MVC";
		// return new ModelAndView("welcome", "message", message);
		
		// first param : view name 
		// Second param : Model Name 
		// Third Param :Data Object 
	   
	   
	   
	   
	   
      model.addAttribute("message", message);

      return "hello";
      // /WEB-INF/jsp/hello.jsp
   }

}