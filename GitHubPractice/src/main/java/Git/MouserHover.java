package Git;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouserHover 
{	@Test
	public void mouseHover()
	{
		
//	System.out.println("Hello hi how are you");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	By xpath_signin = By.xpath("//span[text()='Hello, sign in']");
	WebElement signin_web = driver.findElement(xpath_signin);
//	By xpath_email = By.xpath("//input[@name='email']");
//	WebElement email_web = driver.findElement(xpath_email);
//	email_web.click();
//	email_web.sendKeys("laxmiprasad9666@gmail.com");
	Actions actions = new Actions(driver);
	actions.moveToElement(signin_web)
	//actions.moveToElement(email_web)
	.click()
	.perform();
	
	
	
	
	
	
	
	}
}
