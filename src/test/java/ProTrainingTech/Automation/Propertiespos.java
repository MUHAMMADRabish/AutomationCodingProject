package ProTrainingTech.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageClassesMethods.Home;
import Pro.Advancesharingcode;

public class Propertiespos extends Advancesharingcode {
  @Test
  public void f() throws IOException {
	  System.out.println("This is test ainotation");
	  Home it=new Home(driver);
	  it.AmazonIconClick();
	  String ActualURL=driver.getCurrentUrl(); 
	  SoftAssert Confirm=new SoftAssert();
	  System.out.println(System.getProperty("user.dir")); 
	 Confirm.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo");
	  //Assert.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo6");
	 Properties pro=new Properties();
	  FileInputStream ob=new FileInputStream(System.getProperty("user.dir")+"\\Drivers\\Amazon.properties");
	  pro.load(ob);
	  String name=pro.getProperty("Name6");
	  System.out.println("This to print properties project ="+name);
	 it.SearchFieldEnter(name);
	  it.SEarchIconClicks();
	 WebElement Customerlinkservice= it.Customerseriveverification();
	boolean Customer=Customerlinkservice.isDisplayed();
	Confirm.assertEquals(Customer, true);
	Confirm.assertAll();
	
	 
  }
}
