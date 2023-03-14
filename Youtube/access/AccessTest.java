package access;

public class AccessTest {

	public static void main( String[] args ) {
		
	System.out.println("First line");
	sayHi();	

	}

	public static void sayHi() {

		// Note that the private allown acess only inside the class AcessTest
		//static all us to use sayHi method in the main method
	
		System.out.println("I am here!");

	}

}