package Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

// Import package pageObject.*

import pageObjects.HomePage;

import pageObjects.LoginPage;

public class TC {

private static WebDriver driver = null;

public static void main(String[] args) {

driver = new FirefoxDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("http://www.store.demoqa.com");

// Use page Object library now

HomePage.lnk_MyAccount(driver).click();

LoginPage.txtbx_UserName(driver).sendKeys("testuser_1");

LoginPage.txtbx_Password(driver).sendKeys("Test@123");
LoginPage.btn_LogIn(driver).click();
System.out.println("Login Successfull");
//HomePage.lnk_LogOut(driver).click();




	}

}
