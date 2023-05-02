package com.example.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/")
public class HelloController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	private final AppConfig appConfig;
	
	public HelloController(AppConfig appConfig) {
		this.appConfig = appConfig;
	}
	
	@GetMapping
	public String hello() {
		String message = "Hello World! from app id: " + appConfig.getId();
		
		logger.info(message);
		return message + "\n";
	}
}
