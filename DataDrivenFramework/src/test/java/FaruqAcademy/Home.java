package FaruqAcademy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class Home extends Base {
	public static Logger log =LogManager.getLogger(Base.class.getName());
	ExcelDataConfig excell = new ExcelDataConfig("C:\\Users\\Faruq\\DataDrivenFramework\\src\\main\\java\\resources\\testdata.xlsx");
	@BeforeTest
	public void getDriver() throws IOException {
		
		driver=intializeDriver();
		log.info("home page verifying test is starting.");
	}
	@Test
	public void navigationpage() throws IOException {
		String expectedTitle =driver.getTitle();
		String ectualTitle ="Facebook - Log In or Sign Up";
		if (expectedTitle.equals(ectualTitle)){
			System.out.println("you are on right page");
			System.out.println();
			log.info("home page verified");
			
		}else {System.out.println("wrong page");}
	}
		
	
	@AfterTest
	public void teardown() {
	driver.close();
	driver=null;
	}
}
