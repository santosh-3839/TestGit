package com.common.retail.ShopingCartService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopingCartController {
	
	@GetMapping("/shop")
	public String shop()
	{
		return "I am from Shop Cart Service";
	}

}
