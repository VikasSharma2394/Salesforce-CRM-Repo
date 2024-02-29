package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CodedTestSelenium {
	static WebDriver driver;
	public void OpenBrowser(){
		try {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIKAS~1.SHA\\AppData\\Local\\CresTech\\OpKey\\AgentData\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://cresconnect.crestechsoftware.com");
	HighlightElement();
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Testing");
	UnHighlightElement(driver.findElement(By.xpath("//input[@name='username']")));
	String actualValue = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
	int size = driver.findElements(By.tagName("input")).size();
	System.out.println("Value is "+ actualValue);
	System.out.println("Total number of input tags are "+size);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='username']")).clear();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("//input[@name='username']")));
	Thread.sleep(3000);
	js.executeScript("arguments[0].value='Pass'",driver.findElement(By.xpath("//input[@name='username']")));
    js.executeScript("arguments[0].style.border=''", driver.findElement(By.xpath("//input[@name='username']")));
    driver.findElement(By.xpath("//input[@name='username']//following::input[2]")).click();
	Thread.sleep(3000);
	Select select = new Select(driver.findElement(By.xpath("//input[@name='username']")));
	select.selectByIndex(0);
	Set windowsID = driver.getWindowHandles();
	Object [] data = windowsID.toArray();
	driver.switchTo().window((String) data[1]);
		}catch(Exception e) {
			System.out.println("Catched Exception ****** "+e);
			e.printStackTrace();
		}
	finally{
		driver.quit();
	}
	}
	public static WebDriver HighlightElement(){ 
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='2px solid red'", driver.findElement(By.xpath("//input[@name='username']")));
	    }
	    return driver;
	}
	public static WebDriver UnHighlightElement(WebElement element){
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border=''", element);
	    }
	    return driver;
	}
	public static void main(String[] args){
    CodedTestSelenium selenium = new CodedTestSelenium();
	selenium.OpenBrowser();
	}
}
