package Git;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_Actions {

	

	

			@Test
			public void action_pratice()
			{
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.orangehrm.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
//				By xpath_username = By.xpath("//input[@name='username']");
//				WebElement username_web = driver.findElement(xpath_username);
//				username_web.click();
//				username_web.sendKeys("Admin");
//				By xpath_password = By.xpath("//input[@name='password']");
//				WebElement password_web = driver.findElement(xpath_password);
//				password_web.click();
//				password_web.sendKeys("admin123");
//				
//				By xpath_btn = By.xpath("//button[@type='submit']");
//				WebElement btn_web = driver.findElement(xpath_btn);
//				btn_web.click();
				
//				actions.moveToElement(driver.findElement(By.xpath("//a[text()='Why OrangeHRM']")))
//				.moveToElement(driver.findElement(By.xpath("//li[normalize-space(text()) = 'Our Customers']")))
//				.moveToElement(driver.findElement(By.xpath("(//a[text()='Testimonials'])[1]")))
//				.click()
//				.perform();
					
				
				
				By xpath_Why_OrangeHRM =By.xpath("//a[text()='Why OrangeHRM']"); 
				WebElement why_web = driver.findElement(xpath_Why_OrangeHRM);
				By xpath_Our_Customers =By.xpath("//li[normalize-space(text()) = 'Our Customers']");
				WebElement Our_Customers_web = driver.findElement(xpath_Our_Customers);
				By xpath_Testimonial = By.xpath("(//a[text()='Testimonials'])[1]");
				WebElement Testimonial_web = driver.findElement(xpath_Testimonial);
				
				
				Actions actions = new Actions(driver);
				actions.moveToElement(why_web)
				.moveToElement(Our_Customers_web)
				.moveToElement(Testimonial_web)
				.click()
				.perform();
				

			}
		}


		
		
		
		


	

