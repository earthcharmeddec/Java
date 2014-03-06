import java.util.*;
/**
* Creates a game where users try to guess the random number generated by the program.
* The program will help the user by narrowing the guessing range.
* @author Santhiya Holmes
*/
public class GuessingGame {
	public static final int MIN_NUMBER = 1;
	public static final int MAX_NUMBER = 100;
	/**
	* Calls its method to execute its program
	* @param args Command line arguments (not used)
	*/
	public static void main (String[] args) {
		guessAway();
	}
	/**
	* Uses a while loop to ask the user for an input and check the input for appropriate type.
	* Also creates a random number and asks the user to guess the number while changed the range the number belongs in.
	*/
	public static void guessAway() {
		Scanner console = new Scanner(System.in);
		Random rand = new Random();
		int randomNumber = rand.nextInt(MAX_NUMBER-MIN_NUMBER+1) + MIN_NUMBER; 
		int number1 = MIN_NUMBER;
		int number2 = MAX_NUMBER;
		System.out.println("Guess the secret number!");
		System.out.print("Enter a number between " + number1 + " and " + number2 + " (inclusive): " );
		
		int input = MAX_NUMBER + 1;
		while (input != randomNumber) {
			while (!console.hasNextInt()) {
				console.next();
				System.out.print("Enter a number between " + number1 + " and " + number2 + " (inclusive): " );
			}
			input = console.nextInt();
			if (input > randomNumber) {
				if (input < number2) {
					number2 = input - 1;
				}
				else {
					number2 = number2;
				}
				System.out.print("Enter a number between " + number1 + " and " + number2 + " (inclusive): " );
			}
			else if (input < randomNumber){
				if (input > number1) {
					number1 = input + 1;
				}
				else {
					number1 = number1;
				}
				System.out.print("Enter a number between " + number1 + " and " + number2 + " (inclusive): " );
			}
			else {
				System.out.println("You win!!");
			}
			
		}
		
	}
	}
