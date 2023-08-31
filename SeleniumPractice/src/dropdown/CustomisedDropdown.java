package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class CustomisedDropdown {
	public static long SLEEP = 15000;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikas\\OneDrive\\Desktop\\JyotiClass\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
//		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
//		WebElement close = driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div"));
//		close.click();
//		
//		driver.switchTo().defaultContent();
		WebElement from = driver.findElement(By.xpath("//input[@class='fsw_inputField lineHeight36 latoBlack font30']"));
		from.sendKeys("j");
		
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li"));
		Thread.sleep(SLEEP);
		System.out.println("size = "+list1.size());
		for(WebElement city : list1) {
			System.out.println(city.getText());
			if(city.getText().contains("Jabalpur")) {
				city.click();
				break;
				
			}
		}
		WebElement to= driver.findElement(By.xpath("//input[@id=\"toCity\"]"));
		to.sendKeys("c");
		
		 List<WebElement> list2 = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	        System.out.println("size = "+list2.size());
	        for(WebElement cities : list2) {
	        	System.out.println(cities.getText());
	        	Thread.sleep(5000);
	        	if(cities.getText().contains("Coimbatore")) {
	        		cities.click();
	        		break;
	        	}
	        	
	        }
		
	
		
	}

}
