package testCases;

import org.testng.annotations.Test;

import pageObjects.BasePage;
import pageObjects.DashboardPage;
import testBase.BaseClass;

public class TC_002_SC_OfferRideStep1 extends BaseClass{
	@Test
	public void Offerride() {
		DashboardPage dp=new DashboardPage(BasePage.driver);
		dp.click_offerride();
	}

}
