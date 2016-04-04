package com.springmvc.study.model;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginModel {

	@NotEmpty(message="{name.not.empty}")
	private String name;
	@NotEmpty(message="{password.not.empty}")
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
