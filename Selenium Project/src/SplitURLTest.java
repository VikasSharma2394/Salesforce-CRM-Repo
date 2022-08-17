import java.util.ArrayList;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class SplitURLTest  {
	public static void main(String[] args)throws Exception {System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\SSTS\\OpKey\\OpKey Execution Agent\\AgentData\\Plugins\\libs\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://cresconnect.crestechglobal.com/");
		String url = driver.getCurrentUrl();
		if(url.contains("Vikas")) {
			System.out.println("Page is opened in lightning mode");
		}else {
			driver.findElement(By.name("username")).sendKeys("Pass");
			System.out.println("Switched to lightning mode");
		}
		Thread.sleep(5000);
		driver.quit();
		
	}

	}
