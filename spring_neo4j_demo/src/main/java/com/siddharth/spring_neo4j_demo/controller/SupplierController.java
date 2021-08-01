package com.siddharth.spring_neo4j_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siddharth.spring_neo4j_demo.service.SupplierService;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

	@Autowired
	SupplierService supplierService;
	
	//retrieves info about all categories
	@GetMapping
	public ResponseEntity<Object> getAllSuppliers(){
		return supplierService.getAllSuppliers();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getSupplierById(@PathVariable String id){
		return supplierService.getAllSupplierById(id);
	}
}
