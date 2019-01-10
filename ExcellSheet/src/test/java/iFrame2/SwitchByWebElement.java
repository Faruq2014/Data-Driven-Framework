package iFrame2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchByWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		//First find the element using any of locator stratedgy
		WebElement iframeElement = driver.findElement(By.id("IF1"));

		//now use the switch command
		driver.switchTo().frame(iframeElement);
		driver.findElement(By.name("firstname")).sendKeys("faruq");
		driver.findElement(By.name("lastname")).sendKeys("Molla");
		//driver.quit();	

	}

}
