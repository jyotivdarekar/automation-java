package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.internal.SystemPropertyUtil;

public class WebElementMethods {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "C:\\Users\\vikas\\OneDrive\\Desktop\\JyotiClass\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html#google_vignette");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@type =\"text\"][1]"));
		firstName.click();
		firstName.sendKeys("Jyoti");
		System.out.println(firstName.getText());
		String value = firstName.getAttribute("value");
		String text = firstName.getAttribute("type");
		System.out.println(" textxtxtxt === " +text);
		
		
		System.out.println("Value of first Name = "+value);
		WebElement lastName = driver.findElement(By.xpath("(//input[@type =\"text\"])[2]"));
		lastName.click();
		boolean a =firstName.isDisplayed();
		System.out.println(a);
		
		System.out.println(firstName.isEnabled());
		
		System.out.println(firstName.isSelected());
		
		System.out.println(firstName.getText());
		System.out.println(lastName.getAttribute("class"));
		
		
		firstName.submit();
		
				
		
	}

}
