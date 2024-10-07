package com.example.virtual_classroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com")
@SpringBootApplication
public class VirtualClassroomApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualClassroomApplication.class, args);
	}

}
