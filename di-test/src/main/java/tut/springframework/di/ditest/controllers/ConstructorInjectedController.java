package tut.springframework.di.ditest.controllers;

import org.springframework.stereotype.Controller;

import tut.springframework.di.ditest.services.GreetingService;

@Controller
public class ConstructorInjectedController {
	
	private GreetingService greetingService;
	
	public ConstructorInjectedController(GreetingService greetingService){
		this.greetingService = greetingService;
	}
	
	public String hello(){
		return greetingService.greet();
	}

}
