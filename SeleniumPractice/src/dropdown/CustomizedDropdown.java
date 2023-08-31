package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CustomizedDropdown {
	
	

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chromedriver", "C:\\Users\\vikas\\OneDrive\\Desktop\\JyotiClass\\chromedriver_win32 (3)");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(options);
			
			driver.get("https://www.makemytrip.com/");
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
//			driver.switchTo().frame("notification-frame-1730629b2");
//			WebElement close = driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div"));
//			close.click();
//			
//			driver.switchTo().defaultContent();
			
			WebElement from= driver.findElement(By.xpath("//input[@id='fromCity']"));
			
			from.sendKeys("r");
			
	        List<WebElement> list1 = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	        System.out.println("size = "+list1.size());
	        for(WebElement city : list1) {
	        	Thread.sleep(15000);
	        	if(city.getText().contains("Rajkot")) {
	        		city.click();
	        		break;
	        	}
	        	
	        }
	        
			WebElement to= driver.findElement(By.xpath("//input[@id=\"toCity\"]"));
			to.sendKeys("c");
			
			 List<WebElement> list2 = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		        System.out.println("size = "+list2.size());
		        for(WebElement cities : list2) {
		        	Thread.sleep(15000);
		        	if(cities.getText().contains("Coimbatore")) {
		        		cities.click();
		        		break;
		        	}
		        	
		        }
			

					
					
					
					}


			
		}

