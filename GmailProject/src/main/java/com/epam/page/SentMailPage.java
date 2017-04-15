package com.epam.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.element.Button;

public class SentMailPage extends Page {

	@FindBy(css = ".G-atb.D.E .iH .asa .ar9")
	private Button delete;

	@FindBy(xpath = "//a[@title='Sent Mail']")
	private Button sentMail;

	@FindBy(css = "div[role='main'] span.bog")
	private WebElement message;

	public SentMailPage() {
		super();
	}

	public void sentMail() {
		sentMail.click();
	}

	public String getSubjectSentMessage() {
		return message.getText();
	}

	public void readMessage() {
		message.click();
	}

	public void delete() {
		delete.click();
	}
}
