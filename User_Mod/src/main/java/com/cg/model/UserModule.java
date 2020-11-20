package com.cg.model;

public class UserModule {
	private String username;
	private String password;
	private String roleCode;
	public UserModule() {
		super();
	}
	public UserModule(String username, String password, String roleCode) {
		super();
		this.username = username;
		this.password = password;
		this.roleCode = roleCode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	@Override
	public String toString() {
		return "UserModule [username=" + username + ", password=" + password + ", roleCode=" + roleCode + "]";
	}
	
	

}
