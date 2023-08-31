
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPractice {
	@BeforeClass
	public static void set() {
		System.out.println("property has been set");
	}
	
	@BeforeMethod
	public void logIn() {
		System.out.println("LogIn");
	}
	
	@Test
	public void abc() {
		System.out.println("hello");
	}
	
	@Test
	public void bcd() {
		System.out.println("Welcome here");
	}
	
	@Test
	public void cde() {
		System.out.println("good morning");
	}
	@AfterMethod
	public void logOut() {
		System.out.println("LogOut");
	}
	
	@AfterClass
	public static void close() {
		System.out.println("close");
		
	}
	
	

}
