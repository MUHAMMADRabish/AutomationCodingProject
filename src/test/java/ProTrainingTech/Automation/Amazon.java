package ProTrainingTech.Automation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageClassesMethods.ForgotPasswordPage;
import PageClassesMethods.Home;
import PageClassesMethods.SignINPage;
import Pro.Advancesharingcode;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Amazon extends Advancesharingcode {
	//public WebDriver driver;
  @Test(priority = 1)
  public void D() throws IOException {
	  System.out.println("This is test ainotation");
	  Home it=new Home(driver);
	  it.AmazonIconClick();
	  pictures();
	  String ActualURL=driver.getCurrentUrl(); 
	  SoftAssert Confirm=new SoftAssert();
	 Confirm.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo");
	  //Assert.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo6");
	 it.SearchFieldEnter("");
	 pictures();
	  it.SEarchIconClicks();
	 WebElement Customerlinkservice= it.Customerseriveverification();
	boolean Customer=Customerlinkservice.isDisplayed();
	Confirm.assertEquals(Customer, true);
	Confirm.assertAll();
		
	pictures();
  }
 // @Test(priority = 2)
  public void ForgotPasswordFunction() {
	  Home it=new Home(driver);
	  SignINPage ob=new SignINPage(driver);
	  ForgotPasswordPage forgot=new ForgotPasswordPage(driver);
	  it.SignINClick();
	  it.SignINHover();
	  ob.NeedHelpClick();
	  ob.ForgotPasswordClick();
	  forgot.EmailFieldKeys();
	  forgot.ContinueButtonClick();
	  
  }
  
 /* @BeforeClass
  @Parameters("browser")
  public void beforeClass(String browser) {
	  browsers(browser);
	  
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  System.out.println("This is after");
	  Thread.sleep(6000);
	  driver.close();
  }

  public void browsers(String br) {
	  if (br.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Automation_Of_Coding\\Automation\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("https://www.amazon.com");
				driver.manage().window().maximize();
		  
	  }else if(br.equalsIgnoreCase("Firefox")){
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Automation_Of_Coding\\Automation\\Drivers\\geckodriver.exe");
			 driver=new FirefoxDriver();
			 driver.get("https://www.amazon.com");
				driver.manage().window().maximize();
		  
	  }
	  
	  
  }*/
}
