package tut.springframework.di.ditest.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	public String hello(){
		System.out.println("MyController - Hello dear!!!");
		return "foo";
	}

}
