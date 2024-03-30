import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Containsmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
   WebDriver driver = new ChromeDriver();
   
driver.get("https://www.facebook.com");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[contains(text (),'Create new account')]")).click();
	}

} 
