package com.epam.model;

public class Message {
	private String recipient;
	private String subjectMessage;
	private String bodyMessage;

	public Message(String recipient, String subjectMessage, String bodyMessage) {
		this.recipient = recipient;
		this.subjectMessage = subjectMessage;
		this.bodyMessage = bodyMessage;
	}

	public String getRecipient() {
		return recipient;
	}

	public String getSubjectMessage() {
		return subjectMessage;
	}

	public String getBodyMessage() {
		return bodyMessage;
	}

}
