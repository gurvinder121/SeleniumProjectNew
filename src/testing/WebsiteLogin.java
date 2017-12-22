package testing;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebsiteLogin {



	public static void main(String [] args) throws InterruptedException
	{
	    WebDriver driver;
				
		System.setProperty("webdriver.gecko.driver","./Exe/geckodriver.exe");
		driver=new FirefoxDriver();
	    driver.get("http://newtours.demoaut.com/");
	    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
	    driver.findElement(By.xpath("//input[@name='login']")).click();
	    Thread.sleep(((long)5000));
	    driver.findElement(By.xpath("//input[@name='tripType']")).click();
	    Select x=new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
	    x.selectByVisibleText("2");
	    Select g=new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
        g.selectByVisibleText("Paris");
        Thread.sleep(((long)5000));
        Select h=new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
        g.selectByVisibleText("May");
        Select i=new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
        g.selectByVisibleText("14");
        
       
        
        
	    
	    
	}
}