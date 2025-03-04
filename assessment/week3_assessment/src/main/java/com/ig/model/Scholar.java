package com.ig.model;

public class Scholar {
	private int scholar_id;
	private String name;
	private String email;
	private String mobile;
	
	@Override
	public String toString() {
		return "Scholar [scholar_id=" + scholar_id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}
	public Scholar(int scholar_id, String name, String email, String mobile) {
		super();
		this.scholar_id = scholar_id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	public int getScholar_id() {
		return scholar_id;
	}
	public void setScholar_id(int scholar_id) {
		this.scholar_id = scholar_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
