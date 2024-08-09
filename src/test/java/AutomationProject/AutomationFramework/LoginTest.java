package AutomationProject.AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LoginTest {
	
	
	@ Test
	public void testL() throws InterruptedException {

				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://opencart.dhirajkulkarni.com/");
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//span[text()='My Account']")).click();
				driver.findElement(By.xpath("//a[text()='Login']")).click();
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testuser@gmail.com");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
				driver.findElement(By.xpath("//button[text()='Login']")).click();
				Thread.sleep(2000);
				driver.switchTo().alert();
				Thread.sleep(2000);
				WebElement alert = driver.findElement(By.id("alert"));
				
				if(alert.isDisplayed()) {
					System.out.println(alert.getText());
				}else {
				System.out.println("Alert message is not Displayed");
				}
//Verify alert msg text.
String Expectedmsg = "Warning: No match for E-Mail Address and/or Password.";
String Actualmsg = alert.getText();
if(Expectedmsg.equals(Actualmsg)) {
	System.out.println("Test case passed");
}else {
	System.out.println("Test case Failed");

}
}
}
