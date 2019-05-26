package readAndWrite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readdata {

	public static void main(String[] args) {
		ExcelDataConfig excell = new ExcelDataConfig("C://Users//Faruq//Desktop//xcell sheet//testdata.xlsx");
		
		       
                 String username=   excell.getData(0, 2, 1);
                 System.out.println("the user name is "+username);
                 
                 String password=   excell.getData(0, 2, 2);
                 System.out.println("the password is "+password);
                 
                
               String UIDlocator=excell.getData(0, 4, 1);
               
               String passlocator= excell.getData(0, 5, 1);
               System.out.println(passlocator);
                
                String loginlocator= excell.getData(0, 6, 1);
                System.out.println(loginlocator);
                
                System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
        		WebDriver driver = new ChromeDriver();
         
     driver.get("https://www.facebook.com/");
      System.out.println("khalled facebook"+excell.getData(0, 0, 0));
      
     driver.findElement(By.id(UIDlocator)).sendKeys(username);
     driver.findElement(By.id(passlocator)).sendKeys(password);
     
     driver.findElement(By.xpath(loginlocator)).click();

     System.out.println("test pass----------------------------------");
     
	}
	}


