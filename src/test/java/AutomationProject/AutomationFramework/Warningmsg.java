package AutomationProject.AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Warningmsg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opencart.dhirajkulkarni.com");
driver.findElement(By.xpath("//span[text()='My Account']")).click();
driver.findElement(By.xpath("//a[text()='Login']")).click();
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("amruta@gmail.com");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("amruta@123");
driver.findElement(By.xpath("//button[text()='Login']")).click();
Thread.sleep(5000);
//driver.switchTo().alert();
String ExpectedAlertmsg = "Warning: No match for E-Mail Address and/or Password";
String ActualAlertmsg =driver.findElement(By.id("alert")).getText();
String ActualAlertmsg1= ActualAlertmsg.trim();
 if(ActualAlertmsg1.equals(ExpectedAlertmsg)) {

	 System.out.println("Test case passed");

	  }
 else {
	 System.out.println("Test case failed");

 }
}

	}


