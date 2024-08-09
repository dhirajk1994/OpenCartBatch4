package AutomationProject.AutomationFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTests {

	@Test(description = "Validate logging into the Application using valid credentials")
	public void TC_ID01()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opencart.dhirajkulkarni.com/");
		driver.findElement(By.className("fa-user")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys("demo@demo.com");
		driver.findElement(By.id("input-password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		//validate steps
		
		
		
		
	}
	
}
