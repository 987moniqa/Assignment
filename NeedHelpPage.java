package PomClasses;

import org.openqa.selenium.WebDriver;

public class NeedHelpPage {
	WebDriver driver;
	public NeedHelpPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}

}
