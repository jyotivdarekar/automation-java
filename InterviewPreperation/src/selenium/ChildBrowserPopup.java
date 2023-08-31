package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildBrowserPopup {
	static 	WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\vikas\\OneDrive\\Desktop\\JyotiClass\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		String parenthandle = driver.getWindowHandle();
		driver.findElement(By.xpath("(//label[text()='HOTELS'])[2]")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'Nav-icons RetiringRoom")).click();
		driver.findElement(By.xpath("class='Nav-icons Flights'")).click();
		
		Set<String> handles = driver.getWindowHandles();
		List<String> handleList = new ArrayList(handles);
		
		
		
		
		
		
	}
	
	public static boolean switchToRightWindow(String windowTitle, List<String> handleList) {
		 for(String e: handleList) {
			 String title = driver.switchTo().window(e).getTitle();
			 if(title.contains(windowTitle)) {
				 System.out.println("found the value right window");
				 return true;
			 }
					 
					 }
		 return false;
		 
	}
	

}
