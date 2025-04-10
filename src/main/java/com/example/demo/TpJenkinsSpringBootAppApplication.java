package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpJenkinsSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpJenkinsSpringBootAppApplication.class, args);
		System.out.println("IT is a continuous integration job");
	}

}
