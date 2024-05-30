package testBase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {
	public WebDriver driver;
	public ResourceBundle RB;
	@BeforeSuite
	public void setup() {
		RB=ResourceBundle.getBundle("config");
		driver=new ChromeDriver();
		driver.get("https://products.ncryptedprojects.com/sharecaar/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterSuite
	public void close() {
		driver.quit();
	}

}
