package com.common.retail.ProductService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}
	
	//@Configuration
	/*
	 * class ConfigProduct {
	 * 
	 * @LoadBalanced
	 * 
	 * @Bean public RestTemplate restTemplate() {
	 * 
	 * return new RestTemplate(); }
	 * 
	 * }
	 */
	
	/*
	 * @Bean(name = "restTemplate") RestTemplate restTemplate() { return new
	 * RestTemplate(); }
	 */

	    @Bean
	    @LoadBalanced
	    RestTemplate loadBalancedRestTemplate() {
	        return new RestTemplate();
	    }

}
