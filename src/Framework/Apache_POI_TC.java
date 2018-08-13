package Framework;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.*;

import Utility.Constant;

// Import Package utility.*

import Utility.ExcelUtils;
import appModules.SignIn;
import appModules.SignIn;

public class Apache_POI_TC {

 private static WebDriver driver = null;

public static void main(String[] args) throws Exception {

      //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method

	//Utility.Constant.File_TestData=null;
	System.gc();
      Utility.ExcelUtils.setExcelFile(Utility.Constant.Path_TestData, "Sheet1");

      driver = new FirefoxDriver();

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get(Utility.Constant.URL);

      SignIn.Execute(driver, Utility.Constant.Path_TestData+Utility.Constant.File_TestData, "Sheet1");

      System.out.println("Login Successfully, now it is the time to Log Off buddy.");

     // HomePage.lnk_LogOut(driver).click(); 

      //driver.quit();

      //This is to send the PASS value to the Excel sheet in the result column.

      //Utility.ExcelUtils.getCellData(2, 3);

}

}

