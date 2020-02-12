package com.common.retail.ShopingCartService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class ShopingCartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopingCartServiceApplication.class, args);
	}

}
