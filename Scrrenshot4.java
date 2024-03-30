import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Scrrenshot4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctctourism.com/");
		File src = ((HasFullPageScreenshot)driver).getFullPageScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File("C:\\Users\\chava\\OneDrive\\Desktop\\Aru\\ss1.jpg"));
		}
		catch(Exception e) {
			
		}

	}

}
