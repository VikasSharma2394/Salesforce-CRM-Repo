import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikas.sharma\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test.salesforce.com/");
		Thread.sleep(200000);
		driver.findElement(By.xpath("//text()[normalize-space(.) = \"Update Opportunity Stage\"]")).click();
		driver.quit();
	}

}