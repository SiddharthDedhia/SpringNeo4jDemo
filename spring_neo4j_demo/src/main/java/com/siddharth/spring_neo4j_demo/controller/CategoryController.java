package com.siddharth.spring_neo4j_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siddharth.spring_neo4j_demo.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	//retrieves info about all categories
	@GetMapping
	public ResponseEntity<Object> getAllCats(){
		return categoryService.getAllCategories();
	}
	
	
	
}
