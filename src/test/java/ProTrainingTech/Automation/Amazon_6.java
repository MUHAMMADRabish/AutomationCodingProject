package ProTrainingTech.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageClassesMethods.Home;
import Pro.Advancesharingcode;

public class Amazon_6 extends Advancesharingcode {
	
  @Test
  public void f() {
	  System.out.println("This is test ainotation");
	  Home it=new Home(driver);
	  it.AmazonIconClick();
	  String ActualURL=driver.getCurrentUrl(); 
	  SoftAssert Confirm=new SoftAssert();
	 Confirm.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo");
	  //Assert.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo6");
	 it.SearchFieldEnter("");
	  it.SEarchIconClicks();
	 WebElement Customerlinkservice= it.Customerseriveverification();
	boolean Customer=Customerlinkservice.isDisplayed();
	Confirm.assertEquals(Customer, true);
	Confirm.assertAll();
  }
}
