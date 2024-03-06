package PracticeTestNG;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class verifyBrokenLinks {
	static WebDriver driver;
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VIKAS~1.SHA\\AppData\\Local\\CresTech\\OpKey\\AgentData\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.intertrust.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links are "+links.size());
		for(WebElement link:links) {
			String url = link.getAttribute("href");
			verifyLinks(url);
		}
		driver.quit();
	}
	public static void verifyLinks(String url)throws Exception {
		try {
		URL link = new URL(url);
		HttpURLConnection httpURLConnection = (HttpURLConnection)link.openConnection();
		httpURLConnection.setConnectTimeout(15000);
		httpURLConnection.connect();
		if(httpURLConnection.getResponseCode()==200){
		System.out.println(url +" - "+ httpURLConnection.getResponseMessage());	
		}else {
			System.out.println(url +" - "+ httpURLConnection.getResponseMessage()+" is a broken link");
		}
		}catch(Exception e) {
			System.out.println(url + " - " + "is a broken link");
			e.printStackTrace();
		}
	}
}
