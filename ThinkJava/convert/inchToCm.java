import java.util.Scanner;

class inchToCm{
	
	public static void main( String [] args ) { 

	int inch;
	double cm;
	double cmPerInch = 2.54;		// This number can be changed
	final double CM_PER_INCH = 2.54;	// This number can not be changed or Reassigned (final variable or constant)

	Scanner in = new Scanner(System.in);

	System.out.print("How many inches? ");
	inch = in.nextInt();

	// Convertion to cm

	cm = inch*cmPerInch;	
	System.out.print(inch + " in = ");
	System.out.println(cm + " cm");

	}

}