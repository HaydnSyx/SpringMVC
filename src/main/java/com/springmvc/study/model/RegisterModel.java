package com.springmvc.study.model;

import java.util.Date;
import java.util.List;

public class RegisterModel {
	// 姓名
	private String name;
	// 密码
	private String password;
	// 年龄
	private int age;
	// 婚姻状况
	private boolean maritalStatus;
	// 资产
	private double money;
	// 出生年月
	private Date birthday;
	// 邮箱
	private String email;
	// 手机
	private String phone;
	// 学历
	private List<String> schoolList;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public List<String> getSchoolList() {
		return schoolList;
	}

	public void setSchoolList(List<String> schoolList) {
		this.schoolList = schoolList;
	}
}
