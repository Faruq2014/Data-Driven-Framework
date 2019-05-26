package FaruqAcademy;

import org.openqa.selenium.By;

import resources.Base;
import utilities.ExcelDataConfig;

public class LoginPage extends Base{
	ExcelDataConfig excell = new ExcelDataConfig("C:\\Users\\Faruq\\git\\Data-Driven-Framework\\DataDrivenFramework\\src\\main\\java\\resources\\testdata.xlsx");
	
	public void uName() {
		String username=   excell.getData(0, 2, 1);
        System.out.println("the user name is "+username);

        String UIDlocator=excell.getData(0, 4, 1);
        System.out.println("user id XPATH is "+UIDlocator);
        
        driver.findElement(By.xpath(UIDlocator)).sendKeys(username);
	}
	
	public void pWord() {
		String password=   excell.getData(0, 2, 2);
        System.out.println("the password is "+password);
        
        String passlocator= excell.getData(0, 5, 1);
        System.out.println("Password XPATH is "+passlocator);
       
        
        driver.findElement(By.xpath(passlocator)).sendKeys(password);
	}
	
	public void loginButton() {
		String loginlocator= excell.getData(0, 6, 1);
        System.out.println("LOGIN XPATH is "+loginlocator);
       
        
        driver.findElement(By.xpath(loginlocator)).click();
	}
	
}
