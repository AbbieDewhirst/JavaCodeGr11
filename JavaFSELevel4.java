/*****************************************************************
**								**
** Name:	Abbie Dyck					**
** Date:	June 4th, 2019					**
** Class Name:	JavaFSELevel4.java				**
** Description:	This code is designed to read in numbers 	**
**		from a file that will tell it how big the 	**
**		special square will be. Then it will read	**
**		in the numbers of the square, and turn them	**
**		into the square. It will find the sum of	**
**		the columns, rows, and the main 2 diagonals.	**
**		If the sums are the same, it will print the	**
**		sum out below the print of the square. If	**
**		the columns, rows and diagonals aren't		**
**		equal, it'll output '-1'.			**
**							    	**
******************************************************************/
package package1;

import java.io.*;

public class JavaFSELevel4 {

	public static void main(String[] args) {

		int fileLength 	= 0;							//Variable to keep track of the length of the file (how long is the row/column)
		int colSum 	= 0;							//Variable to keep track of the sum of each column
		int rowSum 	= 0;							//Variable to keep track of the sum of each row
		int diagSum 	= 0;							//Variable to keep track of the sum of the first main diagonal
		int diag2Sum 	= 0;							//Variable to keep track of the sum of the second main diagonal
		int areEqual 	= 0;							//Variable to see if the variables are equal to each other

		try {

			BufferedReader bufferedObj = new BufferedReader(new FileReader("e:\\Level4FSE.txt" ));		//Creates a buffered reader object and file path

			fileLength = Integer.parseInt(bufferedObj.readLine());						//Makes the file length equal to the first number in the file

			int[][] specialSquareArray = new int[fileLength][fileLength];					//Makes a special square array to keep track of all the numbers in the square
			System.out.println("Special Square");								//Prints "Special Square" for the header of the output
			System.out.println("--------------");								//Prints some lines for the header of the output

			for (int x = 0; x < fileLength; x++) {								//For loop to go through the columns of the array to print out the square
				for (int i = 0; i < fileLength; i++) {							//For loop to go through the rows of the array to print out the square

					specialSquareArray[i][x] = Integer.parseInt(bufferedObj.readLine());		//Puts all of the numbers in the file into the square format
					System.out.print(specialSquareArray[i][x] + " ");				//Prints out each number in the square pattern
				} // End for()
				System.out.println("");									//Spaces out the square correctly
			} // End for()

			bigLoop: for (int x = 0; x < 1; x++) {								//A for loop to find the sum of each row, column and array (named bigLoop)

				for (int col = 0; col < fileLength; col++) {						//For loop to add up each number in the columns
					for (int row = 0; row < fileLength; row++) {
						colSum += specialSquareArray[row][col];					//Adds each number to the colSum
					} // End for()
					if (col == 0) {																				
						areEqual = colSum;							//Makes the first column in the array equal to 'areEqual', because all numbers should be equal to this, and if they aren't its not a special square
					}//End if()
					if (areEqual != colSum) {							//Test to see if the numbers are equal
						areEqual = -1;								//If not equal, it sets 'areEqual' to -1
						break bigLoop;								//And breaks out of the big loop, because it does not need to check the other numbers
					}//End if()
					colSum = 0;									//Sets colSum to 0 so they can check the next column
				} // End for()

				for (int row = 0; row < fileLength; row++) {						//For loop to add up each number in the rows
					for (int col = 0; col < fileLength; col++) {
						rowSum += specialSquareArray[row][col];					//Adds up each number to the rowSum
					} // End for()
					if (areEqual != rowSum) {							//Test to see if the numbers are equal
						areEqual = -1;								//If not equal, it sets 'areEqual' to -1
						break bigLoop;								//And breaks out of the big loop, because it does not need to check the other numbers
					}//End if()
					rowSum = 0;									//Sets rowSum to 0 so you can check the next row
				} // End for()

				// ADDS UP NUMBERS IN THE 1ST DIAG
				for (int diag = 0; diag < fileLength; diag++) {						//For loop to add up each number in the 1st diagonal
					diagSum += specialSquareArray[diag][diag];					//Adds up each number in the diagonal
				} // End for()
				if (diagSum != areEqual) {								//Test to see if the numbers are equal
					areEqual = -1;									//If not equal, it sets 'areEqual' to -1
					break bigLoop;									//And breaks out of the big loop, because it does not need to check the other numbers
				}//End if()

				// ADDS UP NUMBERS IN THE 2ND DIAG
				for (int diag2 = fileLength; diag2 > 0; diag2--) {					//For loop to add up each number in the 2nd diagonal
					diag2Sum += specialSquareArray[diag2 - 1][fileLength - diag2];			//Adds up each number in the 2nd diagonal
				}//End for()
				if (diag2Sum != areEqual) {								//Test to see if the numbers are equal
					areEqual = -1;									//If not equal, it sets 'areEqual' to -1
					break bigLoop;									//And breaks out of the big loop, because it does not need to check the other numbers
				}//End if()
			}//End bigLoop: for()
			System.out.println("Special Square = " + areEqual);						//Prints out the end of the output, which is the value of all the numbers. If its not a special square, the output will be -1
			bufferedObj.close();										//Closes the buffered reader
		} catch (IOException error) {
			System.out.println("You have a error: " + error);						//Prints out any errors that may have been caught
		} // End try and catch()
	}// End main()
}// End JavaFSELevel4()
