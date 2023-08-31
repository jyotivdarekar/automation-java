package screenshot;


import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chromedriver", "C:\\Users\\vikas\\OneDrive\\Desktop\\JyotiClass\\chromedriver_win32 (3)");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//to save screenshots as per time
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		
		//to remove extra characters and spaces from date and time
		String s = time.toString().replace(":", "").replace(" ","");
		
		driver.get("https://www.Myntra.com/");
		driver.manage().window().maximize();
		
		//to save screenshots as a file
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//to save screenshot in spacific folder//add extension as jpg for picture
		File dest = new File("C:\\Users\\vikas\\OneDrive\\Desktop\\screenShot\\Home"+s+".jpg");
		
		FileHandler.copy(source, dest);
		
		
		

				
	}

}
