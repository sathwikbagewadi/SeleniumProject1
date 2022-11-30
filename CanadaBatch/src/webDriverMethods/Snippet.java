package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snippet 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Sathwik/Desktop/Nov4.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/input[@type='First name']")).sendKeys("Sathwik");
		driver.findElement(By.xpath("/html/body/input[@type='Last name']")).sendKeys("Bagewadi");
		driver.findElement(By.xpath("/html/body/input[@type='Designation']")).sendKeys("QA");
		driver.findElement(By.xpath("/html/body/input[@type='ID']")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/input[@type='button']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
