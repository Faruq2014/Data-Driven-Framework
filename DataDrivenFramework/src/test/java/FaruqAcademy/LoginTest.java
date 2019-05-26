package FaruqAcademy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;
import utilities.ExcelDataConfig;

public class LoginTest extends Base {
	public static Logger log =LogManager.getLogger(Base.class.getName());

	//ExcelDataConfig excell = new ExcelDataConfig("C:\\Users\\Faruq\\git\\Data-Driven-Framework\\DataDrivenFramework\\src\\main\\java\\resources\\testdata.xlsx");
	                                           
	@BeforeTest
	public void getDriver() throws IOException {
		log.info("login test is starting.");
		intializeDriver();
	}
	
	@Test(priority=1)
	public void loginTest() {
		LoginPage lp= new LoginPage();
		lp.uName();
		lp.pWord();
		lp.loginButton();
	}
	@AfterTest
	public void teardown() {
		log.info("log in test done");
		driver.close();
	}
	

}
