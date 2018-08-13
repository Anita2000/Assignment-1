package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Log;

public class SignIn_PO {

	static WebElement element;
    public static WebElement txtbx_UserName(WebDriver driver){
    	 
        element = driver.findElement(By.xpath(".//*[@id='user_email']"));
        //Log.info("Username is found");
        return element;

        }
    
    

    public static WebElement txtbx_Password(WebDriver driver){

        element = driver.findElement(By.xpath(".//*[@id='reg_password']"));
       

        return element;

        }

    public static WebElement btn_LogIn(WebDriver driver){

        element = driver.findElement(By.xpath(".//*[@id='login-submit']/span"));
       

        return element;

        }
    
    public static WebElement btn_LogOut(WebDriver driver){

        element = driver.findElement(By.xpath(".//*[@id='inner-wrap']/nav/section[5]/div/ul/li[5]/a"));
       

        return element;

        }
}
