package tut.springframework.di.ditest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tut.springframework.di.ditest.services.GreetingService;

@Controller	
public class PropertyInjectedController {

	@Autowired
	private GreetingService greetingService;
	
	public String hello(){
		return greetingService.greet();
	}
	
	public GreetingService geGreetingService(){
		return greetingService;
	}
	
}
