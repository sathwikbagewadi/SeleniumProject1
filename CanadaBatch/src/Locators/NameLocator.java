package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Register")).click();
		//driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.partialLinkText("cart")).click();
		//driver.findElement(By.name("FirstName")).sendKeys("Sathwik");
		//driver.findElement(By.className("text-box")).sendKeys("Sathwik");
		//driver.findElement(By.name("LastName")).sendKeys("Bagewadi");
		//driver.findElement(By.name("Email")).sendKeys("Sathwik.123@gmail.com");
		//driver.findElement(By.name("Password")).sendKeys("Password123");
		//driver.findElement(By.name("ConfirmPassword")).sendKeys("Password123");
		//driver.findElement(By.name("register-button")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a")).click();
		driver.findElement(By.partialLinkText("Apparel&Shoes")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
