//**************************************************************************
//**************************************************************************
//**                                                                      **
//**    Name           : Abbie Dyck                                       **
//**    Date           : 01/15/2018                                       **
//**    File Name      : BattleGameAD.java                                **
//**    Student Number : 36800668                                         **
//**    File Desc      : This game reads in the first line in the file,   **
//**                     which is the number of games, and puts it in a   **
//**                     variable called battleText. It then parses the   **
//**                     number and puts it in a variable called battle   **
//**                     number for later uses. It then reads in the      **
//**                     telling us what players have wihich battle"deck" **
//**                     each player has. We then have a bunch of if else **
//**                     statements to figure out how many HP each player **
//**                     has. We then print out all those numbers in the  **
//**                     form, "round 1, player 1/2 = total HP".          **
//**                                                                      **
//**************************************************************************
//**************************************************************************
import java.io.*;
public class BattleGameAD
{
    public static void main (String[] args)
    {
	String battleText; //This holds the battle number before converting it to a int
	int battleNumber = 0;// This holds the battle number once it is converted to a int
	String playerOne; //This is players one's battle deck
	String playerTwo; //This is player two's battle deck
	int playerOneHP = 0; //This is palyer one's hit points
	int playerTwoHP = 0; //This is players two's hit points
	
	try{
	    System.out.println ("Battle Game");
	    System.out.println ("-----------");
	    
	    BufferedReader inputFile = new BufferedReader (new FileReader("h://battle.txt"));
	    battleText = inputFile.readLine();
	    battleNumber = Integer.parseInt(battleText);
	    System.out.println ("Total of " + battleNumber + " battles");
	    
	    for (int x = battleNumber; x> 0; x--){
	    
		playerOne = inputFile.readLine();
		playerTwo = inputFile.readLine();
		
		for (int i = 0; i <=5 ;i++){
		    if ( playerOne.charAt(i*2) == 'K') {  
			playerOneHP = playerOneHP +  2;
		    } 
		    else if (playerOne.charAt(i*2) == 'F'){ 
			playerOneHP = playerOneHP + 1;
		    } 
		    else if (playerOne.charAt(i*2) == 'A'){ 
			playerOneHP = playerOneHP + 4;
		    }
		    else if (playerOne.charAt(i*2) == 'T'){ 
			playerOneHP = playerOneHP + 5; 
		    }
		    else if (playerOne.charAt(i*2) == 'S'){ 
			playerTwoHP = playerOneHP + 3;
		    }// this ends the if else ladder for player 1 to figure out how many HP they have
		    if ( playerTwo.charAt(i*2) == 'K') {  
			playerTwoHP = playerTwoHP +  2;
		    } 
		    else if (playerTwo.charAt(i*2) == 'F'){ 
			playerTwoHP = playerTwoHP + 1;
		    } 
		    else if (playerTwo.charAt(i*2) == 'A'){ 
			playerTwoHP = playerTwoHP + 4;
		    }
		    else if (playerTwo.charAt(i*2) == 'T'){ 
			playerTwoHP = playerTwoHP + 5; 
		    }
		    else if (playerTwo.charAt(i*2) == 'S'){ 
			playerTwoHP = playerTwoHP + 3;
		    } // this ends the if else ladder for player 2 to figure out how many HP they have
		}//this ends the for  loop that calculates the HP for each player, and for how many lines
		System.out.println ("Battle " + (battleNumber - x + 1) + ",Player 1: Strength of " + playerOneHP);
		System.out.println ("Battle " + (battleNumber - x + 1) + ",Player 2: Strength of " + playerTwoHP);
		 if (playerOneHP > playerTwoHP){
		    System.out.println ("Battle " + (battleNumber - x + 1) + " Winner  : Player 1" + "\n"); 
		 }
		 else if(playerTwoHP > playerOneHP){
		    System.out.println ("Battle " + (battleNumber - x + 1) + " Winner  : Player 2" + "\n");
		 }
		 else{
		    System.out.println ("Battle " + (battleNumber - x +1) + " Winner  : Tie battle" + "\n");
		 }//this ends the if else statement that figures out if player one of two won, or if it was a tie
		 playerOneHP = 0;
		 playerTwoHP = 0;
	    }//this ends the for loop that calculates how many times the loop needs to run
	    
	    System.out.println ("END OF BATTLE");
	    inputFile.close();
	}// this ends the try that runs the main code
	catch(IOException error){
	    System.out.println ("There was a error: ");
	    System.out.println (error);
	}// this ends the catch that can catch a error if we have one
    } //This ends the main method
} //This ends the BattleGameAD class
