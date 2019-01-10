package readAndWrite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) throws IOException {
   DataDriven d = new DataDriven();
   ArrayList data=d.getData("khalled");
      String  userid=(String) data.get(1);
        System.out.println(userid);
        
        String  password=(String) data.get(2);
        System.out.println(password);
   
   System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();          //opening browser
   driver.get("https://www.facebook.com/");        // opening facebook
   System.out.println(driver.getTitle());
   String s=driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[1]/h2")).getText();
	System.out.println(s);
   driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);   //wait for upload
   
   //verification or check point.
	if(driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[1]/h2")).isDisplayed()) {
	
   driver.findElement(By.id("email")).sendKeys(userid);
   driver.findElement(By.id("pass")).sendKeys(password);
   driver.findElement(By.xpath("//input[contains(@id,'u_0')]")).click(); //this is dynamic xpath or regular expression.
   System.out.println("test pass----------------------------------");
	}
	else {System.out.println("test fail");}

	}

}
