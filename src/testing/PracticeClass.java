package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeClass {
	public static void main(String []args) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","./exe/geckodriver.exe" );
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		Thread.sleep(((long)5000));
		driver.findElement(By.xpath("//qwerty[@id='id1']")).sendKeys("amar");
		driver.findElement(By.xpath("//asd[@id='id2']")).click();
		Select a = new Select(driver.findElement(By.xpath("//qwerty[@id='id1']")));
		a.selectByVisibleText("2");
		driver.close();
		
	}

}
