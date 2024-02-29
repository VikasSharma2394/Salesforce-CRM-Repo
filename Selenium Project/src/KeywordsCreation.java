import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordsCreation {
	static ChromeDriver driver;
	static Properties prop;
	static FileInputStream propFile;
	public void LaunchBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\SSTS\\OpKey\\OpKey Execution Agent\\AgentData\\Plugins\\libs\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cresconnect.crestechglobal.com/");
		propFile = new FileInputStream("D:\\Github Data\\Salesforce-CRM-Repo\\Selenium Project\\Repo");
		prop = new Properties();
		prop.load(propFile);
		driver.findElement(By.name(prop.getProperty("email"))).sendKeys("Sharma Ji");
	}
}
