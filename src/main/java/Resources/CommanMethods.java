package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommanMethods {

	public static void selectDropdown(WebElement dropdown,int index) {

	      Select s=new Select(dropdown);
	      s.selectByIndex(index);
	      
	      Select s1=new Select(dropdown);
	      s1.selectByIndex(index);
	    

		
		
		
		
		
		
}
}