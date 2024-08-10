package AutomationProject.AutomationFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMessage {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opencart.dhirajkulkarni.com/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys("abcd2108@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Abcd@1234");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(5000);
		String ExpectedAlertmsg = "Warning: No match for E-Mail Address and/or Password";
		//System.out.println("the expected alert message is "+ExpectedAlertmsg);
		String ActualAlertmsg =driver.findElement(By.id("alert")).getText();
		//System.out.println("the actual alert message is "+ActualAlertmsg);
		String ActualAlertmsg1= ActualAlertmsg.trim();
		 if(ActualAlertmsg1.equals(ExpectedAlertmsg)) {
			 
			 System.out.println("The Actual Alert and Expected Alert Texts are same ");
			  }
		 else {
			 System.out.println(" The Actual Alert and Expected Alert Texts are same ");
		 }
	}

}
