package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser 
{
	static WebDriver driver;
	public static WebDriver StartBrowser(String BrowserName, String url)
	{
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().browserVersion("123").setup();
			driver = new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().browserVersion("124").setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		
		driver.get(url);
		return driver;
	}

}
