package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootJenkinsWorkshopApplication {

	@RequestMapping("/")
	String home() {
		return "New My Hello World! ";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsWorkshopApplication.class, args);
	}
}
