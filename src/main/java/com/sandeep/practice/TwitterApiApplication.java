package com.sandeep.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sandeep.practice.annotation.Loggable;

@SpringBootApplication
public class TwitterApiApplication {

	@Loggable
	public static void main(String[] args) {
		SpringApplication.run(TwitterApiApplication.class, args);
	}

}

