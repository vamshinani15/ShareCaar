package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy (xpath="//input[@id='email']")
	WebElement txt_username;
	
	@FindBy (xpath="//input[@id='password']")
	WebElement txt_password;
	
	@FindBy (id="sbtLogin")
	WebElement btn_login;
	
	public void set_username(String mail) {
		txt_username.sendKeys(mail);
	}
	public void set_password(String pwd) {
		txt_password.sendKeys(pwd);
	}
	public void click_login() {
		btn_login.click();
	}
	
	

}
