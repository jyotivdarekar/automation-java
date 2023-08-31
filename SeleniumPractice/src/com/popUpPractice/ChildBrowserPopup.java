package com.popUpPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikas\\OneDrive\\Desktop\\a\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		
		
		/*
		 * driver.get("https://demo.automationtesting.in/Windows.html"); WebElement
		 * click = driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]"));
		 * click.click();
		 * 
		 * Set<String> allAddress = driver.getWindowHandles(); Iterator<String> i =
		 * allAddress.iterator();
		 * 
		 * String p = i.next(); String c = i.next();
		 * 
		 * driver.switchTo().window(c); Thread.sleep(4000);
		 * 
		 * WebElement readMore = driver.findElement(By.
		 * xpath("//a[@class='selenium-button selenium-webdriver text-uppercase font-weight-bold']"
		 * )); readMore.click();
		 */
		
		
		driver.get("https://www.irctc.com/");
		
		WebElement busBooking = driver.findElement(By.xpath("//a[text()='Bus Ticket Booking']"));
		busBooking.click();
		
		Set<String> allAddress = driver.getWindowHandles();
		
		Iterator<String> i = allAddress.iterator();
		
		String p = i.next();
		String c = i.next();
		
		driver.switchTo().window(c);
		
		WebElement hotels = driver.findElement(By.xpath("//div[@class='Nav-icons IRCTCHotels']"));
		hotels.click();
		
		allAddress = driver.getWindowHandles();
		i=allAddress.iterator();
		p=i.next();
		c=i.next();
		String c1 = i.next();
		
		driver.switchTo().window(c1);
		WebElement retiringRoom = driver.findElement(By.xpath("//div[@class='Nav-icons RetiringRoom']"));
		retiringRoom.click();
		
		driver.switchTo().window(c);
		WebElement depart = driver.findElement(By.id("departFrom"));
		depart.click();
		depart.sendKeys("Pune");
		
		
		
		
		
		
		
		

	}

}
