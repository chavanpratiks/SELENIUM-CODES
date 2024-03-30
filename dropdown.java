import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
//	public static Select select;


	public static void main(String[] args) throws InterruptedException {
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.facebook.com");
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	driver.findElement(By.xpath("(//a[\"contains(text,()'Create new account')\"])[3]")).click();
//	Select select = new Select(driver.findElement(By.id("day")));
//	select.selectByVisibleText("10");
//	select = new Select(driver.findElement(By.id("month")));
//	select.selectByVisibleText("Jul");
//	select = new Select(driver.findElement(By.id("year")));
//	select.selectByVisibleText("2000");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Select select = new Select(driver.findElement(By.id("day")));
		Thread.sleep(1000);
		select.selectByVisibleText("7");
		
		

	}

}
