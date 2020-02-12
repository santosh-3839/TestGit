package com.common.retail.ProductService;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ProductServiceController {
	
	@Autowired
	private RestTemplate loadBalancedRestTemplate;
	
	@Autowired
	private LoadBalancerClient loadbalancer;
	
	@HystrixCommand(fallbackMethod = "reliable")
	
	@GetMapping("/product")
	public String product()
	{
		URI url=URI.create("http://localhost:8013/shop");
		ServiceInstance serviceInstance=loadbalancer.choose("SHOPINGCART_SERVICE");
		System.out.println("Which Port is it connecting to"+ "       "+serviceInstance.getUri());
		 //URI.create("http://localhost:8090/recommended");
		//String url="http://SHOPINGCART_SERVICE//shop";
		return this.loadBalancedRestTemplate.getForObject(url,String.class);
		
		//return "i am from product controller";
	}
	
	public String reliable() {
		  return "I am from Hytrix circuit Breaker";
		  }

}
