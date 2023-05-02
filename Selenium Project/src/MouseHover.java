import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHover {
	public static ChromeDriver driverNull1;
	public static void main(String[] args) throws Exception {
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\SSTS\\OpKey\\OpKey Execution Agent\\AgentData\\Plugins\\libs\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cresconnect.crestechsoftware.com/");
		WebElement slider = driver.findElement(By.xpath("//button[@type='submit']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(slider, 50, 0).perform();
		Thread.sleep(5000);
//		StringSelection selection = new StringSelection("Test");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		driver.findElement(By.xpath("//input[@type='email']")).click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(5000);
		Select select = new Select(driver.findElement(By.xpath("")));
		select.selectByIndex(0);
		Set windowsID = driver.getWindowHandles();
		Object [] data = windowsID.toArray();
		driver.switchTo().window((String)data[0]);
		driver.quit();
		String actualValue = driver.findElement(By.xpath("")).getAttribute("Value");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
