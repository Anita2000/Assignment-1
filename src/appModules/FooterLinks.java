package appModules;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FooterLinks {
	static String value="TVs";
	public static void main(String[] args) throws InterruptedException {
		 
		
		WebDriver driver = new FirefoxDriver();
 
		driver.navigate().to("http://www.samsung.com/us/mobile");  // Use navigate instead of driver.get() 
		 
		WebElement footer= driver.findElement(By.xpath(".//*[@id='footer']/div[1]/div/div/div[1]/div[2]/div"));  // Get Footer element which contains all footer links
		  System.out.println(footer.findElements(By.tagName("a")).size()) ; 
		  List<WebElement> footlinks = footer.findElements(By.tagName("li"));
		  int i = footer.findElements(By.tagName("a")).size(); //Get number of links
		 
		  for(int j = 0;j<i;j++){    //create loop based upon number of links to traverse all links 
		   footer= driver.findElement(By.xpath("//html/body/div[3]/div/footer/div[1]/div")); 
		   // We are re-creating "footer" webelement as DOM changes after navigate.back()
		   footer.findElements(By.tagName("li")).get(j).getText();
		   footer.findElements(By.tagName("li")).get(j).click();
		      Thread.sleep(3000);
		   System.out.println(driver.getTitle());
		      if(driver.getTitle().contains("404")) {
		       System.out.println("404 Found");
		      }
		      driver.navigate().back();
		   Thread.sleep(4000);
		   try {
   	        WebDriverWait wait = new WebDriverWait(driver, 5);
   	        wait.until(ExpectedConditions.alertIsPresent());
   	        Alert alert = driver.switchTo().alert();
   	        alert.dismiss();
   	        
   	    } catch (Exception e) {
   	        //exception handling
   	    	
   	    		    	
   	    	
   	    	}
   	    
   	    }
		  
		  
		 }}


