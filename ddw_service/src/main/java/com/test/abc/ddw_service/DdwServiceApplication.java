package com.test.abc.ddw_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class DdwServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DdwServiceApplication.class, args);
	}

}
