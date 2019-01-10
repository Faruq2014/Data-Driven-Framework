package property;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Home extends Base {
	@BeforeTest
	public void getDriver() throws IOException {
		driver=intializeDriver();
	}
	@Test
	public void navigationpage() throws IOException {
		//driver.findElement(By.id("email")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@yahoo.com");	
		
		
	}
	@AfterTest
	public void teardown() {
	driver.close();
	driver=null;
	}
}
