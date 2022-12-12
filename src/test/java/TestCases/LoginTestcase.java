package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectsModel.LoginPageObjects;
import Resources.BaseClass;

public class LoginTestcase extends BaseClass {
	
   @Test
	public void Login() throws IOException {
		browserIntialization();
	    driver.get("https://login.salesforce.com/");
	
	//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Sunayana");

		LoginPageObjects LPO=new LoginPageObjects(driver);
	    LPO.enterUsername().sendKeys("Sunayana");
	    LPO.enterPassword().sendKeys("Sun123");
	    LPO.clickOnlogin().click();
 
	    
	    
	    
	    
	
	
		}
	}	
	

