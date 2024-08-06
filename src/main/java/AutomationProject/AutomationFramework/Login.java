package AutomationProject.AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// new class
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://opencart.dhirajkulkarni.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gaikwadrahul821@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Buddham@0821");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		String ExpectedUrl= driver.getCurrentUrl();
		
		if(ExpectedUrl.equals("https://opencart.dhirajkulkarni.com/")) {
			System.out.println("Login test is passed");
		}
		else {
			System.out.println("login test is failed");
		}
		
		
	}

}
