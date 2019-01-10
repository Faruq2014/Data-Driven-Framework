package iFrame2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchById {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");

		//Switch by frame ID
		driver.switchTo().frame("IF1");
		driver.quit();

	}

}
