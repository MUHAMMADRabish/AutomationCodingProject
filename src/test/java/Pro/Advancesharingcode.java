package Pro;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Advancesharingcode {
  public WebDriver driver;
  @BeforeClass
  @Parameters({"browser","URL"})
  public void beforeClass(String browser,String URL) {
	  if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
				 driver=new ChromeDriver();
				 driver.get(URL);
					driver.manage().window().maximize();
			  
		  }else if(browser.equalsIgnoreCase("Firefox")){
			  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
				 driver=new FirefoxDriver();
				 driver.get(URL);
					driver.manage().window().maximize();
			  
		  }
  }

  @AfterClass
  public void afterClass() throws InterruptedException, IOException  {
	  System.out.println("This is after");
	  Thread.sleep(6000);
	  pictures();
	  driver.close();
	 
	  
	  }
  public void pictures() throws IOException {
	  Date dt=new Date();
		String sd=dt.toString().replace(" ", "_").replace(":", "_")+".png";
		File di=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(di,new File("C:\\Users\\user\\Automation_Of_Coding\\Automation\\Drivers\\Pictures\\"+sd));
		
  }

}
