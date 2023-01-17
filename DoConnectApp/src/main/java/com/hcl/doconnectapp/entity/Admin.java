package com.hcl.doconnectapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin 
{
	@Id
	private long adminId;
	private String adminName;
	private String adminPassword;
	private String email;
	private boolean isActive=true;
	
	public Admin() {
		super();
	}
	
	public Admin(long adminId, String adminName, String adminPassword, String email, boolean isActive) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.email = email;
		this.isActive = isActive;
	}

	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword
				+ ", email=" + email + ", isActive=" + isActive + "]";
	}
	
	
	
}

