package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HP1 {

	
	WebElement ele=null;
	
	public WebElement MAct(WebDriver driver)
	{
		ele=driver.findElement(By.id("act"));
		return ele;
	}
}
