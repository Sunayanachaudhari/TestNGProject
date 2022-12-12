package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
     public WebDriver driver;
	public void browserIntialization() throws IOException {
	
	 //to read the browser file
	FileInputStream fis=new FileInputStream("C:\\Users\\Sunayanakhairnar\\eclipse-workspace\\SETestNGProject\\src\\main\\java\\Resources\\data.properties");
	
	//to access the properties file
	Properties prop=new Properties();       
	prop.load(fis);
	String browsername=prop.getProperty("browser");
	 
	if(browsername.equalsIgnoreCase("chrome")) {
		
		driver=new ChromeDriver() ;
			
	}else if(browsername.equalsIgnoreCase("firefox"))	{

		//firefox code
	}else {	
	System.out.println("please enter valid browser name");
		
	}		
}
	}

	