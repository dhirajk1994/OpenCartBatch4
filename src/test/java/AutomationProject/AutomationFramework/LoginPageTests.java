package AutomationProject.AutomationFramework;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import baseDriver.initDriver;
import pageElements.LogInPage;
import utils.CaptureScreenshot;
import utils.WebelementActions;

public class LoginPageTests {

	WebDriver driver=null;

	@Test(description = "Validate logging into the Application using valid credentials")
	public void TC_ID01()
	{
		driver=initDriver.loadDriver("Chrome");

		WebelementActions.clickOnWebelement(LogInPage.loginIcon(driver));
		WebelementActions.clickOnWebelement(LogInPage.loginDropdownText(driver));
		WebelementActions.sendTextToElement(LogInPage.inputEmail(driver), "Demo@demo.com");
		WebelementActions.sendTextToElement(LogInPage.inputPassword(driver), "password1");
		WebelementActions.clickOnWebelement(LogInPage.LoginButton(driver));

		//validate steps
		String expectedAlert="Predefined alert";
		String actualAlert=driver.findElement(By.id("alert")).getText();
		Assert.assertEquals(actualAlert, expectedAlert);
		
	}
	
	@Test(description = "Demo Test Case to validate title of home page")
	public void TC_02()
	{
		driver=initDriver.loadDriver("abcd");
		String actualTitle=driver.getTitle();
		String expectedTitle="Demo";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(description = "Validate functionality of Register(Continue) button on Login Page")
	public void TC_ID_03()
	{
		driver=initDriver.loadDriver("Chrome");
		
		WebelementActions.clickOnWebelement(LogInPage.loginIcon(driver));
		WebelementActions.clickOnWebelement(LogInPage.loginDropdownText(driver));
		WebelementActions.clickOnWebelement(LogInPage.continueButtononLoginPage(driver));
		//Validation
		String actualRegistrationPageTitle=driver.getTitle();
		String expectedRegistrationPageTitle="Register Account";
		Assert.assertEquals(actualRegistrationPageTitle, expectedRegistrationPageTitle);
	
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		CaptureScreenshot.getScreenshot(driver);
		System.out.println("Quitting Browser");
		driver.quit();
	}
}
