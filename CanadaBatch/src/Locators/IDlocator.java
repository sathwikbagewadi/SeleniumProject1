package Locators;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDlocator
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Sathwik");
		driver.findElement(By.id("LastName")).sendKeys("Bagewadi");
		driver.findElement(By.id("Email")).sendKeys("sathwik@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Passwordone");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Passwordone");
		driver.findElement(By.id("register-button")).click();
		driver.close();	
	}

}
