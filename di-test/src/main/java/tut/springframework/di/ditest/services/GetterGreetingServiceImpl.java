package tut.springframework.di.ditest.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class GetterGreetingServiceImpl implements GreetingService {

	public String greet() {
		return "GetterGreetingServiceImpl - bienvenido al servicio de saludo";
	}

}
