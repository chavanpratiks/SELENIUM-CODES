import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicexpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/div/div/form/div/div[1]/input")).sendKeys("chavanabhishek724@gmail.com");
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/div/div/form/div/div[2]/input")).sendKeys("Pratik@123");
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/div/div/form/button")).click();

	}

}
