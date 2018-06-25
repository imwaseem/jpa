package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) { 
		System.out.println("function call 1");
		 ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(DemoApplication.class, args);
		 System.out.println("function call 2");
	        EmploeeController ec = configurableApplicationContext.getBean(EmploeeController.class);
	        System.out.println("function call 3");
	         ec.findAll();
	}
}
