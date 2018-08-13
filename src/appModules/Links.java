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

public class Links {
	
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
		List <WebElement> LeLinks=driver.findElements(By.linkText("EXPLORE"));
		//List <WebElement> LeLinks=driver.findElements(By.xpath(".//*[@id='benefits']/div/div/div[2]/div/div/a"));
		System.out.println(LeLinks.size());
		String[] expected = {"Home", "Mobile"};
		List <WebElement> allOptions = driver.findElements(By.xpath("//a[@class='col-lg-12 col-lg-offset-1 breadscrumb__path']"));
		for(int i=0;i<LeLinks.size();i++)
		{
			WebElement ele=null;
			if(i<LeLinks.size())
			{
				List <WebElement> LeLinks2=driver.findElements(By.linkText("EXPLORE"));
				ele=LeLinks2.get(i);
				System.out.println(LeLinks2.get(i).getText());
						ele.click();
			}
		
			Thread.sleep(10000);
			
			driver.navigate().back();
			
		}
		
	}

}
