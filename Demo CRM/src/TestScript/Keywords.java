package TestScript;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Timestamp;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keywords {
static ChromeDriver driver;
static FileInputStream file;
static Properties prop;
Timestamp timestamp = new Timestamp(System.currentTimeMillis());
public void openBrowser(String snapshotPath, String keyword, String wantSnapshot) throws Exception{
System.setProperty("webdriver.chrome.driver","E:\\Lead Test\\chromedriver_104\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
if(wantSnapshot.equals("Yes")) {
File srcFile = driver.getScreenshotAs(OutputType.FILE);
File destFile = new File(snapshotPath+keyword+".png");
FileUtils.copyFile(srcFile, destFile);
}
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
file = new FileInputStream("D:\\GitData\\Salesforce-CRM-Repo\\Demo CRM\\src\\OBRepository\\SalesforceOR.properties");
prop = new Properties();
prop.load(file);
}
public void NavigateURL(String data, String snapshotPath, String keyword, String wantSnapshot) throws Exception {
	driver.get(data);
	if(wantSnapshot.equals("Yes")) {
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File(snapshotPath+keyword+".png");
		FileUtils.copyFile(srcFile, destFile);
		}
}
public void TypeText(String data, String object1, String snapshotPath, String keyword, String wantSnapshot) throws Exception {
	driver.findElement(By.xpath(prop.getProperty(object1))).sendKeys(data);
	if(wantSnapshot.equals("Yes")) {
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File(snapshotPath+keyword+".png");
		FileUtils.copyFile(srcFile, destFile);
		}
}
public String VerifyTextOnEditBox(String object1, String snapshotPath, String keyword, String wantSnapshot, String continueOnError) throws Exception{
	String actualValue = driver.findElement(By.xpath(prop.getProperty(object1))).getAttribute("value");
	if(wantSnapshot.equals("Yes")) {
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File(snapshotPath+keyword+".png");
		FileUtils.copyFile(srcFile, destFile);
		}
	return actualValue;
}
public void TypeSecureText(String data, String object1, String snapshotPath, String keyword, String wantSnapshot)throws Exception{
	driver.findElement(By.xpath(prop.getProperty(object1))).sendKeys(data);
	if(wantSnapshot.equals("Yes")) {
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File(snapshotPath+keyword+".png");
		FileUtils.copyFile(srcFile, destFile);
		}
}
public void ClickButton(String object1, String snapshotPath, String keyword, String wantSnapshot,String continueOnError)throws Exception{
	if(continueOnError.equals("Yes")) {
	try{
	driver.findElement(By.xpath(prop.getProperty(object1))).click();
	if(wantSnapshot.equals("Yes")) {
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File(snapshotPath+keyword+".png");
		FileUtils.copyFile(srcFile, destFile);
		}
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println(e);
		driver.quit();
	}
	}else {
		driver.findElement(By.xpath(prop.getProperty(object1))).click();
		if(wantSnapshot.equals("Yes")) {
			File srcFile = driver.getScreenshotAs(OutputType.FILE);
			File destFile = new File(snapshotPath+keyword+".png");
			FileUtils.copyFile(srcFile, destFile);
			}
	}
}
public void SwitchToLightning(String object1, String snapshotPath, String keyword, String wantSnapshot) throws Exception{
	String url = driver.getCurrentUrl();
//	if(url.contains("lightning")) {
//		System.out.println("Page is opened in lightning mode");
//	}else {
//		driver.findElement(By.className(prop.getProperty(object1))).click();
//		System.out.println("Switched to Lightning mode");	
//	}
	String splitedURL[] = url.split(Pattern.quote("."));
		if(splitedURL[1].equals("lightning")) {
			System.out.println(timestamp+" Page is opened in lightning mode");
		}else {
			driver.findElement(By.className(prop.getProperty(object1))).click();
			System.out.println(timestamp+" Switched to Lightning mode");
		}
		if(wantSnapshot.equals("Yes")) {
			File srcFile = driver.getScreenshotAs(OutputType.FILE);
			File destFile = new File(snapshotPath+keyword+".png");
			FileUtils.copyFile(srcFile, destFile);
			}
}
public void ScrollToElementofPage(String object1, String snapshotPath, String keyword, String wantSnapshot)throws Exception{
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(prop.getProperty(object1))));
	if(wantSnapshot.equals("Yes")) {
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File(snapshotPath+keyword+".png");
		FileUtils.copyFile(srcFile, destFile);
		}
}
public void LauchAppAndClickViewAll(String object1, String object2,String snapshotPath, String keyword, String wantSnapshot)throws Exception{
	driver.findElement(By.xpath(prop.getProperty(object1))).click();
	driver.findElement(By.xpath(prop.getProperty(object2))).click();
	if(wantSnapshot.equals("Yes")) {
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File(snapshotPath+keyword+".png");
		FileUtils.copyFile(srcFile, destFile);
		}
}
public void PasteTextOnEditBox(String data, String object1 ,String snapshotPath, String keyword, String wantSnapshot)throws Exception{
	driver.findElement(By.xpath(prop.getProperty(object1))).click();
	StringSelection stringSelection = new StringSelection(data);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	if(wantSnapshot.equals("Yes")) {
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File(snapshotPath+keyword+".png");
		FileUtils.copyFile(srcFile, destFile);
		}
}
public void CloseAllBrowsers()throws Exception {
	Thread.sleep(5000);
	driver.quit();
}
}
