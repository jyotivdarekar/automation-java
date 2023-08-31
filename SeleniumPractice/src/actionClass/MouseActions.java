package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		
		WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(doubleClick).perform();
		
		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightClick).perform();
		
		WebElement click = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]"));
		//act.click(click).perform();
		act.moveToElement(click).click().build().perform();
		
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		
		
		//drag and drop action
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		act.dragAndDrop(drag, drop).perform();
		
		//Window Scroller
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
		
		//to focus on desired element on window
		WebElement elements = driver.findElement(By.xpath("(//span[@class='group-header'])[1]"));
		//WebElement drag = driver.findElement(By.id("draggable"));
		Thread.sleep(4000);
		js.executeScript("arguments[0].scrollIntoView(true);", elements);
		
		//mouseOver Action
		driver.get("https://demoqa.com/tool-tips");
		WebElement toolTip = driver.findElement(By.id("item-6"));
		toolTip.click();
	Thread.sleep(4000);
	WebElement mouseOver = driver.findElement(By.id("toolTipButton"));
	act.moveToElement(mouseOver).perform();
	
	
		
		
		
		
		
		
		
		
		
		
	}
	

}
