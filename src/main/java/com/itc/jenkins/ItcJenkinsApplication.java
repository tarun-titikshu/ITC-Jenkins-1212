package com.itc.jenkins;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class ItcJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(ItcJenkinsApplication.class);
	
	@PostConstruct
	public void myMethod() {
		logger.info("Application Started");
	}

	public static void main(String[] args) {
		SpringApplication.run(ItcJenkinsApplication.class, args);
	}

}
