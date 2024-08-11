package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LogInPage {


	public static WebElement loginIcon(WebDriver driver)
	{
		return driver.findElement(By.className("fa-user"));
	}
	
	public static WebElement loginDropdownText(WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[text()='Login']"));
	}
	
	
	public static WebElement continueButtononLoginPage(WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[text()='Continue']"));
	}
	
	public static WebElement inputEmail(WebDriver driver)
	{
		return driver.findElement(By.id("input-email"));
	}
	
	public static WebElement inputPassword(WebDriver driver)
	{
		return driver.findElement(By.id("input-password"));
	}
	
	public static WebElement LoginButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[text()='Login']"));
	}
	
	
}
