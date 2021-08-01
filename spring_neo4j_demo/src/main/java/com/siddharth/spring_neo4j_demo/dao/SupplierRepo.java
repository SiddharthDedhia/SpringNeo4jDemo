package com.siddharth.spring_neo4j_demo.dao;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.siddharth.spring_neo4j_demo.entities.*;

public interface SupplierRepo extends Neo4jRepository<Supplier, String>{
	
}
