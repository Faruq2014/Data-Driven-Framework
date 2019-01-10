package iFrame2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnknownFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("total i frame size is "+ size);
		
		for(int i=0;i<size;i++) {
			driver.switchTo().frame(i);
			if(driver.findElements(By.tagName("iframe")).size()!=0);
			System.out.println(driver.getTitle());
			driver.findElement(By.name("firstname")).sendKeys("faruq");
			driver.findElement(By.name("lastname")).sendKeys("faruq");
			driver.switchTo().defaultContent();
			//driver.findElement(By.className("menu-item menu-item-type-custom menu-item-object-custom menu-item-17581 first")).click();
			driver.quit();
		}
		
	}
	

}
