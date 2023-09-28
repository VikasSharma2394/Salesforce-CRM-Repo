package Practice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.html5.RemoteWebStorage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTest {
	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://cresconnect.crestechglobal.com/");
		Actions actions = new Actions(driver);
		actions.keyDown(driver.findElement(By.name("username")), Keys.SHIFT).build().perform();
		actions.sendKeys(driver.findElement(By.name("username")),"Vikas").build().perform();
		actions.contextClick(driver.findElement(By.name("username"))).build().perform();
		driver.switchTo().alert().sendKeys("");
		TakesScreenshot srcShot = (TakesScreenshot)driver;
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("D:\\WowSnap.png");
		FileUtils.copyFile(srcFile, destFile);
		Thread.sleep(5000);
		driver.quit();
	}

}
