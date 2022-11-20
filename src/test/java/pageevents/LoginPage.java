package pageevents;

import org.testng.Assert;

import pageobjects.LoginPageElements;
import utils.ElementFetcher;

public class LoginPage {

	public void isLoginPageLanded() {
		ElementFetcher e = new ElementFetcher();
		String txt = e.getWebElement("XPATH", LoginPageElements.tbLogin).getText();
		Assert.assertEquals(txt, "LOGIN","Login page is not landed,Please direct to Login page");

	}

	public void login() {
		ElementFetcher e = new ElementFetcher();
		e.getWebElement("CSS", LoginPageElements.tbemailId).sendKeys("Admin");
		e.getWebElement("CSS", LoginPageElements.tbPassword).sendKeys("Admin123");
		e.getWebElement("CSS", LoginPageElements.selectLocation).click();
		e.getWebElement("CSS", LoginPageElements.btnLogin).click();
		
	}

}
