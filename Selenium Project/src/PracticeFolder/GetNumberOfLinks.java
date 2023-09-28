package PracticeFolder;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetNumberOfLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VIKAS~1.SHA\\AppData\\Local\\CresTech\\OpKey\\AgentData\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seacert.com/");
		List list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		driver.quit();
		System.out.println("Browser Closed");
	}

}
