package ProTrainingTech.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		// how to open the site into chrome browser
		//i)Setup the chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Automation_Of_Coding\\Automation\\Drivers\\chromedriver.exe");
        //ii) Call chrome driver constructor
		WebDriver driver=new ChromeDriver();
		//iii)Open the site
		driver.get("https://www.facebook.com");
		//iv)how to maximize the browser
		driver.manage().window().maximize();
		//v)how to refresh the browser
		Thread.sleep(6000);
		driver.navigate().refresh();
		//vi)how to go backward
		driver.navigate().back();
		//vii)how to goo forward
		driver.navigate().forward();
		//how to find locators
		/* i)id
		 * ii)linktext
		 * iii)Partial linktext
		 * iv)Class name
		 * v)Xpath
		 * vi)tagename
		 * vii)Css selector*/
		 
		 //how to store locator into variable
		WebElement CreateAnAccount=driver.findElement(By.id("u_0_2"));
		//how to click on element
		CreateAnAccount.click();
		WebElement Forgotlinkclick=driver.findElement(By.linkText("Forgot Password?"));
		
		
		
		
		
		//Forgotlinkclick.click();
		WebElement Forgotlinkpartial=driver.findElement(By.partialLinkText("Forgot"));
		//Forgotlinkpartial.click();
		Thread.sleep(6000);
		WebElement FirstNameFid=driver.findElement(By.name("firstname"));
		FirstNameFid.sendKeys("Ali");
		
	}

}
