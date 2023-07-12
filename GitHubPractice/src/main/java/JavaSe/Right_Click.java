package Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Right_Click {

	
	@Test
	public void right_click() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		By xpath_rightclick_me = By.xpath("//span[text()='right click me']");
		WebElement right_click_web = driver.findElement(xpath_rightclick_me);
		Actions actions = new Actions(driver);
		actions.contextClick(right_click_web)
		.perform();
		Thread.sleep(2000);
		By xpath_edit = By.xpath("//li[.='Edit']");
		WebElement edit_web = driver.findElement(xpath_edit);
		Thread.sleep(2000);
		edit_web.click();
		
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.accept();
		
		
	}
}