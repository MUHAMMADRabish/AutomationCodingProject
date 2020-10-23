package PageClassesMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	public WebDriver driver;
@FindBy(name="email")
WebElement EmailFieldOption;
@FindBy(id="continue")
WebElement Continuebuttonclick;
public ForgotPasswordPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void EmailFieldKeys() {
	EmailFieldOption.sendKeys("protrainingtech@gmail.com");
}
public void ContinueButtonClick() {
	Continuebuttonclick.click();
}
}
