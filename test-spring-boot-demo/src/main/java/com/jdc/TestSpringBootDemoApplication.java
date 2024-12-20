package com.jdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringBootDemoApplication.class, args);
		
		System.out.println("hello");
	}

}
