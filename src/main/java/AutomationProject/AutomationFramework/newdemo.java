package AutomationProject.AutomationFramework;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
		String msg="Warning: No match for E-Mail Address and/or Password.";
		driver.get("https://opencart.dhirajkulkarni.com/index.php?route=account/login&language=en-gb");
		driver.findElement(By.id("input-email")).sendKeys("Dhiraj");
		driver.findElement(By.id("input-password")).sendKeys("dhrira");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		//driver.switchTo().alert();
		String s2 =driver.findElement(By.id("alert")).getText().toString();
		if(msg.equals(s2))
		{
			System.out.println("validation done");
		}
		else
		{
			System.out.println("validation fail");
		}
		
		
	//	System.out.println(msg.equals(s2));
		
		//driver.quit();
	//driver.quit();
	}

}
