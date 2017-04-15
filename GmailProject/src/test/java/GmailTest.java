import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.businessobject.BOInbox;
import com.epam.businessobject.BOLoginIn;
import com.epam.businessobject.BOSentMail;
import com.epam.model.User;
import com.epam.properties.PropertyLoader;
import com.epam.util.Constants;
import com.epam.util.Waiter;
import com.epam.webdriver.DriverManager;

public class GmailTest {
	private static PropertyLoader propertyLoader = new PropertyLoader(
			Constants.PROPERTY_REF);

	@DataProvider(parallel = true)
	public static Object[][] users() throws IOException {
		return new Object[][] {
				{ new User(propertyLoader.getUserName1(), propertyLoader.getPassword1(), propertyLoader.getRecipient(),
						propertyLoader.getSubjectMessage(), propertyLoader.getBodyMessage()) },
				{ new User(propertyLoader.getUserName2(), propertyLoader.getPassword2(), propertyLoader.getRecipient(),
						propertyLoader.getSubjectMessage(), propertyLoader.getBodyMessage()) },
				{ new User(propertyLoader.getUserName3(), propertyLoader.getPassword3(), propertyLoader.getRecipient(),
						propertyLoader.getSubjectMessage(), propertyLoader.getBodyMessage()) } };
	}

	@Test(dataProvider = "users")
	public void gmailTest(User user){
		BOLoginIn boLoginIn = new BOLoginIn();
		BOInbox boInbox = new BOInbox();
		BOSentMail boSentMail = new BOSentMail();
		boLoginIn.login(user.getLoin(), user.getPassword());
		boInbox.sendMail(user.getMessage().getRecipient(), user.getMessage().getSubjectMessage(), user.getMessage().getBodyMessage());
		boSentMail.goToSentMail();
		Waiter.waitForPage("Sent Mail");
		assertEquals(boSentMail.getSubjectOfFirstMessage(), user.getMessage().getSubjectMessage());
		boSentMail.delete(user.getMessage().getSubjectMessage().toString());
	}

	@AfterMethod
	public void tearDown() throws IOException {
		DriverManager.close();
	}

}
