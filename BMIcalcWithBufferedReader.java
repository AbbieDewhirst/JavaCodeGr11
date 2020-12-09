/*****************************************************************
**								**
** Name:	Abbie Dyck					**
** Date:	May 23rd, 2019					**
** Class Name:	BMICalcWithBufferedReader.java			**
** Description:	Takes in values from a .txt file		**
**		and puts them into arrays. It then takes	**
**		these numbers and finds the BMI, and prints	**
**		out the persons name, height, weight and BMI	**
**		The program will keep on running until the	**
**		file is null. It will then print out a 		**
**		"BMI Report" with all of the users info		**
**								**
******************************************************************/
package package1;

import java.io.*;

public class BMIcalcWithBufferedReader {

	public static void main(String[] args) {

		int counter 		= 0;														//counter variable
		double bmi 		= 0.0;														//BMI variable
		double fatCounter 	= 0.0;														//fat weight counter variable
		double skinnyCounter 	= 0.0;														//skinny weight counter variable
		double normalCounter 	= 0.0;														//normal weight counter variable

		String[] BMIStatus 	= new String[99];												//BMI Status array
		String[] userNameArray 	= new String[99];												//userName array
		double[] heightArray 	= new double[99];												//height array
		double[] weightArray 	= new double[99];												//weight array
		String nameIn 		= "";														//nameIn variable to test if file is null
		
		try {
			BufferedReader bufferedObj = new BufferedReader (new FileReader("e:\\in.txt"));							//creates a buffered reader object
			nameIn = bufferedObj.readLine();												//reads in the first line of the file
			
			while(nameIn != null) {														//while loop so it can read in the users info until the file is null
							
				userNameArray[counter] = nameIn;											//makes the nameIn variable equal to the userNameArray
						
				heightArray[counter] = Double.parseDouble(bufferedObj.readLine());							//reads in the height from the file
				
				weightArray[counter] = Double.parseDouble(bufferedObj.readLine());							//reads in the weight from the file
				
				counter ++;														//adds 1 to the counter so we know the total number of inputs
				nameIn = bufferedObj.readLine();											//reads the userName again to test if the file is null
				
			}//End for()
			bufferedObj.close();														//close the bufferedReader object			
		} catch(IOException error) {														//catch to catch the exceptions
			System.out.println("You have a error: " + error);										//prints out the error
		}//End try()
								
		System.out.printf("BMI Report\n----------\nName\tHeight\tWeight\tBMI\tStatus\n");							//print out the report header
		System.out.printf("-----\t------\t------\t---\t-----\n");										//more report header
		
		for(int x = 0; x < counter; x++) {													//a for loop to print out the data
			
			bmi = weightArray[x] / (heightArray[x] * heightArray[x]) * 10000;								//calculates the persons BMI (per array)
			if (bmi > 25) {															//if their BMI is over 25
				BMIStatus[x] = "You are overweight.";											//print that they are overweight
				fatCounter ++;														//add 1 to the fat counter (to find the percent in the future)
			} else if (bmi < 18.5) {													//if their BMI is under 18.5
				BMIStatus[x] = "You are underweight.";											//print that they are underWeight
				skinnyCounter ++;													//add 1 to the skinny counter (to find the percent in the future)
			} else {															//else 
				BMIStatus[x] = "You are a normal weight.";										//print that they are a normal weight
				normalCounter ++;													//add 1 to the normal counter (to find the percent in the future)
			} // End if()
			
			if(!userNameArray[x].equals("FINISHED")) {											//if the user name isn't "FINISHED", print out their information below
				System.out.printf(userNameArray[x] + "\t" + "%.2f" + "\t" + "%.2f" + "\t" + "%.2f" + "\t" + BMIStatus[x] + "\n", heightArray[x], weightArray[x], bmi);
			} else {															//else, the user is done
				System.out.println();													//and it prints out nothing
			}//End if()
		}//End for(
		System.out.printf("-------\nSUMMARY\n");												//summary report
		System.out.printf("%2.0f" +  "%% are Fat\n", (fatCounter/counter)*100);									//prints percent that is overweight
		System.out.printf("%2.0f" +  "%% are Normal\n", (normalCounter/counter)*100);								//prints percent that is a normal weight
		System.out.printf("%2.0f" +  "%% are Skinny\n", (skinnyCounter/counter)*100);								//prints percent that is underWeight
	}// End main()
}//End BMIcalcWithBufferedReader()
