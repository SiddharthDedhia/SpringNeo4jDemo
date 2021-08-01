package com.siddharth.spring_neo4j_demo.entities;

import org.springframework.data.neo4j.core.schema.Node;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.neo4j.core.schema.Id;

@Node
public class Supplier {

	@Id
	private String supplierID;
	
	@JsonIgnore
	private String address;
	private String city;
	private String companyName;
	private String contactName;
	
	public Supplier() {
		super();
	}
	public Supplier(String id, String address, String city, String companyName, String contactName) {
		super();
		this.supplierID = id;
		this.address = address;
		this.city = city;
		this.companyName = companyName;
		this.contactName = contactName;
	}
	public String getId() {
		return supplierID;
	}
	public void setId(String id) {
		this.supplierID = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	
	
	
}
