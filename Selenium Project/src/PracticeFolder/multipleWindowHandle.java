package PracticeFolder;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;


public class multipleWindowHandle {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\vikas.sharma\\Downloads\\edgedriver_win64 (4)\\msedgedriver.exe");
		EdgeDriver edge = new EdgeDriver();
		edge.manage().window().maximize();
		edge.get("https://recruiter.monsterindia.com/");
		edge.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		edge.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/a")).click();
		Set<String> windowsid = edge.getWindowHandles();
		Object [] data = windowsid.toArray();
		Thread.sleep(5000);
		edge.switchTo().window((String)data[0]);
		File srcFile = edge.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\vikas.sharma\\Downloads\\edgedriver_win64 (4)\\Driver_Notes\\Vikas.png");
		FileUtils.copyFile(srcFile, destFile);
		Thread.sleep(5000);
		edge.quit();
		}
}
