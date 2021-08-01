package com.siddharth.spring_neo4j_demo.dao;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.siddharth.spring_neo4j_demo.entities.Product;

public interface ProductRepo extends Neo4jRepository<Product, String> {

}
