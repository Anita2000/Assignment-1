package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.ExcelUtils;
import pageObjects.Signup_Objects;

public class SignUp {
	
	static WebDriver driver;
	@BeforeTest
	public void launch()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.samsung.com/us/support/account");
		driver.manage().window().maximize();
	}
	@Test
	public void signup() throws Exception
	{
		driver.switchTo().frame("support_iframe");
		
		Signup_Objects.btn_Signup(driver).click();
		Utility.ExcelUtils.setExcelFile(Utility.Constant.Path_TestData+Utility.Constant.File_TestData, "Sheet2");
		for(int i=1;i<3;i++)
		{
		
				
		//String spassword=ExcelUtils.getCellData(i, 2);
		
		Signup_Objects.txtbx_FirstName(driver).sendKeys(ExcelUtils.getStringCellData(i, 0));
		Thread.sleep(3000);
		
		Signup_Objects.txtbx_LastName(driver).sendKeys(ExcelUtils.getStringCellData(i, 1));
		Thread.sleep(3000);
		double zip=ExcelUtils.getNumericCellData(i, 2);
		Signup_Objects.txtbx_Zipcode(driver).sendKeys(String.valueOf(zip));
		Thread.sleep(3000);
		double phone=ExcelUtils.getNumericCellData(i, 3);
		Signup_Objects.txtbx_Phonenumber(driver).sendKeys(String.valueOf(phone));
		Thread.sleep(3000);
		Signup_Objects.txtbx_Email(driver).sendKeys(ExcelUtils.getStringCellData(i, 4));
		Thread.sleep(3000);
		Signup_Objects.txtbx_ConfEmail(driver).sendKeys(Signup_Objects.txtbx_Email(driver).getAttribute("value"));
		Thread.sleep(3000);
		
		Signup_Objects.txtbx_Password(driver).sendKeys(ExcelUtils.getStringCellData(i, 6));
		Thread.sleep(3000);
		Signup_Objects.txtbx_ConfPassword(driver).sendKeys(Signup_Objects.txtbx_Password(driver).getAttribute("value"));
		Signup_Objects.dropdown_Month(driver).selectByVisibleText("3");
		Thread.sleep(3000);
		Signup_Objects.dropdown_Day(driver).selectByValue("23");
		Thread.sleep(3000);
		
		Signup_Objects.dropdown_Year(driver).selectByValue("1990");
		Thread.sleep(3000);
		Signup_Objects.btn_Submit(driver).click();
		Thread.sleep(3000);
		
		
		  

	}
}
}