import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.irctctourism.com/");
//		 String window = driver.getWindowHandle();
//		 String window1 = driver.getTitle();
//		 Thread.sleep(1000);
//		 driver.findElement(By.linkText("Bus Tickets")).click();
//		  ArrayList <String> tabs  =  new ArrayList<>(driver.getWindowHandles());
//		  driver.switchTo().window(tabs.get(1));
//		  String window2 = driver.getTitle();
//		 
//		WebDriver driver = new ChromeDriver();
//		driver.get("https:www.irctctourism.com/");
//	 String window =driver.getWindowHandle();
//	 String window1 = driver.getTitle();
//	 Thread.sleep(1000);
//	 driver.findElement(By.linkText("Bus Tickets")).click();
//	 ArrayList <String> tabs  =new ArrayList<> (driver.getWindowHandles());
//	 driver.switchTo().window(tabs.get(1));
//	 String window2 = driver.getTitle();
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.irctctourism.com/");
		String window =driver.getWindowHandle();
		String window2 =driver.getTitle();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Retiring Room")).click();
		ArrayList <String> tabs = new ArrayList <>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
		String window3 = driver.getTitle();
		
		
	 }

}
