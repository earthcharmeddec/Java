import java.util.*;
/**
* Creates a label with 4 lines of text from the user.
* @author Santhiya Holmes
*/
public class LabelMaker {
	public static final int SPACES_BETWEEN = 17;
	/**
	* Receives the input from the use and calls top, drawLable() to 
	* bottom() to draw the label.
	* @param args Command line argument (not used)
	*/
	public static void main (String [] args) {
		Scanner console = new Scanner (System.in);
		System.out.println("Please input 4 lines of text below.");
		System.out.print("Enter Line 1: ");
		String line1 = console.nextLine();
		System.out.print("Enter Line 2: ");
		String line2 = console.nextLine();
		System.out.print("Enter Line 3: ");
		String line3 = console.nextLine();
		System.out.print("Enter Line 4: ");
		String line4 = console.nextLine();
		
		top();
		drawLabel(line1,line2,line3,line4);
		bottom();
	}
	/**
	* Calls the perLine method with each of the input lines to obtain the 
	* right amount of spaces and then prints it out
	* @param line1 first line that the user input.
	* @param line2 second line that the user input.
	* @param line3 third line that the user input.
	* @param line4 fourth line that the user input.
	*/
	public static void drawLabel(String line1, String line2, String line3, String line4) {
	
		line1 = line1.toUpperCase();
		
		System.out.println(perLine(line1));
		System.out.println(line2 = perLine(line2));
		System.out.println(line3 = perLine(line3));
		System.out.println(line4 = perLine(line4));
			
	}
	/**
	* Uses a loop to insert spaces on either side of the line.
	* @param line line to add spaces around
	* return final line with spaces
	*/
	public static String perLine (String line) {
		
		int len = line.length();
		if (len%2==0) { //To check if the length is even. 
			line = line + " "; //If it is even, the spaces won't work out. So an extra space is added at the end.
		}
		for (int i=line.length(); i<SPACES_BETWEEN;i+=2){ /*increases every two since the length is 
								   increased by two when two spaces are added on either side */
			line = " " + line + " ";
		}
		line = "|" + line + "|";
		return line;
	
	}
	/**
	* Creates the top portion of the label that does not contain any letter in between
	*/
	public static void top() {
		lines();
		sides();
		sides();
		sides();
	}
	/**
	* Creates the bottom portion of the label that does not contain any letter in between
	*/	
	public static void bottom() {
		sides();
		sides();
		sides();
		lines();
	}
	/**
	* Creates the lines that have sides but nothing in between.
	*/
	public static void lines() {
		System.out.print("|");
		for (int i=1; i<=SPACES_BETWEEN; i++) {
			System.out.print("#");
		}
		System.out.println("|");
	}
	/**
	* Creates the top row and the bottom row of the label.
	*/
	public static void sides() {
		System.out.print("|");
		for (int i=1; i<=SPACES_BETWEEN; i++) {
			System.out.print(" ");
		}	
		System.out.println("|");
	}
	
	}
	