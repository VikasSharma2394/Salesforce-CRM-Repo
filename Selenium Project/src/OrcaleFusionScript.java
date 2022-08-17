import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrcaleFusionScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas.sharma\\Downloads\\chromedriver_win32_100\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://eglz-dev2.fa.us2.oraclecloud.com");
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/main/form/input[1]")).sendKeys("dmclaugh");
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/main/form/input[2]")).sendKeys("Opkey2020");
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/main/form/button")).click();
		driver.findElement(By.xpath(".//a[contains(@id,'pt1') and contains(@class,'TabletNavigatorIcon svg-glob xkn p_AFIconOnly')]")).click();
		driver.findElement(By.xpath(".//div[contains(@id,'pt1') and contains(@title,'My Team')]")).click();
		driver.findElement(By.xpath(".//a[contains(@id,'pt1') and contains(@title,'My Team') and contains(@class,'svg-func svg-navmenu size24 x3it x3iu xkn')]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/form/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/div/div/div[1]/div/table/tbody/tr/td[2]/div/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div/div/div/div/div[9]/div[2]/div/div/div[1]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/form/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/div/div/div[1]/div/table/tbody/tr/td[2]/div/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div/div/div/div/div[9]/div[2]/div/div/div[1]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/input")).sendKeys("Verified");
		System.out.println("Executed");
		Thread.sleep(10000);
		driver.quit();
	}

}
