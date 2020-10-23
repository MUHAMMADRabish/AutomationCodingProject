package ProTrainingTech.Automation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageClassesMethods.Home;
import Pro.Advancesharingcode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class NewTest extends Advancesharingcode{
  //@Test(dataProvider = "dp")
  public void f(String n, String s) throws IOException {
	  Home it=new Home(driver);
	  it.AmazonIconClick();
	  pictures();
	  String ActualURL=driver.getCurrentUrl(); 
	  SoftAssert Confirm=new SoftAssert();
	 Confirm.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo");
	  //Assert.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo6");
	 it.SearchFieldEnter(n);
	 pictures();
	  it.SEarchIconClicks();
	 WebElement Customerlinkservice= it.Customerseriveverification();
	boolean Customer=Customerlinkservice.isDisplayed();
	Confirm.assertEquals(Customer, true);
	Confirm.assertAll();
		
	pictures();
	
  }
  @Test
  public void properties() throws IOException {
	  Properties pro=new Properties();
		FileInputStream fit=new FileInputStream(System.getProperty("user.dir")+"\\src\\Config.properties");
		pro.load(fit);
	String name=pro.getProperty("name");
	System.out.println("This is the ="+name);
	System.out.println(System.getProperty("user.dir"));
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "house", "" },
      new Object[] { "xbox", "" },
    };
  }
}
