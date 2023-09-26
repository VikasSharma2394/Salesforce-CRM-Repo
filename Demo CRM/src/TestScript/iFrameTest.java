package TestScript;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrameTest {
	static WebDriver driver;
	@Test
	public void iFrame()throws Exception {
		try {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		int size = driver.findElements(By.tagName("iframe")).size();
		for(int i=0; i<=size; i++) {
			System.out.println(i);
		}
		File file = new File("");
		WebElement element = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
	    driver.switchTo().frame(element);
	    driver.findElement(By.xpath("//*[@id=\"portfolio_items\"]/div[5]/a/div/div/div[1]/img")).click();
		}
	    	finally {
	    driver.quit();
	    	}
	}
	@Ignore
	public void startSuite() {
		System.out.println("Execution Started");
	}

}
