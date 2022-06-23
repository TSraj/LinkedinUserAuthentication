package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.DriverSetup;

public class TC_001_Login extends DriverSetup {

	public static String baseUrl = "https://www.linkedin.com/uas/login?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Ffeed%2F&fromSignIn=true&trk=cold_join_sign_in";

	@Test
	public static void login() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//input username
		driver.findElement(By.id("username")).sendKeys(""); // Enter your Email here
		Thread.sleep(3000);
		
		//input password
		driver.findElement(By.id("password")).sendKeys(""); // Enter your Password here
		Thread.sleep(3000);
		
		//sign in 
		driver.findElement(By.xpath("//button[@aria-label='Sign in']")).click();
		Thread.sleep(3000);
		
//		String expected_title = "Feed | Linkedin";
//		String actual_title = driver.getTitle();
//		
//		//checking login status
//		if (expected_title.equals(actual_title)) {
//			System.out.println("Login Successful");
//		} else {
//			System.out.println("Login Failed");
//		}
//		
//		Assert.assertEquals(expected_title, actual_title);
		
		//expand the dropdown menu to sign out
		driver.findElement(By.xpath("//li[6]//div[1]//button[1]//span[1]//*[name()='svg']//*[name()='use' and contains(@class,'global-nav')]")).click();
		Thread.sleep(2000);
		
		
		//sign out from account
		driver.findElement(By.xpath("//a[@class='global-nav__secondary-link mv1']")).click();
		Thread.sleep(2000);
	}
}
