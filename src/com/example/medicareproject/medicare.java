package com.example.medicareproject;

public class medicare {

	String disease = null;
	String name = null;
	String address = null;
	String location = null;
	String mobile = null;
	String email=null;
	public medicare(String disease, String name,  String address,
			 String location, String mobile, String email ) {
		this.disease=disease;
		this.name=name;
		this.address=address;
		this.location=location;
		this.mobile=mobile;
		this.email=email;
	}
	
	public String getDisease() { 
		return disease;
		} 
	public void setDisease(String disease) {
		this.disease = disease;
		}
	public String getName() {
		return name; 
		} 
	public void setName(String name) {
		this.name = name; 
		} 
	public String getAddress() {
		return address; 
		} 
	public void setAddress(String address) { 
		this.address = address; 
		} 
	public String getLocation() {
		return location;
		} 
	public void setLocation(String location) { 
		this.location = location;
		} 
	public String getMobile() {
		 return mobile;
		} 
	public void setMobile(String mobile) { 
		this.mobile = mobile;
		} 
	public String getEmail() {
		return email;
		} 
	public void setEmail(String email) { 
		this.email = email;
		} 
	} 

