
package helper;

import java.io.File;
import java.io.IOException;

import com.pack.Login;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class SnapShot {
	 
	public void takeSnapShot(WebDriver driver, String name) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\vikas\\OneDrive\\Desktop\\screenShot\\Home"+name+".jpg");
		
		FileHandler.copy(src, dest);
	
	}

}
