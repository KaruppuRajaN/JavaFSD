package com.tcs.rest.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Login {
	@JsonProperty("password")
	private String password; 
	
	@JsonProperty("username")
	private String username;
public Login() {
	// TODO Auto-generated constructor stub
}

public Login(String password, String username) {
	super();
	this.password = password;
	this.username = username;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

}
