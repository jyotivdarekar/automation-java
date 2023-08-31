package Practice;

public class B implements InterfaceA {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	//@Override
    public void display(){
		System.out.println("Hello from default Overriden method");
	} 
	
	
	public static void main(String[] args) {
		InterfaceA i1 = new B();
		i1.display();
		InterfaceA.sum();
		
		
	}
	
	
	
	

}
