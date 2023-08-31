package waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplicitWait {
public static void main(String[] args) {
	System.setProperty("webdriver.chromedriver", "C:\\\\Users\\\\vikas\\\\chromedriver_win32_111.0.556\\\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	
	driver.get("https://www.Facebook.com");
}
}
