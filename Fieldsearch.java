package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Fieldsearch 
{
	static WebDriver driver;
	public Fieldsearch(WebDriver d)
	{
		driver = d;
	}
	
	public void prodsearch(String prod)
	{
		WebElement pro = driver.findElement(By.id("gh-ac"));
		pro.sendKeys(prod);
		driver.findElement(By.id("gh-btn")).click();
	} 
	
	public void catsearch(String cat, String prod)
	{
		WebElement ddcat = driver.findElement(By.id("gh-cat"));
		Select s= new Select(ddcat);
		s.selectByVisibleText(cat);
		
		prodsearch(prod);
	} 

}
