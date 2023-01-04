package PageObjectsModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.BaseClass;

public class SignUpPageObject extends BaseClass {
	public WebDriver driver;
   	By firstname=By.xpath("//input[@name='UserFirstName']");
	By LastName=By.xpath("//input[@name='UserLastName']");
	By jobtitle=By.xpath("//input[@name='UserTitle']");
	By email=By.xpath("//input[@name='UserEmail']");
	By phoneno=By.xpath("//input[@name='UserPhone']");
	By companyname=By.xpath("//input[@name='CompanyName']");
	By companyemployees=By.xpath("//select[@name='CompanyEmployees']");
	By countryname=By.xpath("//input[@name='CompanyCountry']");

	public SignUpPageObject(WebDriver driver2) {
       this.driver=driver2;
	
	}
	public WebElement enterfirstname() {
    return driver.findElement(firstname);
	}
    public WebElement enterlastname() {
    return driver.findElement(LastName);
    }
    public WebElement enterjobtitle() {
    return driver.findElement(jobtitle);
    }
    public WebElement enteremail() {
    return driver.findElement(email);
    }  	
     public WebElement enterphoneno() {
     return driver.findElement(phoneno);
     }       	
     
     public WebElement entercompanyname() {
     return driver.findElement(companyname);
         }       	
     public WebElement selectcompanyemployees()  { 
     return driver.findElement(companyemployees);
     }
     public WebElement selectcountryname()  { 
     return driver.findElement(countryname);
         }

		
}
	
		


