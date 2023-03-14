import java.util.Scanner;

class variable1 {
	
	public static void main( String [] args) {
	
	String message;
	int hour, minute;	// integer type variable
	double pi;	// Float type variable

	double y = 1/3; 	//Note this will result in y = 0.0 since java will do integer division which resullt to 0 and assign it to y
	double x = 1.0/3.0;	// This is the correct way

	pi = 3.14159;	
	
	String name = "Phemelo";
	message = "Hello Steve, the time is \t";
	hour = 10;
	minute = 35;
	System.out.print(message);
	System.out.print(hour);
	System.out.print(":");
	System.out.println(minute); 

	System.out.print("Well done!");

	// Compile Error example: int c = 1.05;

	// Round Error

	System.out.println(0.1 * 10);
	System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1+ 0.1 + 0.1 + 0.1 + 0.1 + 0.1);

	// Solution to  round error is to use intergers. Example:

	double price1 = 125.19;	// Price in rands
	int price2 = 12519;	// Price in cents

	// Strings operations

	System.out.println(1 + 2 + "Hello \n");
	// The output is 3Hello,  Java performs automatic conversion

	// System class

	System.out.println(System.out);	// This line will show package and adress ( after @)

	/* Scanner class	
		- class other than System.out that provide us with method for inputting words, numbers and other data
	*/
	String line;
	Scanner in = new Scanner(System.in);

	System.out.print("Type Sommething: \n");
	line = in.nextLine();
	System.out.println("You said: " + line);

	// Fromatting Output

	System.out.printf("Four third = %.3f", 4.0/3.0);	// %.3f indicate that value should be displayed as float-point rounded to three decimal places

	// type casting

	double pi = 3.14159;
	int x = (int) pi;	//  (int) has an effect of converting what follows into an integer.

	}

}