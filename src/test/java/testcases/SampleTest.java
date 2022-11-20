package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pageevents.LoginPage;

public class SampleTest extends BaseTest {

	@Test
	public void sampleTestcase1() {

		LoginPage loginPage = new LoginPage();

		loginPage.isLoginPageLanded();
		loginPage.login();

	}
	
	@Test
	public void sampleTestcase2() {

		LoginPage loginPage = new LoginPage();

		loginPage.isLoginPageLanded();
		loginPage.login();

	}
	@Test
	public void sampleTestcase3() {

		LoginPage loginPage = new LoginPage();

		loginPage.isLoginPageLanded();
		loginPage.login();

	}
	@Test
	public void sampleTestcase4() {

		LoginPage loginPage = new LoginPage();

		loginPage.isLoginPageLanded();
		loginPage.login();

	}
	@Test
	public void sampleTestcase5() {

		LoginPage loginPage = new LoginPage();

		loginPage.isLoginPageLanded();
		loginPage.login();

	}
}
