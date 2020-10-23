package ProTrainingTech.Automation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageClassesMethods.Home;
import Pro.Advancesharingcode;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class Provider extends Advancesharingcode {
  @Test(dataProvider = "search")
  public void f( String t) throws IOException {
	  System.out.println("This is test ainotation");
	  Home it=new Home(driver);
	  it.AmazonIconClick();
	  pictures();
	  String ActualURL=driver.getCurrentUrl(); 
	  SoftAssert Confirm=new SoftAssert();
	 Confirm.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo");
	  //Assert.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo6");
	 it.SearchFieldEnter(t);
	 pictures();
	  it.SEarchIconClicks();
	 WebElement Customerlinkservice= it.Customerseriveverification();
	boolean Customer=Customerlinkservice.isDisplayed();
	Confirm.assertEquals(Customer, true);
	Confirm.assertAll();
		
	pictures();
  }

  @DataProvider
  public Object[][] search() {
    return new Object[][] {
      new Object[] {"Phone"},
      new Object[] { "Home" },
      new Object[] {"Store"},
    };
  }
}
