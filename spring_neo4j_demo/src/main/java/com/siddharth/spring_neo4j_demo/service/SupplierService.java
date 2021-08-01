package com.siddharth.spring_neo4j_demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.siddharth.spring_neo4j_demo.dao.SupplierRepo;
import com.siddharth.spring_neo4j_demo.entities.Supplier;
import com.siddharth.spring_neo4j_demo.response.ResponseHandler;

@Service
public class SupplierService {

	@Autowired
	SupplierRepo supplierRepo;
	
	public ResponseEntity<Object> getAllSuppliers(){
		try {
			
			Map<String, Object> map = new HashMap<String, Object>();
			List<Supplier> supplierList = supplierRepo.findAll();
			int count = supplierList.size();
			map.put("suppliers_count", count);
			map.put("suppliers_detail", supplierList);
	        return ResponseHandler.generateResponse( HttpStatus.OK, map);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(HttpStatus.MULTI_STATUS, null);
        }
	}

	public ResponseEntity<Object> getAllSupplierById(String id) {
try {
			
			Optional<Supplier> s = supplierRepo.findById(id);
	        return ResponseHandler.generateResponse( HttpStatus.OK, s);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(HttpStatus.MULTI_STATUS, null);
        }
	}
}
