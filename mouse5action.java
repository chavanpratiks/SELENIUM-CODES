import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse5action {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions mouse = new Actions(driver);
		mouse.dragAndDropBy(driver.findElement(By.xpath("//div[@id='draggable']")),100,100).build().perform();

	}

}
