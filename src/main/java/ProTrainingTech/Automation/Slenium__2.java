package ProTrainingTech.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slenium__2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Automation_Of_Coding\\Automation\\Drivers\\chromedriver.exe");
		        
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.facebook.com");
				
				driver.manage().window().maximize();
WebElement Ids=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input)[1]"));
Ids.sendKeys("Protrainingtech@gmail.com");
WebElement loginbutton=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
loginbutton.click();
	}

}
