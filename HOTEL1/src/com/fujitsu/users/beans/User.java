package com.fujitsu.users.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
/*
 * Author:pranita jagtap
 * Creation Date:19/03/2019
 * Modification date:2nd/04/2019
 * Version:6.0
 * Copyright:Fujitsu private limited 
 * Description: It represent database entity
 * it is a java bean class
 * */
@Component
@Entity
@Table(name="USER")
public class User implements Serializable {
	
	@Id
	@GeneratedValue(generator="increment")
	@Column(name="USER_ID")
	private int userId;
	
	@Column(length=30,nullable=false)
	private String userName;
	
	@Column(length=30,nullable=false)
	private String role;

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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", role=" + role + "]";
	}
	
	
	
}