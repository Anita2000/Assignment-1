package appModules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Breadcrum {

	@Test
	public void breadcrumlinks()
	{
	   System.setProperty("webdriver.gecko.driver", "/Users/lucianoaltomare/Downloads/geckodriver");
		WebDriver driver=new FirefoxDriver();
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("First");
		alist.add("Second");
		alist.add("Third");

	List<WebElement> breadcrumbs = driver.findElements(By.cssSelector("ol.breadcrumb li a"));
	for (int i = 0; i < alist.size(); i++) {
	    String breadcrumb = breadcrumbs.get(i).getText();
	  /*  if (breadcrumb.equals(alist [i])) {
	        System.out.println("passed on: " + breadcrumb);
	    } else {
	        System.out.println("failed on: " + breadcrumb);
	    }*/
	}
	}
}
