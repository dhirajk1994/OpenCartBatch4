package utils;

import org.openqa.selenium.WebElement;

public class WebelementActions {

	
	public static void clickOnWebelement(WebElement target)
	{
		target.click();
	}
	
	public static void sendTextToElement(WebElement target, String text)
	{
		target.sendKeys(text);
	}
	
}
