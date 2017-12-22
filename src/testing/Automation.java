package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automation {

public static void main(String [] args) {
    WebDriver driver;
	
	
	System.setProperty("webdriver.gecko.driver","./Exe/geckodriver.exe");
	driver=new FirefoxDriver();
    driver.get("https://www.google.com");
   	driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("selenium");
	driver.findElement(By.xpath("//input[@value='Google Search']")).click();
	driver.close();

}

}
