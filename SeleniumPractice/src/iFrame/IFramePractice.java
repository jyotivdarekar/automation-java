package iFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IFramePractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\vikas\\OneDrive\\Desktop\\JyotiClass\\chromedriver_win32 (3)");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement fName = driver.findElement(By.xpath("//input[@id='fname']"));
		fName.clear();
		fName.sendKeys("Jyoti");
		
		WebElement lName = driver.findElement(By.xpath("//input[@id='lname']"));
		lName.click();
		lName.clear();
		lName.sendKeys("Darekar");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		
		

		

	}
}
