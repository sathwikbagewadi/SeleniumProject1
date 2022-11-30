package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("Sathwik");
		driver.findElement(By.cssSelector("input#lastName")).sendKeys("Bagewadi");
		driver.findElement(By.id("username")).sendKeys("sathwik.bagewadi@gmail.com");
		driver.findElement(By.cssSelector("input[name=Passwd")).sendKeys("Password123");
		driver.findElement(By.cssSelector("input[name=ConfirmPasswd]")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
