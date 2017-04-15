package com.epam.page;

import org.openqa.selenium.support.FindBy;

import com.epam.element.Button;
import com.epam.element.InputField;

public class InboxPage extends Page {

	@FindBy(xpath = "//div[@class='z0']/div")
	private Button compose;

	@FindBy(className = "vO")
	private InputField recipient;

	@FindBy(className = "aoT")
	private InputField subject;

	@FindBy(className = "Am")
	private InputField message;

	@FindBy(xpath = "//div[text()='Send']")
	private Button send;

	public InboxPage() {
		super();
	}

	public void clickCompose() {
		compose.click();
	}

	public void setRecipient(String recipient) {
		this.recipient.fillIn(recipient);
	}

	public void setSubjectMessage(String subjectMessage) {
		subject.fillIn(subjectMessage);
	}

	public void setMessage(String bodyMessage) {
		message.fillIn(bodyMessage);
	}

	public void clickSend() {
		send.click();
	}
}
