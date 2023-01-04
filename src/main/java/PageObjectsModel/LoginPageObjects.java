package PageObjectsModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
    public WebDriver driver;
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By login=By.xpath("//input[@id='Login']");
	private By tryforfree=By.xpath("//a[@id='signup_link']");	
	public By errorMessage=By.xpath("//div[@id='error']]");
	
	public LoginPageObjects(WebDriver driver2) {
      this.driver=driver2;
	}

	public WebElement enterUsername() {
	 return driver.findElement(username);
	}

     public WebElement enterPassword() {
     return driver.findElement(password);
     }	

     public WebElement clickOnlogin() {
	 return driver.findElement(login);
     }
	 public WebElement clickOntryforfree() {
	 return driver.findElement(tryforfree);
	 }

	  public WebElement errormessage() {
	  return driver.findElement(errorMessage);
		     }
	 
	 
	 
	 	
	
}

