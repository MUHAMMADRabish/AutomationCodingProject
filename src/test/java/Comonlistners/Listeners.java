package Comonlistners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import PageClassesMethods.Home;
import Pro.Advancesharingcode;

public class Listeners extends Advancesharingcode  implements ITestListener {
	

	public WebDriver driver=null;
	/*public Listeners(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}*/

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
		
		System.out.println("Test is started");
		System.out.println(driver);
		/*Date dt=new Date();
		String sd=dt.toString().replace(" ", "_").replace(":", "_")+".png";
		System.out.println(sd);
		File di=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println("driver to");
		try {
			FileUtils.copyFile(di,new File("C:\\Users\\user\\Automation_Of_Coding\\Automation\\Drivers\\Pictures\\Pass\\"+result.getTestName()+sd));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
	}
	//public WebDriver driver;
	/*public void onTestStart(ITestResult result) {
		System.out.println("Test is started");
	}
	public void onTestSuccess(ITestResult result) {
		Date dt=new Date();
		String sd=dt.toString().replace(" ", "_").replace(":", "_")+".png";
		File di=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(di,new File("C:\\Users\\user\\Automation_Of_Coding\\Automation\\Drivers\\Pictures\\Pass\\"+result.getTestName()+sd));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void onTestFailure(ITestResult result) {
		Date dt=new Date();
		String sd=dt.toString().replace(" ", "_").replace(":", "_")+".png";
		File di=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(di,new File("C:\\Users\\user\\Automation_Of_Coding\\Automation\\Drivers\\Pictures\\Fail\\"+result.getTestName()+sd));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}*/

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		/*Date dt=new Date();
		String sd=dt.toString().replace(" ", "_").replace(":", "_")+".png";
		File di=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(di,new File("C:\\Users\\user\\Automation_Of_Coding\\Automation\\Drivers\\Pictures\\Fail\\"+result.getTestName()+sd));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println("Rhis to psed");
		
	}
	
	
}
