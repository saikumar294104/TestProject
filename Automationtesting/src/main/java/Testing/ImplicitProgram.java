package Testing;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitProgram {
	@Test
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "B:\\work space\\Automationtesting\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("selenium")).sendKeys("sai123");
		driver.close();
		
	}

}
