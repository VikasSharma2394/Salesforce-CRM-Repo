import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
static Properties prop;
static ChromeDriver driver;
static FileInputStream file;
public void OpenBrowser()throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\SSTS\\OpKey\\OpKey Execution Agent\\AgentData\\Plugins\\libs\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://cresconnect.crestechglobal.com");
	Thread.sleep(2000);
	file = new FileInputStream("D:\\Github Data\\Salesforce-CRM-Repo\\Selenium Project\\src\\CresconnectOR.properties");
	prop = new Properties();
	prop.load(file);
}
public String TypeText(String data) {
	driver.findElement(By.name(prop.getProperty("Pass"))).sendKeys(data);
	String actualvalue = driver.findElement(By.name(prop.getProperty("Pass"))).getAttribute("value");
	return actualvalue;
}
}
