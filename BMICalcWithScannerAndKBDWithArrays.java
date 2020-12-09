/*****************************************************************
**								**
** Name:	Abbie Dyck					**
** Date:	May 5th, 2019					**
** Class Name:	BMICalcWithScannerAndKBDWithArrays.java		**
** Description:	Takes in values from the terminal		**
**		and puts them into arrays. It then takes	**
**		these numbers and finds the BMI, and prints	**
**		out the persons name, height, weight and BMI	**
**		The program will keep on running until the	**
**		user inputs "FINISHED" as the userName. It	**
**		will then print out a "BMI Report" with all 	**
**		of the users information.			**
**								**
******************************************************************/
package package1;

import java.util.Scanner;

public class BMICalcWithScannerAndKBDWithArrays {

	public static void main(String[] args) {

		int counter 		= 0;												//counter variable
		double bmi 		= 0.0;												//BMI variable
		double fatCounter 	= 0.0;												//fat weight counter variable
		double skinnyCounter 	= 0.0;												//skinny weight counter variable
		double normalCounter 	= 0.0;												//normal weight counter variable

		String[] BMIStatus 	= new String[99];										//BMI Status array
		String[] userNameArray 	= new String[99];										//userName array
		double[] heightArray 	= new double[99];										//height array
		double[] weightArray 	= new double[99];										//weight array

		Scanner scannerObj 	= new Scanner(System.in);									//creates a scanner object
			
		for(int x = 0; x < 99; x++) {												//for loop so the user can input info
			counter ++;													//adds 1 to the counter so we know the total number of inputs
			System.out.println("Enter username: ");										//print for the userName
			userNameArray[x] = scannerObj.next();										//takes in the info from the terminal
						
			if(!userNameArray[x].equals("FINISHED")) {									//if the user does not input "FINISHED' (they are't done yet)
				System.out.println("Enter height in cm: ");								//print for the height in CM
				heightArray[x] = Double.parseDouble(scannerObj.next());							//takes in the info from the terminal
				
				System.out.println("Enter weight: ");									//print for the weight
				weightArray[x] = Double.parseDouble(scannerObj.next());							//takes in the info from the terminal
				
			} else {													//else
				x = 100;												//make x = 100 to exit the for loop
			}//End if()
		}//End for()
		scannerObj.close();													//close the scanner object
		System.out.printf("\nBMI Report\n----------\nName\tHeight\tWeight\tBMI\tStatus\n");					//print out the report header
		System.out.printf("-----\t------\t------\t---\t-----\n");								//more report header
		
		for(int x = 0; x < counter; x++) {											//a for loop to print out the data
			
			bmi = weightArray[x] / (heightArray[x] * heightArray[x]) * 10000;						//calculates the persons BMI (per array)
			if (bmi > 25) {													//if their BMI is over 25
				BMIStatus[x] = "You are overweight.";									//print that they are overweight
				fatCounter ++;												//add 1 to the fat counter (to find the percent in the future)
			} else if (bmi < 18.5) {											//if their BMI is under 18.5
				BMIStatus[x] = "You are underweight.";									//print that they are underWeight
				skinnyCounter ++;											//add 1 to the skinny counter (to find the percent in the future)
			} else {													//else 
				BMIStatus[x] = "You are a normal weight.";								//print that they are a normal weight
				normalCounter ++;											//add 1 to the normal counter (to find the percent in the future)
			} // End if()
			
			if(!userNameArray[x].equals("FINISHED")) {									//if the user name isn't "FINISHED", print out their information below
				System.out.printf(userNameArray[x] + "\t" + "%.2f" + "\t" + "%.2f" + "\t" + "%.2f" + "\t" + BMIStatus[x] + "\n", heightArray[x], weightArray[x], bmi);
			} else {													//else, the user is done
				System.out.println();											//and it prints out nothing
			}//End if()
		}//End for(
		System.out.printf("-------\nSUMMARY\n");										//summary report
		System.out.printf("%2.0f" +  "%% are Fat\n", (fatCounter/counter)*100);							//prints percent that is overweight
		System.out.printf("%2.0f" +  "%% are Normal\n", (normalCounter/counter)*100);						//prints percent that is a normal weight
		System.out.printf("%2.0f" +  "%% are Skinny\n", (skinnyCounter/counter)*100);						//prints percent that is underWeight
	}// End main()
}// Ends BMICalcWithScannerAndKBDWithArrays
