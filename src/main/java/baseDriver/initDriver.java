package baseDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class initDriver {

	
	public static WebDriver loadDriver(String browserName)
	{
		WebDriver driver=null;
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("Firefox")) {
			driver= new FirefoxDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
		driver.get("https://opencart.dhirajkulkarni.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		return driver;
	}
	
	
}
