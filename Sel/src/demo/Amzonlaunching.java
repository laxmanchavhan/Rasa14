package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzonlaunching {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();;
		driver.get("http://www.Amazon.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Onplusnordce");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@class='s-image' and @src='https://m.media-amazon.com/images/I/71hIjJkMqFL._AC_UY218_.jpg' and @data-image-index='1']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		Thread.sleep(3000);
	}

}
