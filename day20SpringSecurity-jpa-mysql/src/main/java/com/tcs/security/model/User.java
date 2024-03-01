package com.tcs.security.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String userName;
	private String passwordA;
	private boolean activeA;
	private String roles;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPasswordA() {
		return passwordA;
	}
	public void setPassword(String passwordA) {
		this.passwordA = passwordA;
	}
	public boolean isActiveA() {
		return activeA;
	}
	public void setActiveA(boolean activeA) {
		this.activeA = activeA;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	
	
}
