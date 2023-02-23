package com.example.demo;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class colour {
	public String colour="blue";
	@GetMapping("/")
	public String message()
	{
//		return "NewFile.jsp";
		return "colour is "+colour+"!";
		
	}
	
	

}
