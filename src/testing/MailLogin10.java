package testing;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class MailLogin10 {

	public static void main(String [] args) throws InterruptedException {
	    WebDriver driver;
		
		
		System.setProperty("webdriver.gecko.driver","./Exe/geckodriver.exe");
		driver=new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1");
	    driver.findElement(By.xpath("//input[@id= 'identifierId']")).sendKeys("amarpreetsingh121");
	    Thread.sleep((long)5000);
	    driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	    Thread.sleep((long)5000);
	    driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("househou1");
	    Thread.sleep((long)5000);
	    driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	    Thread.sleep((long)5000);
	    driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	    Thread.sleep((long)10000);
	    driver.close();
	    
	    
	}

	}


	















