package iFrame2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchByName {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDriver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");

	//Switch by frame name
	driver.switchTo().frame("iframe1");
	driver.quit();
}
}
