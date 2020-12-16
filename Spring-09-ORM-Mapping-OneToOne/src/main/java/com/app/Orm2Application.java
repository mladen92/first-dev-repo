package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Orm2Application {

	public static void main(String[] args) {
		SpringApplication.run(Orm2Application.class, args);
	}

	@PostConstruct
	public void dataInit() {

	}



}
