import java.util.*;
/**
* Takes in an input from the user until a 0 has been entered, squares the input and displays the sum of the inputs squared.
* @author Santhiya Holmes
*/
public class PrintSumOfSquares {
	/**
	* Calls its method to execute the program
	*@param args Command line arguments (not used)
	*/
	public static void main (String[] args) {
		userInterface();	
	}
	
	/**
	* Uses a do while loop to ask the user for an input and check the input for appropriate type.
	* Using this input, the square for each of the input is calculated and the sum is displayed.
	*/
	public static void userInterface() {
	Scanner console = new Scanner(System.in);
	
	int input;
	int sumSquared = 0;
	
	do {
		System.out.print("Type an integer (0 to quit): ");
	while (!console.hasNextInt()) {
		console.next();
		System.out.println("Not an integer.");
		System.out.print("Type an integer (0 to quit): ");
	}
	
	input = console.nextInt();
	sumSquared += Math.pow(input,2);
	}while(input != 0);
	
	System.out.println( "The sum of the squares is " + sumSquared);
	
	}
}