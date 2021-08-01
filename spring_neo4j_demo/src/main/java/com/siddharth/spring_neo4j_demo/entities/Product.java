package com.siddharth.spring_neo4j_demo.entities;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Node
public class Product {

	@Id
	private String productID;
	
	private String categoryID;
	
	@JsonIgnore
	private Boolean discontinued;
	private String productName;
	private String quantityPerUnit;
	
	@Relationship(value="SUPPLIES",direction=Direction.INCOMING)
	private Supplier supplier;
	
	@Relationship("PART_OF")
	private Category category;
	
	
	public Product() {
		super();
	}

	public Product(String productId, String categoryId, Boolean discontinued, String productName,
			String quantityPerUnit) {
		super();
		this.productID = productId;
		this.categoryID = categoryId;
		this.discontinued = discontinued;
		this.productName = productName;
		this.quantityPerUnit = quantityPerUnit;
	}



	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Boolean getDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(Boolean discontinued) {
		this.discontinued = discontinued;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}

	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}
	
	
	
}
