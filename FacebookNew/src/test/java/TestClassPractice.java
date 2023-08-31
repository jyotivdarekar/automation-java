import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassPractice {
	
	@BeforeClass
	public static void setProperty() {
		System.out.println("property has been set in second test class");
	}
	
	@BeforeMethod
	public void logInAct() {
		System.out.println("LogIn in second test class");
	}
	
	@Test
	public void aaa() {
		System.out.println("hello in second test class");
	}
	
	@Test
	public void bbb() {
		System.out.println("Welcome here in second test class");
	}
	
	@Test
	public void ccc() {
		System.out.println("good morning in second test class");
	}
	@AfterMethod
	public void logOutAct() {
		System.out.println("LogOut in second test class");
	}
	
	@AfterClass
	public static void closeBrowser() {
		System.out.println("close in second test class");
		
	}
	

}
