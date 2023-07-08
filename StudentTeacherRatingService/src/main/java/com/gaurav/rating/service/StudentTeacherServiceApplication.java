package com.gaurav.rating.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentTeacherServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentTeacherServiceApplication.class, args);
	}

}
