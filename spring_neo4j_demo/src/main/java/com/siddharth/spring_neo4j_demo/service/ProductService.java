package com.siddharth.spring_neo4j_demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.siddharth.spring_neo4j_demo.dao.ProductRepo;
import com.siddharth.spring_neo4j_demo.entities.Product;
import com.siddharth.spring_neo4j_demo.response.ResponseHandler;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo productRepo;
	
	public ResponseEntity<Object> getAllProducts(){
		try {
			
			Map<String, Object> map = new HashMap<String, Object>();
			List<Product> prodList = productRepo.findAll();
			int count = prodList.size();
			map.put("products_count", count);
			map.put("products_detail", prodList);
	        return ResponseHandler.generateResponse( HttpStatus.OK, map);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(HttpStatus.MULTI_STATUS, null);
        }
	}
	
}
