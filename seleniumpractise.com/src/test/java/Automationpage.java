

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Automationpage {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2500);
        driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2500);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2500);

		Thread.sleep(2500);
		driver.quit();
}
}
