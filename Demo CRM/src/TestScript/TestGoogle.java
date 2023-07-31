package TestScript;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGoogle {
	@org.junit.Test
	public void Test() throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		//driver.findElement(By.name("dsdsdsds")).sendKeys("Vikas", Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='VikasSharma'", driver.findElement(By.name("q")));
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File("D:\\WebDriver.png");
		FileUtils.copyDirectory(srcFile, destFile);
		List list = driver.findElements(By.tagName("A"));
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.quit();
	}
}
