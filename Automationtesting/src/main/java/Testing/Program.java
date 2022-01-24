package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program {
	
	@Test
public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "B:\\work space\\Automationtesting\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium project" +Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("title of the page is " +title);
}
	

}
