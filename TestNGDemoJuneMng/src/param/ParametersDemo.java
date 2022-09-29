package param;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
  
	@Test
	@Parameters({"uname","password"})
	public void login(String un,String pwd) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Pratiksha\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//locate un using xpath
		WebElement uname=driver.findElement(By.xpath("//input[@id='user-name']"));
		
		//locate pwd using xpath
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		
		//locate loginbutton using xpath
		WebElement loginBtn=driver.findElement(By.xpath("//input[@id='login-button']"));
		
		uname.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
	}
}
