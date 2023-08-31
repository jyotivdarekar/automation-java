package waits;

public class child extends Parent{
	public void display() {
		System.out.println("+++");
	}
	 
	public static void main(String[] args) {
		
		//child c = new child();
		Parent c1 = new child();
		c1.display();
	}
	

}
