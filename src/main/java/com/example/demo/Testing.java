package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Testing {
	
	private static final Logger logger = LoggerFactory.getLogger(Testing.class);
	
	public static void main(String[] args) {
		logger.info("Testing SpringBootApplication started");
		SpringApplication.run(Testing.class, args);
	}

}
