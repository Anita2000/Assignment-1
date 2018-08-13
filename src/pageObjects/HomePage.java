package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Log;
public class HomePage {
	
	private static WebElement element=null;
	
	public static WebElement lnk_MyAccount(WebDriver driver){
		 
	    element = driver.findElement(By.id("account"));
	   // Log.info("My Account link is clicked");
	 
	    return element;
	 
	    }
	 
	 public static WebElement lnk_LogOut(WebDriver driver){
	 
		 
	    element = driver.findElement(By.id("account_logout"));
	    Log.info("Log out link is available");
	 
	 return element;
 

}

	
}
