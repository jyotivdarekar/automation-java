package com.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeSize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikas\\OneDrive\\Desktop\\JyotiClass\\chromedriver_win32 (3)\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          
          driver.get("https://www.google.com");
          driver.get("https://www.amazon.in/");
          
          Dimension d = new Dimension(300,500);
          driver.manage().window().setSize(d);
          Thread.sleep(5000);
          
          driver.get("http://www.facebook.com");
          
          Point p = new Point(300,500);
          driver.manage().window().setPosition(p);
          Thread.sleep(5000);
          
          driver.close();

          
          
	}

}
