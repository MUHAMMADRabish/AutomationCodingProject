package ProTrainingTech.Automation;

import org.testng.annotations.Test;

public class Group {
  @Test(groups= {"Function"})
  public void test1() {
	  System.out.println("This belongs test1");
  }
  @Test(groups= {"Regression","Sdanit"})
  public void test6() {
	  System.out.println("This belongs regression and sdanit");
  }
  @Test(groups= {"Regression"})
  public void test26() {
	  System.out.println("This belongs regression");
  }
  @Test(groups= {"Sdanit"})
  public void test3() {
	  System.out.println("This belongs sdanit");
  }
}
