package com.epam.lab4.appender;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

import com.epam.lab4.sms.SMSCSender;

public final class SendSmsAppender extends AppenderSkeleton  {

	@Override
	public void close() {
	}

	@Override
	public boolean requiresLayout() {
		return false;
	}

	@Override
	protected void append(LoggingEvent event) {
		SMSCSender sender = new SMSCSender();
		sender.sendSms("380989447527", event.getMessage().toString(), 1, "", "", 0, "", "");
	}

}
