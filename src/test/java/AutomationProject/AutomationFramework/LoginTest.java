package AutomationProject.AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	@ Test
	public void testL() {

				WebDriver driver= new ChromeDriver();
				driver.get("https://opencart.dhirajkulkarni.com/");
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//span[text()='My Account']")).click();
				driver.findElement(By.xpath("//a[text()='Login']")).click();
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gaikwadrahul821@gmail.com");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Buddham@821");
				//driver.findElement(By.xpath("//button[@type='submit']")).click();
				driver.findElement(By.xpath("//button[text()='Login']")).click();
				
				}
}
