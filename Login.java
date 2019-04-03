package PomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Login {
	WebDriver driver;
	//in order to do custom input we can pass username and password as parameters to the login method
	//login(String usernamevalue,String passwordvalue)
	public void login()
	{
		System.setProperty("webdriver.gecko.driver", "./exec/geckodriver.exe");		
		 driver=new FirefoxDriver();
		/* need to pass the website url from here
		 or else we can have property file to read the url from porperty file
		 So that we can change url with out disturbing the code base */		 
		driver.get("WebSite url to be passed here");
		
	}
	
	public void valiLogin()
	{
		driver.findElement(By.id("username")).sendKeys("coding@project.com");
		driver.findElement(By.id("password")).sendKeys("Coding@123");
		String message=driver.findElement(By.id("successMessage")).getText();
		Assert.assertEquals(message, "You have logged in successfully");
	}
	
	public NeedHelpPage clickNeedHelp()
	{
		driver.findElement(By.id("username")).sendKeys("coding@project.com");
		return new NeedHelpPage(driver);
	}
	
	public void invaliEmailLogin()
	{
		driver.findElement(By.id("username")).sendKeys("invalid@project.com");
		driver.findElement(By.id("password")).sendKeys("Coding@123");
		String message=driver.findElement(By.id("failMessage")).getText();
		Assert.assertEquals(message, "Wrong email address");
	}

	public void invaliPasswordLogin()
	{
		driver.findElement(By.id("username")).sendKeys("coding@project.com");
		driver.findElement(By.id("password")).sendKeys("Coding@12");
		String message=driver.findElement(By.id("failMessage")).getText();
		Assert.assertEquals(message, "Email address and password doesn’t match");
	}
	
	public String getErroMessage()
	{
		return driver.findElement(By.id("errormessage")).getText();
	}
}
