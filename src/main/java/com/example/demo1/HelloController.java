package com.example.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value( "${spring.application.name}")
    private String envValue;

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot Ozera! " + envValue;
	}

}