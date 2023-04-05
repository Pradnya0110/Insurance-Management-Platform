package com.insurancemanagement.Insurance.Bean;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Officer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	private String password;
	private String officerType;
	
	public Officer() {
		super();
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOfficerType() {
		return officerType;
	}
	public void setOfficerType(String officerType) {
		this.officerType = officerType;
	}

	@Override
	public String toString() {
		return "Officer [userId=" + userId + ", userName=" + userName + ", password=" + password + ", officerType="
				+ officerType + "]";
	}
	
	

}
