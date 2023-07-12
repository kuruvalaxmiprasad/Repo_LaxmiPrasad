package Practice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class practice123 {

	@Test
	public void practicejavaexe10() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
//		js.executeScript("window.scrollTo(0,500)");
//		
//		Thread.sleep(3000);
//		js.executeScript("window.scrollTo(0,-500)");
//		Thread.sleep(3000);
		//js.executeAsyncScript("window.scrollBy(0,500)");
		js.executeScript("document.getElementById('ty_footer').scrollIntoView()");
	}
	
}
