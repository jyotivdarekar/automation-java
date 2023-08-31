package pom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	
	
	@FindBy(xpath="//a[@href='https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&']")
	private WebElement acc;
	
	@FindBy(xpath="//span([text()='Sign in'])[1]")
	private WebElement signIn;
	
	@FindBy(xpath="//input[@id= 'ap_email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id= 'continue']")
	private WebElement conti;
	
	@FindBy (xpath = "//input[@id= 'ap_password']")
	private WebElement pass;
	
	@FindBy (xpath ="//input[@id='signInSubmit']")
	private WebElement signInButton;
	
	public SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAccountDropdown() throws InterruptedException {
		Thread.sleep(3000);
		acc.click();
	}
	
	public void clickSignInOption() throws InterruptedException {
		Thread.sleep(3000);
		signIn.click();
	}
	
	public void sendEmail() throws InterruptedException {
		Thread.sleep(3000);
		email.click();
	}
	

	public void clickContinue() throws InterruptedException {
		Thread.sleep(3000);
		conti.click();
	}
	
	public void sendPassword() throws InterruptedException {
		Thread.sleep(3000);
		pass.click();
	}
	
	public void clickSignInButton() throws InterruptedException {
		Thread.sleep(3000);
		signInButton.click();
	}
	
	
	
	
	
	
	
	
	
}
