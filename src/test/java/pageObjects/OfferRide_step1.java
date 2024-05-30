package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OfferRide_step1 extends BasePage{

	public OfferRide_step1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy (xpath="//input[@id='from_location']")
	WebElement txt_Source;
	
	@FindBy (xpath="//input[@id='to_location']")
	WebElement txt_Destination;
	
	@FindBy (xpath="//input[@id='pickup_point_2']")
	WebElement txt_pickpoint1;
	
	@FindBy (xpath="//input[@id='pickup_point_3']")
	WebElement txt_pickpoint2;
	
	@FindBy (xpath="//label[@for='round_trip']")
	WebElement btn_trip;
	
	@FindBy (id="onward_date")
	WebElement txt_doj;
	
	@FindBy (id="onward_time")
	WebElement txt_dot;
	
	@FindBy (id="next_btn")
	WebElement btn_save;
	
	public void set_Source(String src) {
		txt_Source.sendKeys(src);
	}
	public void set_Destination(String dest) {
		txt_Destination.sendKeys(dest);
	}
	public void set_Pickuppoint1(String pp1) {
		txt_pickpoint1.sendKeys(pp1);
	}
	public void set_Pickuppoint2(String pp2) {
		txt_pickpoint2.sendKeys(pp2);
	}
	public void click_Tripbutton() {
		btn_trip.click();
	}
	public void set_DateofJourney(String doj) {
		txt_doj.sendKeys(doj);
	}
	public void set_DateofTime(String dot) {
		txt_dot.sendKeys(dot);
	}
	public void click_Savebutton() {
		btn_save.click();
	}

}
