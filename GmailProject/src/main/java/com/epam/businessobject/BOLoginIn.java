package com.epam.businessobject;

import com.epam.page.LoginPage;

public class BOLoginIn {
	private LoginPage loginPage;

	public BOLoginIn() {
		loginPage = new LoginPage();
	}

	public void login(String userName, String userPassword) {
		loginPage.setUserName(userName);
		loginPage.imitationEnterName();
		loginPage.setUserPassword(userPassword);
		loginPage.imitationEnterPassword();
	}
}
