package appModules;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LinksHomePage;

public class LeLinks {
	
	static WebDriver driver;
	@BeforeTest
	public void launch()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.samsung.com/us/mobile/");
		driver.manage().window().maximize();
	}
	@Test
public void links() throws InterruptedException
	{
		//List <WebElement> atags=driver.findElements(By.tagName("a"));
		List <WebElement> litags=driver.findElements(By.tagName("li"));
		//List <WebElement> LeLinks=driver.findElements(By.xpath(".//*[@id='benefits']/div/div/div[2]/div/div/a"));
		System.out.println(litags.size());
		for(int i=0;i<litags.size();i++)
		{
			WebElement ele=null;
			if(i<litags.size())
			{
				List <WebElement> litags2=driver.findElements(By.tagName("li"));
				ele=litags2.get(i);
				System.out.println(litags2.get(i).getText());
						ele.click();
			
			}
			Thread.sleep(10000);
			
			driver.navigate().back();
			}
		
	}

}
