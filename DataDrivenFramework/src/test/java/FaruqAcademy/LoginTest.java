package FaruqAcademy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class LoginTest extends Base {
	public static Logger log =LogManager.getLogger(Base.class.getName());
	ExcelDataConfig excell = new ExcelDataConfig("C:\\Users\\Faruq\\DataDrivenFramework\\src\\main\\java\\resources\\testdata.xlsx");
	@BeforeTest
	public void getDriver() throws IOException {
		log.info("login test is starting.");
		driver=intializeDriver();
	}
	@Test
	public void loginTest() {
		 String username=   excell.getData(0, 2, 1);
         System.out.println("the user name is "+username);
         
         String password=   excell.getData(0, 2, 2);
         System.out.println("the password is "+password);
         
        
       String UIDlocator=excell.getData(0, 4, 1);
       System.out.println("user id XPATH is "+UIDlocator);
       
       String passlocator= excell.getData(0, 5, 1);
       System.out.println("Password XPATH is "+passlocator);
        
        String loginlocator= excell.getData(0, 6, 1);
        System.out.println("LOGIN XPATH is "+loginlocator);
        
 		

System.out.println("khalled facebook"+excell.getData(0, 0, 0));

driver.findElement(By.xpath(UIDlocator)).sendKeys(username);
driver.findElement(By.xpath(passlocator)).sendKeys(password);

driver.findElement(By.xpath(loginlocator)).click();

System.out.println("test pass----------------------------------");

	}
	@AfterTest
	public void teardown() {
		log.info("log in test done");
		driver.close();
	}
	

}
