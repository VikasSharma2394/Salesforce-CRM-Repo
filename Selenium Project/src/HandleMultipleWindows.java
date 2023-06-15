import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VIKAS~1.SHA\\AppData\\Local\\CresTech\\OpKey\\AgentData\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://recruiter.monsterindia.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/a")).click();
		Set<String> windowsID = driver.getWindowHandles();
		Object [] data = windowsID.toArray();
		driver.switchTo().window((String)data[0]);
		Thread.sleep(5000);
		driver.switchTo().window((String)data[1]);
		Thread.sleep(5000);
		driver.switchTo().window((String)data[0]);
		Thread.sleep(5000);
		driver.quit();
	}

}
