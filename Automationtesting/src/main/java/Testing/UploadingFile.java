package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadingFile {
	@Test
	public void file() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "B:\\work space\\Automationtesting\\Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demo.guru99.com/test/upload/");
	Thread.sleep(2000);
	driver.findElement(By.name("uploadfile_0")).sendKeys("B:\\AutomationProject\\Automationtesting\\ScreenShot\\facebook.png");
	driver.findElement(By.xpath("//input[@id='terms']")).click();
	driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
	driver.close();
	}

}