package com.epam.businessobject;

import com.epam.page.SentMailPage;

public class BOSentMail {
	private SentMailPage sentMailPage;

	public BOSentMail() {
		sentMailPage = new SentMailPage();
	}

	public boolean isSentMail(String subject) {
		return getSubjectOfFirstMessage().equals(subject);
	}

	public void goToSentMail(){
		sentMailPage.sentMail();
	}
	
	public String getSubjectOfFirstMessage() {
		return sentMailPage.getSubjectSentMessage();
	}

	public void delete(String subject) {
		if (isSentMail(subject)) {
			sentMailPage.readMessage();
			sentMailPage.delete();
		}
	}
}
