package tut.springframework.di.ditest.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

	public String greet() {
		
		return "GreetingServiceImpl - Greeting to all learning spring :)";
	}
	
	

}
