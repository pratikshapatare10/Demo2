package broken;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksDemo {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Pratiksha\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		int brokenLink=0;
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links = "+links.size());
		
		Iterator<WebElement> it=links.iterator();
		
		while(it.hasNext())
		{
			String url=it.next().getAttribute("href");
			
			//Establish the comnection with http
			HttpURLConnection http=(HttpURLConnection)(new URL(url).openConnection());
			http.setRequestMethod("HEAD");
			http.connect();
			
			int resCode=http.getResponseCode();
			
			if(resCode>=400) {
				
				System.out.println(url+" is broken");
				System.out.println(resCode);
				brokenLink++;
			}
			else
				System.out.println(url+" is working");
				System.out.println(resCode);
		}
		System.out.println("Total broken links are = "+brokenLink);
	}
	
}
