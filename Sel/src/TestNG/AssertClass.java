package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass {
	
	@Test
	public void Assertclass() throws InterruptedException 
	{
		{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("selva");
		driver.findElement(By.xpath("_6luy _55r1 _1kbt _9nyh]")).sendKeys("selva@123");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	    Thread.sleep(2000);
		String titel = driver.getTitle();
		Assert.assertEquals(titel, "Facebook login");
		System.out.println("1");
		
		}
	}

}
