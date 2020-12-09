package package1;

public class MethodTest { //for example 1

	public static void main(String[] args) {
		//This is the main method. This is already created for you.
//		int hi = 0;
		
		myNewMethod();	//This is how you call a method
		myNewMethodWithInputs(1);	//This is how you call a method
//		hi = myNewMethodWithInputAndReturns(5);	//This is how you call a method
	}
	
	public static void myNewMethod() {
		//This is the method that I have created called myNewMethod.
		//This method takes in no data, and returns no data.
		
	}
	
	public static void myNewMethodWithInputs(int input) {
		//This is the method that I have created called myNewMethodWithInputs.
		//This method takes in a value called input, and returns nothing.
		
		input ++;
		
	}
	
	public static int myNewMethodWithInputAndReturns(int input) {
		 //This is the method that I have created called mynewMethodWithInputAndReturns
		//This method takes in a value called input, adds 1 to the number, then returns it.
		
		input ++;
		return input;
	}

}
