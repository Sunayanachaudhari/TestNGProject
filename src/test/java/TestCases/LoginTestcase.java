package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectsModel.LoginPageObjects;
import Resources.BaseClass;
import Resources.Constant;

public class LoginTestcase extends BaseClass {
	

@Test
	public void Login() throws IOException {
			//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Sunayana");

		LoginPageObjects LPO=new LoginPageObjects(driver);
	    LPO.enterUsername().sendKeys(Constant.username);
	    LPO.enterPassword().sendKeys(Constant.passward);
	    LPO.clickOnlogin().click();
 
	    SoftAssert assertion=new SoftAssert();
	   String actual= LPO.errormessage().getText(); 
	    String Expected =Constant.errorMessage;	   
	    assertion.assertEquals(actual, Expected);
	    assertion.assertAll();
	    
	    	
	
	    }
}
	

