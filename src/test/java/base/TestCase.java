package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://products.ncryptedprojects.com/sharecaar/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("niteesh@w3softech.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("w3softech");
		driver.findElement(By.id("sbtLogin")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//li//a[text()='Offer Ride']")).click();
		driver.findElement(By.xpath("//input[@id='from_location']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@id='to_location']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//input[@id='pickup_point_2']")).sendKeys("Gachibowli");
		driver.findElement(By.xpath("//input[@id='pickup_point_3']")).sendKeys("Kukatpally");
		WebElement ele=driver.findElement(By.xpath("//label[@for='round_trip']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		
		ele.click();
		driver.findElement(By.id("onward_date")).sendKeys("24-05-2024");
		driver.findElement(By.id("onward_time")).sendKeys("08:00");
		driver.findElement(By.id("next_btn")).click();

	}

}
