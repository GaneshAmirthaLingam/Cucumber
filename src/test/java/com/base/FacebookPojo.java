package com.base;

public class FacebookPojo {
private String username;
private int password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	if(username.equals("RamSarath@123")) {
	this.username = "Valid Username";
	}
	else if(username.equals("Anand")) {
		this.username = "Valid Username of Anand";
	}
	else if(username.equals("Babu")) {
		this.username = "Valid Username of Babu";
	}
	else {
		this.username = "InValid Username";
	}
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	if(password==1234) {
	this.password = 1;
	}
	else if(password==4321) {
		this.password = 1;
	}
	else if(password==7654) {
		this.password=1;
	}
	else {
		this.password = 0;
	}
}

public String output(String usernameStatus, int passwordStatus) {
	if(usernameStatus.contains("Valid") && passwordStatus==1) {
		return "Valid Account of Facebook";
	}
	else {
		return "Incorrect Account";
	}
}
}
