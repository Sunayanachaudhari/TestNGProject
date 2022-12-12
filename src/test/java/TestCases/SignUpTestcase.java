package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import PageObjectsModel.LoginPageObjects;
import PageObjectsModel.SignUpPageObject;
import Resources.BaseClass;

public class SignUpTestcase extends BaseClass {
	
      @Test
     public void verifySignup() throws IOException, InterruptedException {
      browserIntialization();
	  driver.get("https://login.salesforce.com/");

      LoginPageObjects LPO=new LoginPageObjects(driver);
      LPO.clickOntryforfree().click();
      
      SignUpPageObject SPO=new SignUpPageObject(driver);
      Thread.sleep(5000);
      SPO.enterfirstname().sendKeys("Sunayana");
      SPO.enterlastname().sendKeys("Chaudhari");
      SPO.enterjobtitle().sendKeys("sales manager");
      SPO.enteremail().sendKeys("chaudharisunayana11@gmail.com");
      SPO.enterphoneno().sendKeys("9022817500");
      SPO.entercompanyname().sendKeys("infosys");

      Select s=new Select(SPO.selectcompanyemployees());
      s.selectByIndex(1);
    
      }      
      
	
}


