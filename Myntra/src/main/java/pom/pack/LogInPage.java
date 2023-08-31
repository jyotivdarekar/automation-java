package pom.pack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {
	
	@FindBy(xpath = "(//span[@class='desktop-userTitle'])[1]")
	private WebElement profile;
	
	@FindBy (xpath = "(//a[text()='LOGIN/SIGNUP'])")
	private WebElement 	LogIn;

	
	
	

}
