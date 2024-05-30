package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

	public DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (xpath="//li//a[text()='Offer Ride']")
	WebElement btn_offerride;
	
	public void click_offerride() {
		btn_offerride.click();
	}
	

}
