package com.siddharth.spring_neo4j_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siddharth.spring_neo4j_demo.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService prodservice;
	
	@GetMapping
	public ResponseEntity<Object> getAllCats(){
		return prodservice.getAllProducts();
	}
}
