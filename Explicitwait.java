import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
//		driver.findElement(By.name("firstname")).sendKeys("Arun");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys("Aniket");
	}
}
