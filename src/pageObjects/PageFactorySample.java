package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;

public class PageFactorySample {

	static WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//html/body/div[2]/div/div/header/div[2]/a")
	@CacheLookup
	static WebElement lnk_MyAccount;
	
	@FindBy(how=How.ID, using="log")
	static WebElement txtbx_UserName;
	
	@FindBy(how=How.ID, using="pwd")
	static WebElement txtbx_Password;
	
	public static void main(String[] args)
	{
		driver=new FirefoxDriver();
		driver.get("http://store.demoqa.com/");
		PageFactory.initElements(driver, PageFactorySample.class);
		lnk_MyAccount.click();
		txtbx_UserName.sendKeys("testuser001");
		txtbx_Password.sendKeys("test1243");
		//driver.quit();
	}
	
	
}
