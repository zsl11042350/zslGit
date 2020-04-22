package com.neusoft.object.answer;

public class NetUser {
	private String userID;
	private String password;
	private String e_mail;
	public NetUser(String userID, String password, String e_mail) {
		super();
		this.userID = userID;
		this.password = password;
		this.e_mail = e_mail;
	}
	@Override
	public String toString() {
		return "com.neusoft.java._200414object.NetUser [userID=" + userID + ", password=" + password + ", e_mail=" + e_mail + "]";
	}
	
	
}
