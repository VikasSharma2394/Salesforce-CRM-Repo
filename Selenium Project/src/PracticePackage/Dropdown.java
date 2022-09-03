package PracticePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Lead Test\\chromedriver_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airindia.in/");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(("//*[@id=\"concessionaryType1\"]"))));
		Thread.sleep(2000);
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"concessionaryType1\"]")));
		select.selectByIndex(2);
		driver.quit();
	}
}
