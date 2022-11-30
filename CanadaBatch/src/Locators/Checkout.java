package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkout 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("satwik.bag@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password123");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.className("login-button")).click();
		driver.findElement(By.linkText("DIGITAL DOWNLOADS")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[3]/div[2]/input")).click();
		//Line 21 is for Add-to-cart button
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("termsofservice")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("paymentmethod_0")).click();
		driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("ico-logout")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
