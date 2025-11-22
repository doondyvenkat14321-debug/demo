
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class controller {
@Autowired
userservice rss;
	
	@RequestMapping("/register")
	public String ok() {
		return "registation";
					
		}
	
	@RequestMapping(path="user/register",method=RequestMethod.POST)
	public ModelAndView okra(HttpServletRequest req) {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pasword=	req.getParameter("passw");
		String mobile=	req.getParameter("mobile");
		rss.user(name,  email, pasword, mobile);
		System.out.println(name); 
		System.out.println(email); 
		System.out.println(pasword);
		System.out.println(mobile); 
		
		
		 ModelAndView  mv = new  ModelAndView();
		 mv.setViewName("result");
		 mv.addObject("email","user registration success for" +email);
		
     return mv;
    		 

	
}
	
}
