import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Lead Test\\chromedriver_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://recruiter.monsterindia.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/a")).click();
		Set<String> windowsID = driver.getWindowHandles();
		Object [] data = windowsID.toArray();
		driver.switchTo().window((String)data[0]);
		Thread.sleep(3000);
		driver.switchTo().window((String)data[1]);
		Thread.sleep(3000);
		String title = driver.getTitle();
		StringSelection selection = new StringSelection(title);
		System.out.println(title);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		driver.findElement(By.xpath("//input[contains(@name,'luhname')]")).click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		driver.quit();
	}

}
