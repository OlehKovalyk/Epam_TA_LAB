package com.epam.model;

public class User {

	private String loin;
	private String password;
	private Message message;

	public User(String loin, String password, String recipient, String subjectMessage, String bodyMessage) {
		this.loin = loin;
		this.password = password;
		this.message = new Message(recipient, subjectMessage, bodyMessage);
	}
	
	public String getLoin() {
		return loin;
	}

	public String getPassword() {
		return password;
	}

	public Message getMessage(){
		return message;
	}
}
