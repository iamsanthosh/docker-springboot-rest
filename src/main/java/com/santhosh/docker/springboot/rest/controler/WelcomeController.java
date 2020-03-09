package com.santhosh.docker.springboot.rest.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping(path="/")
	public String greet() {
		return "Welcome to docker-springboot-rest project hosted in AWS Docker environment";
	}
}
