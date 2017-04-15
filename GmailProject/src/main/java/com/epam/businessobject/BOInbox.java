package com.epam.businessobject;

import com.epam.page.InboxPage;

public class BOInbox {
	private InboxPage inboxPage;

	public BOInbox() {
		inboxPage = new InboxPage();
	}
	
	public void sendMail(String recipient, String subjectMessage, String bodyMessage){
		inboxPage.clickCompose();
		inboxPage.setRecipient(recipient);
		inboxPage.setSubjectMessage(subjectMessage);
		inboxPage.setMessage(bodyMessage);
		inboxPage.clickSend();
	}
}
