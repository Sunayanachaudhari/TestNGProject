package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import PageObjectsModel.LoginPageObjects;
import PageObjectsModel.SignUpPageObject;
import Resources.BaseClass;
import Resources.CommanMethods;
import Resources.Constant;

public class SignUpTestcase extends BaseClass {
	
      @Test
     public void verifySignup() throws IOException, InterruptedException {
           LoginPageObjects LPO=new LoginPageObjects(driver);
      LPO.clickOntryforfree().click();
      
      SignUpPageObject SPO=new SignUpPageObject(driver);
      Thread.sleep(5000);
      SPO.enterfirstname().sendKeys(Constant.firstname);
      SPO.enterlastname().sendKeys(Constant.lastname);
      SPO.enterjobtitle().sendKeys(Constant.jobtitle);
      SPO.enteremail().sendKeys(Constant.email);
      SPO.enterphoneno().sendKeys(Constant.phoneno);
      SPO.entercompanyname().sendKeys(Constant.companyname);

      CommanMethods.selectDropdown(SPO.selectcompanyemployees(), 1); 
      
      CommanMethods.selectDropdown(SPO.selectcountryname(), 1); 
       }      
      
	
}


