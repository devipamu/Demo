package com.example.productService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {
	@Autowired
	public  String getProducts() {
		System.out.println("Hi");
		return "Insurance product";
		}
	public String saveProducts() {
		return "Products saved";
	}
}

