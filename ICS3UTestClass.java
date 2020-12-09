/*****************************************************************
** Name:	Abbie						**
** Date:	May 2nd, 2019					**
** Class Name:	ICS3UTestClass.java				**
** Description:	This is a class made for testing things 	**
**		such as prints with formatting, and args	**
**								**
******************************************************************/
package package1;

public class ICS3UTestClass {
	public static void main(String[] args) {

//		int x = 5; // x is used to print.... width
//		byte y = 0; // y is used to track height
//		short z = 0; // z is used to track length
//		long totalScore = 0; // tracks player score
//		double averageScore = 96.0000;
//		String myName = "Abbie";
		int sumOfNumbers = 0;
		double doubleCheeseburger = 0.0;

		doubleCheeseburger = Double.parseDouble(args[3]);
		sumOfNumbers = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);

		System.out.println(doubleCheeseburger);
		System.out.println(args[2] + sumOfNumbers);

		if (sumOfNumbers > 100) {
			System.out.println("More than 100");
		} else if(sumOfNumbers < 50){
			System.out.println("Less than 50");
		}else {
			System.out.println("Between 50 and 100");
		} // end if()

		// System.out.println("Hello World!");
		// System.out.print("Hello world a third time......");
		// System.out.println();
		// System.out.println(averageScore);
		// System.out.println(myName + " is " + x + " characters long");
		//
		// System.out.printf("This is a decimal number: %f!%nThis is a second decimal number: %d!", 10.25687, 15);// System.out.printf(format, arguments);
		// formatting: s-> strings, d-> Decimal integers, f-> floating point (decimals),
		// t-> date and time, n-> new line

		// System.out.printf("My message is: %3$d%4$s", 1, 2, 3, 'C');

	}// end Main

}// end class ISC3UTestClass
