package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Pratiksha\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement curAddr=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		curAddr.sendKeys("Abc Pune");
		
		Actions a=new Actions(driver);
		
		//crtl+A
		a.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		
		//ctrl+C
		a.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		
		//tab
		a.sendKeys(Keys.TAB).perform();
		
		//ctrl+v
		a.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		
		//scroll
		//typecast JavascriptExecutor interface
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("scroll(0,500)");
		
		js.executeScript("scroll(0,-100)");
		
		
	}
}
