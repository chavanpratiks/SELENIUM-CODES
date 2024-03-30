import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhabdle3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctctourism.com/");
		String window =driver.getWindowHandle();
		String window1 =driver.getTitle();
		driver.findElement(By.linkText("Lounge")).click();
	     ArrayList <String> tabs = new ArrayList <> (driver.getWindowHandles());
	     driver.switchTo().window(tabs.get(1));
	     String window2 =driver.getTitle();

	}

}
