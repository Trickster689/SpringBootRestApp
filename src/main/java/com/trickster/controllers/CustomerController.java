package com.trickster.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trickster.models.Customer;

@RestController
public class CustomerController {
		
	@RequestMapping("/")
	 public String welcome() {
	 return "Welcome to Spring Boot Tutorials";
	 }
	 
	 @RequestMapping("/hello")
	 public String myData() {
	 return "Hello Spring Boot";
	 }
	 
	 @RequestMapping("/customer")
	 public Customer getCustomer(){
		 Customer customer = new Customer();
		 customer.setName("Jack");
		 customer.setCity("New York");
		 
		 return customer;
		 
	 }

}
				