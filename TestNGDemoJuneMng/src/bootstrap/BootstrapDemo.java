package bootstrap;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDemo {

	//Customize listbox / bootstrap -- select tag is not present
	//ul and li tags are present
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Pratiksha\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement searchBox=driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("selenium");
		
		List<WebElement> allOptions=driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		System.out.println("Total options in list = "+allOptions.size());
		
		for(int i=0;i<allOptions.size();i++)
		{
			System.out.println(allOptions.get(i).getText());
			
			//click on selenium webdriver
			if(allOptions.get(i).getText().equalsIgnoreCase("selenium download"))
			{
				allOptions.get(i).click();
				break;
			}
		}
	}
}
