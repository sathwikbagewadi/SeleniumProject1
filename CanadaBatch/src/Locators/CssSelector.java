package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a[href=\"/login\"]")).click();
       // driver.findElement(By.cssSelector("input[id=\"Email\"]")).sendKeys("satwik.bag@gmail.com");
       // driver.findElement(By.cssSelector("input#Email")).sendKeys("satwik.bag@gmail.com");
        driver.findElement(By.cssSelector("input.email")).sendKeys("satwik.bag@gmail.com");
       // driver.findElement(By.cssSelector("input[id=\"Password\"]")).sendKeys("Password123");
        driver.findElement(By.cssSelector("input.password")).sendKeys("Password123");
        driver.findElement(By.cssSelector("input[id=\"RememberMe\"]")).click();
        driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		
	}

}
