package com.epam.page;

import org.openqa.selenium.support.FindBy;

import com.epam.element.InputField;

public class LoginPage extends Page {

	@FindBy(id = "Email")
	private InputField loginName;

	@FindBy(id = "Passwd")
	private InputField password;

	public LoginPage() {
		super();
	}

	public void setUserName(String userName) {
		loginName.fillIn(userName);
	}

	public void imitationEnterName() {
		loginName.imitationEnter();
	}

	public void setUserPassword(String userPassword) {
		password.fillIn(userPassword);
	}

	public void imitationEnterPassword() {
		password.imitationEnter();
	}
}
