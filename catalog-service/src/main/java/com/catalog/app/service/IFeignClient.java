package com.catalog.app.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.catalog.app.dto.Product;

@Service
@FeignClient(name="product-service")
public interface IFeignClient{

	@PostMapping("/Product/api/addProduct")
	public Product addProduct(@RequestBody Product product);

	@GetMapping("/Product/api/getAllProduct")
	public List<Product>getAllProduct();


}
