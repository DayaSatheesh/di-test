package tut.springframework.di.ditest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import tut.springframework.di.ditest.controllers.ConstructorInjectedController;
import tut.springframework.di.ditest.controllers.MyController;
import tut.springframework.di.ditest.controllers.PropertyInjectedController;
import tut.springframework.di.ditest.controllers.SetterInjectedController;

@SpringBootApplication
public class DiTestApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiTestApplication.class, args);
		MyController ctrller = (MyController)ctx.getBean("myController");
		ctrller.hello();
		
		PropertyInjectedController propCtroller = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(propCtroller.hello());
		System.out.println(propCtroller.getGreetingService().getClass().getName());
		
		SetterInjectedController setterCtroller = (SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(setterCtroller.hello());
		
		ConstructorInjectedController conCtroller = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(conCtroller.hello());

	}

}
