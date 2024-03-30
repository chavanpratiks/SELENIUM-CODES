import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("humidifiers for bedroom");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//span[contains(text (),'Home & Kitchen')])[1]")).click();
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.xpath("//img[@alt=\"Toys under $25\"]")).click();
driver.findElement(By.xpath("(//img[@ class=\"s-image\"])[2]")).click();
driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("(//span[@class='sponsored-products-deal-discount-text a-text-strike'])[5]")).click();
	}

}
