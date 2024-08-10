package AutomationProject.AutomationFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Assert;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class LoginPageTests {

	public void TC_ID01()
	{
		//WebDriver driver=new ChromeDriver();
	//	WebDriver driver=new chromeDriver();
	     WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opencart.dhirajkulkarni.com/");
		driver.findElement(By.className("fa-user")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys("nalawadebhagyashri99@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		//validate steps
		
		String actualResult="https://opencart.dhirajkulkarni.com/index.php?route=account/login&language=en-gb";
		String expectedResult="https://opencart.dhirajkulkarni.com/index.php?route=account/login&language=en-gb";
		Assert.assertEquals(actualResult,expectedResult,"valid user name and  valid paswword");
		System.out.print("valid user name and  valid paswword");
		

		
		
	}
	
}
