/*************************************************************
**															**
** Name:		Abbie Dyck									**
** Date:		May 5th, 2019								**
** Class Name:	BMICalcWithSensorsAndKBD.java				**
** Description:	Takes in values from the terminal			**
**				and puts them into variables. It then takes	**
**				these numbers and finds the BMI, and prints	**
**				out the persons name, height, weight and BMI**
**														    **
**************************************************************/
package package1;

import java.util.Scanner;

public class BMICalcWithScannerAndKBD {

	public static void main(String[] args) {

		double bmi = 0.0;

		Scanner scannerObj = new Scanner(System.in);					//creates a scanner object
		
		System.out.println("Enter username: ");							//print that tells user what to input
		String username = scannerObj.nextLine();						//reads what is input and puts it in variable userName
		
		System.out.println("Enter height in cm: ");						//print that tells user what to input
		int height = scannerObj.nextInt();								//reads what is input and puts it in variable height
		
		System.out.println("Enter weight: ");							//print that tells user what to input
		double weight = scannerObj.nextDouble();						//reads what is input and puts it in variable weight

		bmi = weight / (height * height) * 10000;						//finds BMI

		System.out.println("Hello " + username + ", you entered:");		//prints out userName

		System.out.println("Height " + height + " in CM.");				//prints out height

		System.out.println("Weight " + weight + " in KG");				//prints out weight

		System.out.println("Your calculated BMI is " + bmi);			//prints out BMI

		//depending on what your BMI is, it prints one of the following:
		if (bmi > 25) { 												// test if BMI is over 25
			System.out.println("You are overweight."); 					// prints if true
		} else if (bmi < 18.5) { 										// test if BMI is under 18.5
			System.out.println("You are underweight."); 				// prints if true
		} else { 														// if all the other test fail, you are a normal weight
			System.out.println("You are a normal weight."); 			// prints if true
		} // End if()
		scannerObj.close();														//closes the scanner
	}//End main()
}//Ends BMICalcWithScannerAndKBD
