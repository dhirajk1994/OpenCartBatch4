package AutomationProject.AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SigninA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://opencart.dhirajkulkarni.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("123@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

}
