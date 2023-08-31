package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LogInSteps2 {
WebDriver driver = null;	

@Before
public void setProperty() {
	System.setProperty("webdriver.chromedriver",
			"C:\\Users\\vikas\\Fusion-Nov\\CucumberDemo\\src\\test\\resources\\Drivers\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}


@Given("User is on login page")
public void user_is_on_login_page() {
    driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
}

@When("user enters valid emailId or phone number")
public void user_enters_valid_email_id_or_phone_number() {
   driver.findElement(By.id("ap_email")).sendKeys("jyotivdarekar1994@gmail.com");;
}

@When("user clicks on continue button")
public void user_clicks_on_continue_button() {
    driver.findElement(By.id("continue")).click();
}

@When("user enters valid password")
public void user_enters_valid_password() {
   driver.findElement(By.id("ap_password")).sendKeys("jyovika85");
}

@When("user clicks on signIn button")
public void user_clicks_on_sign_in_button() {
    driver.findElement(By.id("signInSubmit")).click();
}

@Then("user should redirected to the homePage")
public void user_should_redirected_to_the_home_page() throws InterruptedException {
	driver.getPageSource().contains("Cart");
	Thread.sleep(2000);
}

@After
public void closeBrowser() {
	
	driver.close();
	driver.quit();
}




	

}
