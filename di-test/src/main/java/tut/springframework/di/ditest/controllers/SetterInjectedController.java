package tut.springframework.di.ditest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tut.springframework.di.ditest.services.GreetingService;

@Controller
public class SetterInjectedController {

	private GreetingService greetingService;
	
	@Autowired
	public void setGreetingService (GreetingService greetingService){
		this.greetingService = greetingService;
	}
	
	public String hello(){
		return greetingService.greet();
	}
	
}
