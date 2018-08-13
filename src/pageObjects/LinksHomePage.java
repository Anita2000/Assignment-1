package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Log;


public class LinksHomePage {
	static WebElement element;
	
	public static int getNumberOfElementsFound(By by,WebDriver driver) {
	    return driver.findElements(by).size();
	}

	public static WebElement getElementWithIndex(By by, int pos,WebDriver driver) {
	    return driver.findElements(by).get(pos);
	}

}
