package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "Hello Spring boot App running...";
	}
	
	@GetMapping("/shr")
	public String name() {
		return "Hello Shaheer khan";
	}
	@GetMapping("/shr/add")
	public String add() {
		return "Saidpur";
	}

}