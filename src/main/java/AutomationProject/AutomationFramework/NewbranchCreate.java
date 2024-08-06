package AutomationProject.AutomationFramework;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewbranchCreate {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opencart.dhirajkulkarni.com/index.php?route=account/login&language=en-gb");
		driver.findElement(By.id("input-email")).sendKeys("Hema.gosavi");
		driver.findElement(By.id("input-password")).sendKeys("Hema");
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		//driver.quit();
		

	}

}
