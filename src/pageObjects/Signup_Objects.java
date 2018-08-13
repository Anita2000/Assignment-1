package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Signup_Objects {
	
	static WebElement element;
    public static WebElement txtbx_FirstName(WebDriver driver){
    	 
        element = driver.findElement(By.xpath(".//*[@id='BV_name_first']"));
        //Log.info("Username is found");
        return element;

        }
    
    public static WebElement txtbx_LastName(WebDriver driver){
   	 
        element = driver.findElement(By.xpath(".//*[@id='BV_name_last']"));
        //Log.info("Username is found");
        return element;

        }
    public static WebElement txtbx_Zipcode(WebDriver driver){
   	 
        element = driver.findElement(By.xpath(".//*[@id='BV_zip']"));
        //Log.info("Username is found");
        return element;

        }
    public static WebElement txtbx_Phonenumber(WebDriver driver){
   	 
        element = driver.findElement(By.xpath(".//*[@id='BV_telephone1']"));
        //Log.info("Username is found");
        return element;

        }
    
    public static WebElement txtbx_Email(WebDriver driver){
   	 
        element = driver.findElement(By.xpath(".//*[@id='BV_email']"));
        //Log.info("Username is found");
        return element;

        }
    
    public static WebElement txtbx_ConfEmail(WebDriver driver){
   	 
        element = driver.findElement(By.xpath(".//*[@id='BV_confemail']"));
        //Log.info("Username is found");
        return element;

        }
    public static WebElement txtbx_ConfPassword(WebDriver driver){
   	 
        element = driver.findElement(By.xpath(".//*[@id='BV_confpassword']"));
        //Log.info("Username is found");
        return element;

        }
    
    

    public static WebElement txtbx_Password(WebDriver driver){

        element = driver.findElement(By.xpath(".//*[@id='BV_regpassword']"));
       

        return element;

        }
    
    public static Select dropdown_Month(WebDriver driver){
   	 
        element = driver.findElement(By.xpath(".//*[@id='dob_month']"));
		Select mnth=new Select(element);
        
        return mnth;

        }
    public static Select dropdown_Day(WebDriver driver){
      	 
        element = driver.findElement(By.xpath(".//*[@id='dob_day']"));
		Select dd=new Select(element);
        
        return dd;

        }
    public static Select dropdown_Year(WebDriver driver){
      	 
        element = driver.findElement(By.xpath(".//*[@id='dob_year']"));
        Select yr=new Select(element);
        return yr;

        }

    public static WebElement btn_Submit(WebDriver driver){

        element = driver.findElement(By.xpath(".//*[@id='submit']"));
       

        return element;

        }
    
    public static WebElement btn_Signup(WebDriver driver){

        element = driver.findElement(By.xpath(".//*[@id='sso']/div[1]/div[2]/div[2]/div[2]/div/a"));
       

        return element;

        }

}
