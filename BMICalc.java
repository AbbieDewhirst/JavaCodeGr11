/*****************************************************************
**								**
** Name:	Abbie Dyck					**
** Date:	May 2nd, 2019					**
** Class Name:	BMICalc.java					**
** Description:	This class takes in the weight and height 	**
**		 of a person (using args), and calculates	**
**		 their BMI and decides if they are overweight	**
**		 underweight, or a normal weight.		**
**								**
******************************************************************/
package package1;

public class BMICalc {
	public static void main(String[] args) {
		double weight 	= 0;						//double variable for weight
		double height 	= 0;						//double variable for height
		double bmi 		= 0;					//double variable for BMI
		
		weight = Double.parseDouble(args[0]);				//parses args[0] which is weight
		height = Double.parseDouble(args[1]);				//parses args[1] which is height
		
		bmi = weight / (height*height);					//calculates total BMI
		
		if(bmi > 25) {							//test if BMI is over 25
			System.out.println("You are overweight.");		//prints if true
		}else if(bmi < 18.5){						//test if BMI is under 18.5
			System.out.println("You are underweight.");		//prints if true
		}else {								//if all the other test fail, you are a normal weight
			System.out.println("You are a normal weight."); 	//prints if true
		}// End if()
		
	}// End main()
	
}// End BMICalc()
