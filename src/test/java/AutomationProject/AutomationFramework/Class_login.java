package AutomationProject.AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class_login {
	@Test
	public void login() throws InterruptedException
	{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://opencart.dhirajkulkarni.com/");
	driver.findElement(By.xpath("//*[text()='My Account']")).click();
	driver.findElement(By.xpath("//*[text()='Login']")).click();
	driver.findElement(By.id("input-email")).sendKeys("nalawadebhagyashri99@gmail.com");///input automation
	driver.findElement(By.id("input-password")).sendKeys("admin123"); 
	
	driver.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();
	Thread.sleep(5000);
	driver.close();
   String u=driver.getCurrentUrl();
  
  
	if(u.equals("https://opencart.dhirajkulkarni.com/index.php?route=account/login&language=en-gb"))
   {
	   System.out.println("Test case is pass succesfully");
	   
    }
   else
   {
	 System.out.println("Test case is fail");

	 
    }
}
	
	

}
