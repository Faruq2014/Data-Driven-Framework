package resources;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;
	public Properties prop;
public Base() {}
	
		public WebDriver intializeDriver() throws IOException {
		 prop = new Properties();
			
			//FileInputStream fis = new FileInputStream("C:\\Users\\Faruq\\Documents\\workspace-sts-3.9.1.RELEASE\\ExcellSheet\\src\\test\\java\\property\\data.properties");
			FileInputStream fis = new FileInputStream("C:\\Users\\Faruq\\git\\Data-Driven-Framework\\DataDrivenFramework\\src\\main\\java\\resources\\data.properties");
			prop.load(fis);
			String browserName= prop.getProperty("browser");
			System.out.println(browserName);
			
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
				 driver = new ChromeDriver();
		         driver.get("https://www.facebook.com/");
		        
			}
			else if(browserName.equalsIgnoreCase("firefox")) {
				
				System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDriver\\geckodriver.exe");
				 driver = new FirefoxDriver(); 
				 driver.get("https://www.facebook.com/");
			}
			else if (browserName.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver","C:\\SeleniumDriver\\MicrosoftWebDriver.exe");
				 driver = new EdgeDriver();  
				 driver.get("https://www.facebook.com/");
			}else {System.out.println("not a browser");}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
		return driver;


	}
		
		

}
