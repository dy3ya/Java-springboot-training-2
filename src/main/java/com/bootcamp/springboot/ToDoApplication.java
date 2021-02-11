package com.bootcamp.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@ConfigurationProperties(prefix = "com.bootcamp.springboot")
public class ToDoApplication {

		public static void main(String[] args) {

		SpringApplication.run(ToDoApplication.class, args);
	}

}
