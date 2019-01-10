package iFrame2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchBackToMainFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		//First find the element using any of locator stratedgy
		WebElement iframeElement = driver.findElement(By.id("IF1"));

		//now use the switch command
		driver.switchTo().frame(0);
		System.out.println("the iframe url is"+driver.getCurrentUrl());
		System.out.println("the i frame title is "+driver.getTitle());
		driver.findElement(By.name("firstname")).sendKeys("faruq");
		driver.findElement(By.name("lastname")).sendKeys("Molla");
		//Do all the required tasks in the frame 0
	System.out.println("*****************************************");
		//Switch back to the main window
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		System.out.println("the main page title is "+driver.getTitle());
		System.out.println("the home url is"+driver.getCurrentUrl());
		driver.findElement(By.xpath("//*[@id='primary-menu']/li[1]/a/span/span")).click();
		//driver.findElement(By.className("menu-item-text")).click();
		//driver.findElement(By.linkText("http://toolsqa.wpengine.com/")).click();
		//driver.quit();

	}

}
