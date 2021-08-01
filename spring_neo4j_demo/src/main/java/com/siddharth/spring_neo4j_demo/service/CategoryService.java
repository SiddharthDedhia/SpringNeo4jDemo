package com.siddharth.spring_neo4j_demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.siddharth.spring_neo4j_demo.dao.CategoryRepo;
import com.siddharth.spring_neo4j_demo.entities.Category;
import com.siddharth.spring_neo4j_demo.response.ResponseHandler;

@Service
public class CategoryService {

	@Autowired
	CategoryRepo categoryRepo;
	
	public ResponseEntity<Object> getAllCategories(){
		try {
			
			Map<String, Object> map = new HashMap<String, Object>();
			List<Category> catList = categoryRepo.findAll();
			int count = catList.size();
			map.put("category_count", count);
			map.put("category_detail", catList);
	        return ResponseHandler.generateResponse( HttpStatus.OK, map);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(HttpStatus.MULTI_STATUS, null);
        }
	}
}
