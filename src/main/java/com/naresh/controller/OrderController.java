package com.naresh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {

	@RequestMapping("/order")
	@ResponseBody
	  
	public String OrderDetails(){
		return "Order Created";
		
	}
}
