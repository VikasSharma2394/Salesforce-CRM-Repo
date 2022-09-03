package PracticePackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebWindowhandle {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Lead Test\\chromedriver_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airindia.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/form[1]/div[4]/div/div[5]/div/div/div[2]/a/img")).click();
		Thread.sleep(2000);
		Set windowsID = driver.getWindowHandles();
		Object [] data = windowsID.toArray();
		driver.switchTo().window((String)data[0]);
		Thread.sleep(5000);
	    driver.quit();
	}

}
