package webTables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DataTableExample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\vikas\\OneDrive\\Desktop\\JyotiClass\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver(options);
		 
		 driver.get("https://datatables.net/");
		 
		
	}

}
