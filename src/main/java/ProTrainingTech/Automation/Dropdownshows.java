package ProTrainingTech.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownshows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Automation_Of_Coding\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		Thread.sleep(6000);
		Select wt=new Select(driver.findElement(By.name("birthday_month")));
		wt.selectByVisibleText("Apr");
		
		Select ds=new Select(driver.findElement(By.name("birthday_day")));
		ds.selectByValue("15");
		Select jk=new Select(driver.findElement(By.name("birthday_year")));
		jk.selectByIndex(11);
	}

}
