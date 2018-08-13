package Framework;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.Constant;

// Import package appModule.*

import appModules.SignIn;

import pageObjects.HomePage;

public class ModuleTC {

private static WebDriver driver = null;

public static void main(String[] args) throws Exception {

driver = new FirefoxDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get(Constant.URL);

// Use your Module SignIn now

appModules.SignIn.Execute(driver,Constant.Username,Constant.Password);

System.out.println("Login Successfully, now it is the time to Log Off buddy.");

//HomePage.lnk_LogOut(driver).click();

driver.quit();

}

}

