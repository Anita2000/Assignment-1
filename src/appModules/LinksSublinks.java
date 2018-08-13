package appModules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class LinksSublinks {

	
	static WebDriver driver=new FirefoxDriver();
	private static String[] links = null;
	private static int linksCount = 0;
@Test
public void links() throws InterruptedException
{
	try {
	//driver=new FirefoxDriver();
	driver.get("http://www.samsung.com/us/mobile/");
	List<WebElement> linksize = driver.findElements(By.tagName("a")); 
	linksCount = linksize.size();
	System.out.println("Total no of links Available: "+linksCount);
	links= new String[linksCount];
	System.out.println("List of links Available: ");  
	// print all the links from webpage 
	//while(linksCount!=null)
	for(int i=0;i<linksCount;i++)
	{
	links[i] = linksize.get(i).getAttribute("href");
	System.out.println(linksize.get(i).getAttribute("href"));
	} 
	// navigate to each Link on the webpage
	for(int i=0;i<linksCount;i++)
	{
	driver.navigate().to(links[i]);
	Thread.sleep(3000);
	}
	 } catch (Exception e) {
         e.printStackTrace();
     }
     
}


@AfterClass
public void tearDown(){
    driver.close();
    driver.quit();
}
}

