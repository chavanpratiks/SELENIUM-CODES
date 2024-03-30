import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Examplesoftassertmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		String actualresult= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String expectedresult="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualresult, expectedresult);
		softassert.assertAll();
//		driver.close();
		
				
				

	}

}
