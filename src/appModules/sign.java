package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.ExcelUtils;

public class sign {
	
	static WebDriver driver;
	@BeforeTest
	public void launch()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.samsung.com/us/support/account/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void signin() throws Exception
	{
		//driver.switchTo().frame(0);
		//WebElement form=driver.findElement(By.xpath(".//*[@id='fm1']"));
		Utility.ExcelUtils.setExcelFile(Utility.Constant.Path_TestData+Utility.Constant.File_TestData, "Sheet1");
		for(int i=1;i<3;i++){
			String suserName=ExcelUtils.getStringCellData(i, 1);
				
		String spassword=ExcelUtils.getStringCellData(i, 2);
		//WebElement un=driver.findElement(By.xpath(".//*[@id='user_email']"));
		pageObjects.SignIn_PO.txtbx_UserName(driver).sendKeys("ss1s@gmail.com");
		//WebElement password=driver.findElement(By.xpath(".//*[@id='reg_password']"));
		pageObjects.SignIn_PO.txtbx_Password(driver).sendKeys("PasswordA1");
		pageObjects.SignIn_PO.btn_LogIn(driver).click();
		Thread.sleep(5000);
		//Actions action=new Actions(driver);
		//WebElement ele=driver.findElement(By.xpath(".//*[@id='inner-wrap']/nav/section[2]/div[3]/ul/li[3]"));
		//action.moveToElement(ele).moveToElement(driver.findElement(By.xpath(".//*[@id='inner-wrap']/nav/section[5]/div/ul/li[5]/a"))).click().build().perform();
		//pageObjects.SignIn_PO.btn_LogOut(driver).click();
		WebElement svgObject1 = driver.findElement(By.xpath(".//*[@id='inner-wrap']/nav/section[2]/div[3]/ul/li[3]/div"));
	
		
		
		Actions builder = new Actions(driver);
	    builder.moveToElement(svgObject1).build().perform();			
	   
	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	  
	    /* WebElement myDynamicElement = (new WebDriverWait(driver, 10))
	    		  .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Log Out")));*/
	    WebElement submenu = driver.findElement(By.className("logout"));
	    builder.moveToElement(submenu).click().build().perform();
	  
		
			}
		}
	

}

