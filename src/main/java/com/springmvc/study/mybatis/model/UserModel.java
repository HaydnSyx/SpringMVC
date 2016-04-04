package com.springmvc.study.mybatis.model;

import java.util.Map;

public class UserModel {

	private Map<String, String> sexMap;

	private String id;

	private String name;

	private String password;

	private Integer age;

	private String birthday;

	private Double moeny;

	private Boolean hasPhone;

	private String sex;

	private String address;

	public Map<String, String> getSexMap() {
		return sexMap;
	}

	public void setSexMap(Map<String, String> sexMap) {
		this.sexMap = sexMap;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Double getMoeny() {
		return moeny;
	}

	public void setMoeny(Double moeny) {
		this.moeny = moeny;
	}

	public Boolean getHasPhone() {
		return hasPhone;
	}

	public void setHasPhone(Boolean hasPhone) {
		this.hasPhone = hasPhone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}
}