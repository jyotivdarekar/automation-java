package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	WebDriver driver;
	LogInPage logInPage;
	
	
	@FindBy(xpath="//div[@id='nav-signin-tooltip']//a//span")
	WebElement signin;
	
	@FindBy(id = "ap_email")
	WebElement username;
	
	@FindBy(id = "continue")
	WebElement conti;
	
	@FindBy(id = "ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signinbutton;
	
	@FindBy (xpath="//div[@class='nav-line-1-container']//span")
	WebElement AccountHoldersName;
	
	@FindBy (xpath="//span[text()='Sign Out']")
	WebElement signout;
	
	public LogInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver , this);
		
	}
	
	public void userHitsTheAmazonsWebsite() {
		System.setProperty("webdriver.chromedriver", "src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=520468682231143084&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062111&hvtargid=kwd-10573980&hydadcr=14453_2316415");
		
	}
	

}
