package AutomationProject.AutomationFramework;
import java.time.Duration;


import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewbranchCreate {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opencart.dhirajkulkarni.com/index.php?route=account/login&language=en-gb");
		driver.findElement(By.id("input-email")).sendKeys("Hema.gosavi");
		driver.findElement(By.id("input-password")).sendKeys("Hema");
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		//driver.switchTo().alert();
		
		String s1="Warning: No match for E-Mail Address and/or Password.";
		
	
		String s2= driver.findElement(By.id("alert")).getText().toString();
		
		if(s1.equals(s2))
		{
			System.out.println("Given msg and web msg is Exactly same");
			
		}
		else
		{
			System.out.println("Not eqoal");
		}
		
		//driver.quit();
		

	}

}
