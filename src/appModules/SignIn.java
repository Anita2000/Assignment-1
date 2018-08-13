package appModules;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;
import Utility.Log;
import pageObjects.HomePage;

import pageObjects.LoginPage;

public class SignIn{

public static void Execute(WebDriver driver,String sUsername,String sPassword) throws Exception{
	
	String suserName=ExcelUtils.getStringCellData(1, 1);
	
	Log.info("Username picked from excel");
	String spassword=ExcelUtils.getStringCellData(1, 2);
	Log.info("Password picked from excel");

HomePage.lnk_MyAccount(driver).click(); 
Log.info("Click is performed on my act");

LoginPage.txtbx_UserName(driver).sendKeys(suserName);
Log.info("Data entered into username");

LoginPage.txtbx_Password(driver).sendKeys(spassword);
Log.info("Data entered into pwd");
LoginPage.btn_LogIn(driver).click();
Log.info("Login button clicked");

//LoginPage.txtbx_UserName(driver).sendKeys(sUsername);
//LoginPage.txtbx_Password(driver).sendKeys(sPassword);
}

}
