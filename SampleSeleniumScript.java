package assignment.com.MonikaAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleSeleniumScript {
	
	@Test
	public void WebTables()
	{
		//need to specify the driver location here
		System.setProperty("webdriver.gecko.driver", "./exec/geckodriver.exe");		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/sql/sql_join.asp");
		//xpath which return only the first table listed in the page 
		List<WebElement> trs=driver.findElements(By.xpath("//p[text()='and it will produce something like this:']/following-sibling::div[1]/table/tbody/tr"));
		//iterating through each and every row and the column available in the table
		for(WebElement tr:trs)
		{
			 trs=driver.findElements(By.xpath("//p[text()='and it will produce something like this:']/following-sibling::div[1]/table/tbody/tr"));
			List<WebElement> tds=tr.findElements(By.tagName("td"));
			for(WebElement td:tds)
				System.out.println(td.getText());
		}
		
	}
	

}
