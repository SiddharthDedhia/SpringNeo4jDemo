package com.siddharth.spring_neo4j_demo.entities;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Category {

	@Id
	private String categoryID;
	
	private String categoryName;
	private String description;
	
	public Category() {
		super();
	}
	public Category(String categoryId, String categoryName, String description) {
		super();
		this.categoryID = categoryId;
		this.categoryName = categoryName;
		this.description = description;
	}
	public String getCategoryId() {
		return categoryID;
	}
	public void setCategoryId(String categoryId) {
		this.categoryID = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
