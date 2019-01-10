package iFrame2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchByIndex {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");

		//Switch by Index
		driver.switchTo().frame(0);
		System.out.println("we already switced but did not click yet.");
		driver.findElement(By.name("firstname")).sendKeys("faruq");
		driver.findElement(By.name("lastname")).sendKeys("Molla");
		//driver.quit();
	}

}
