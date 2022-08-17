import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class launchBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\SSTS\\OpKey\\OpKey Execution Agent\\AgentData\\Plugins\\libs\\Drivers\\chromedriver.exe");		ChromeDriver driver = new ChromeDriver();
try{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://cresconnect.crestechglobal.com");
		driver.manage().window().maximize();
		String s = "VikasSharma";
		String reverse = "";
		String []s1 = s.split("s");
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		for(int i = s1[1].length()-1; i>=0; i--) {
			reverse = reverse + s1[1].charAt(i);
		}
		System.out.println(reverse);
		
		driver.findElement(By.name("username")).sendKeys(reverse);
		}catch(Exception e) {
			System.out.println(e);
		}
		driver.findElement(By.name("password")).sendKeys("Piuld@4u6363");
		driver.findElement(By.name("submit_login")).click();
		driver.quit();
		
		
}
}
