package PracticePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","E:\\Lead Test\\chromedriver_104\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');", driver.findElement(By.xpath("//input[@type='submit']")));
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(3000);
	String alertText = driver.switchTo().alert().getText();
	System.out.println(alertText);
	driver.switchTo().alert().dismiss();
	driver.quit();
}
}
