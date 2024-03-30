import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction4 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/webtables");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@class='text'])[5]")).click();
	Actions mouse = new Actions (driver);
	mouse.contextClick(driver.findElement(By.xpath("//button[@id='rightClickBtn']"))).build().perform();
	
	

	}

}
