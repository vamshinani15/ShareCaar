package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_001_SC_Login extends BaseClass{
	
	@Test
	public void Login() {
		LoginPage lp=new LoginPage(driver);
		lp.set_username(RB.getString("Email"));
		lp.set_password(RB.getString("password"));
		lp.click_login();
	}

}
