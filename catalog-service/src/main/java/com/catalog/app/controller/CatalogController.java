package com.catalog.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalog.app.dto.Product;
import com.catalog.app.service.IFeignClient;

@RestController
@RequestMapping("/api")
public class CatalogController {
	@Autowired
	private IFeignClient feignClient;
	
	@GetMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		feignClient.addProduct(product);
		return product;
	}
	
	@GetMapping("getAllProduct")
	public List<Product> getAllProduct(){
		return feignClient.getAllProduct();
	}

}
