import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.findElement(By.linkText("CONTINUE")).click();
		Alert alert =driver.switchTo().alert();
	
		
	}

}
