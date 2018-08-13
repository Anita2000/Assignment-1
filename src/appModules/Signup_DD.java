package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.Constant;

//import Utilities.Constant;
//import Utilities.ExcelUtils_SignUp;
//import ObjectRepository.S_SignUP_OR;

public class Signup_DD {
	
	static WebDriver driver;
	@BeforeTest
	public void launch()
	{
		driver=new FirefoxDriver();
		driver.get("");
		driver.manage().window().maximize();
	}
	@Test
	public void signup() throws Exception
	{
		driver.switchTo().frame("support_iframe");
		
		S_SignUP_OR.btn_Signup(driver).click();
		Utilities.ExcelUtils_SignUp.setExcelFile(Utilities.Constant.Path_TestData+Utilities.Constant.File_TestData, "Sheet2");
		for(int i=1;i<3;i++)
		{
			
		S_SignUP_OR.txtbx_FirstName(driver).sendKeys(ExcelUtils_SignUp.getStringcellData(i, 0));
		Thread.sleep(3000);
		
		S_SignUP_OR.txtbx_LastName(driver).sendKeys(ExcelUtils_SignUp.getStringcellData(i, 1));
		Thread.sleep(3000);
		double zip=ExcelUtils_SignUp.getNumericCellData(i, 2);
		S_SignUP_OR.txtbx_Zip(driver).sendKeys(String.valueOf(zip));
		Thread.sleep(3000);
		int phone=(int) ExcelUtils_SignUp.getNumericCellData(i, 3);
		S_SignUP_OR.txtbx_Telephone(driver).sendKeys(String.valueOf(phone));
		Thread.sleep(3000);
		S_SignUP_OR.txtbx_Email(driver).sendKeys(ExcelUtils_SignUp.getStringcellData(i, 4));
		Thread.sleep(3000);
		S_SignUP_OR.txtbx_ConfEmail(driver).sendKeys(S_SignUP_OR.txtbx_Email(driver).getAttribute("value"));
		Thread.sleep(3000);
		
		S_SignUP_OR.txtbx_Passowrd1(driver).sendKeys(ExcelUtils_SignUp.getStringcellData(i, 6));
		Thread.sleep(3000);
		S_SignUP_OR.txtbx_ConfiPassword(driver).sendKeys(S_SignUP_OR.txtbx_Passowrd1(driver).getAttribute("value"));
		
		Select objselectM = new Select(S_SignUP_OR.dropdown_Month(driver));
		objselectM.selectByIndex(9);
		 
		Select objselectD = new Select(S_SignUP_OR.dropdown_Day(driver));
		objselectD.selectByIndex(9);
		
		Select objselectY = new Select(S_SignUP_OR.dropdown_Year(driver));
		objselectY.selectByIndex(16);
		
		S_SignUP_OR.btn_Submit(driver).click();
		
		// When Invalid Email is entered Excel Data will Loop in by clearing the Text(data) from all the below mentioned TextBox fields/ Else if signup successful below clear statements not required.
		//S_SignUP_OR.txtbx_FirstName(driver).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		//S_SignUP_OR.txtbx_LastName(driver).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		
		//Thread.sleep(3000);
		//Mouse over Element -User Account icon after successful signup.
		WebElement svgObject1 = driver.findElement(By.xpath(".//*[@id='inner-wrap']/nav/section[2]/div[3]/ul/li[3]/div"));
		    Actions builder = new Actions(driver);
		    builder.moveToElement(svgObject1).build().perform();			
		   
		    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		  
		    /* WebElement myDynamicElement = (new WebDriverWait(driver, 10))
		    		  .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Log Out")));*/
		   // WebElement submenu = driver.findElement(By.className("logout"));
		    //builder.moveToElement(submenu).click().build().perform();
		    
	}
}