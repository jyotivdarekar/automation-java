package Practice;

public interface Shape {
	
	void draw();
	
	public default int sum() {
		return 0;}
	
	static void show() {
		System.out.println("This is the static method from Shape interface");
	}
	

}
