package Practice;

public interface InterfaceA {
	
	void show();
	
	public default void display(){
		System.out.println("Hello from default method");
	} 
	
	
	
	
	
	public static int sum() {
		System.out.println("this is static method from InterfaceA");
		return 0;}

}
