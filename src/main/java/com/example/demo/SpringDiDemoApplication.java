package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.model.Account;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo", "come.example.model"})
public class SpringDiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext cont = SpringApplication.run(SpringDiDemoApplication.class, args);
		
		Person p1 = (Person)cont.getBean(Person.class);
		p1.getShow();
		
		Employee emp = cont.getBean(Employee.class);
		emp.setName("Mike");
		System.out.println("this employee nam is " + emp.getName());
		
		Account account = cont.getBean(Account.class);
	
	}
}
