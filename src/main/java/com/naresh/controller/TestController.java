package com.naresh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	  
	      //GET
	     @RequestMapping("/register")
	    @ResponseBody
	    public String userRegister() {
	    	return "UserRegistertion Successfully";
	    }
	             
	     //POST
	     
		  @RequestMapping("/login")
		   @ResponseBody
		   public String userLogin() {
			  return "UserLogin Successfully";
		  }
		  
		  
		  //PUT
		  
		  @RequestMapping("/operation")
		   @ResponseBody
		   public String userOperation() {
			  return "UserOperation Successfully";
		  }
}
