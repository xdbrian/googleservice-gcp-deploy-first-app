package com.talk2amareswaran.projects.googleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoogleserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleserviceApplication.class, args);
	}
	
	@RequestMapping(value="/firstapp")
	public String firstApp() {
		return "My Google Service is working fine in GCP Environment";
	}
}
