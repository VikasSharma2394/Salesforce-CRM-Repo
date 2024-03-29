package TestScript;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGoogle {
	static WebDriver driver;
	@Test
	public void JavaScriptTest() throws Exception {
		try {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='VikasSharma'", driver.findElement(By.name("q")));
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("D:\\Snapshot\\WebDriver2.png");
		FileUtils.copyFile(srcFile, destFile);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		driver.findElement(By.name("q")).clear();
		StringSelection selection = new StringSelection("beautiful");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Actions actions = new Actions(driver);
		actions.keyDown(driver.findElement(By.name("q")),Keys.SHIFT).sendKeys("vikas").build().perform();
		actions.clickAndHold().build().perform();
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, "https://www.google.com/");
		actions.dragAndDropBy(driver.findElement(By.name("q")), 30, 154);
		int size = driver.findElements(By.tagName(currentURL)).size();
		System.out.println(size);
		Thread.sleep(5000);
		}
		finally {
		driver.quit();
		}
	}
	@Test
	public void Test12() {
		System.out.println("Test NG Execution Started");
	}
}
