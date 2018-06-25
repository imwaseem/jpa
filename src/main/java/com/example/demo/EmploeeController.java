package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmploeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public void findAll(){
		System.out.println("print");
		for(EmployeeModel em : employeeRepository.findAll()){
			System.out.println(em.ename);
		}
	}
}
